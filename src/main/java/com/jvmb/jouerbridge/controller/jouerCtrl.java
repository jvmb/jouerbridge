package com.jvmb.jouerbridge.controller;

import java.io.File;
import java.util.LinkedList;
import java.util.Locale;

import javax.servlet.http.HttpSession;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.lang3.SerializationUtils;
import org.eclipse.persistence.jaxb.UnmarshallerProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jvmb.jouerbridge.model.StockageTable;
import com.jvmb.jouerbridge.model.VueTable;

@Controller
public class jouerCtrl {

    private static final Logger logger = LoggerFactory.getLogger(jouerCtrl.class);

    private static String INFO_SESSION = "infosession";

    /**
     * 
     * @param model
     * @param locale
     * @param session
     * @return
     * @throws JAXBException
     */

    @RequestMapping(value = "/homejsp", method = RequestMethod.GET)
    public String getHomeJsp(Model model, Locale locale, HttpSession session) {
        logger.info("getHomeJsp()");

        String fileMarsh = "/Users/marcbeaulieu/developpement/jouerbridge/mainTable.json";
        File fileInput = new File(fileMarsh);
        StockageTable mtbInput = null;

        try {
            // Create a JaxBContext
            JAXBContext jcInput = JAXBContext.newInstance(StockageTable.class);

            // Create the Unmarshaller Object using the JaxB Context
            Unmarshaller unmarshaller = jcInput.createUnmarshaller();

            // Set the Unmarshaller media type to JSON or XML
            unmarshaller.setProperty(UnmarshallerProperties.MEDIA_TYPE, "application/json");

            // Set it to true if you need to include the JSON root element in
            // the
            // JSON input
            unmarshaller.setProperty(UnmarshallerProperties.JSON_INCLUDE_ROOT, true);

            mtbInput = (StockageTable) unmarshaller.unmarshal(fileInput);
        } catch (PropertyException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // On reset l'objet INFO_SESSION
        session.removeAttribute(INFO_SESSION);
        // Creation de la list des etats du jeu
        LinkedList<VueTable> lvt = new LinkedList<VueTable>();
        VueTable vt = new VueTable(mtbInput);
        lvt.add(vt);

        session.setAttribute(INFO_SESSION, lvt);

        model.addAttribute("mainVue", vt);

        return "homejsp";
    }

    /**
     * 
     * @param direction
     * @param carte
     * @param model
     * @param locale
     * @param session
     * @return
     */
    @RequestMapping(value = "/jouer", method = RequestMethod.GET)
    public String jouerUneCarte(@RequestParam(value = "direction", required = true) String direction,
            @RequestParam(value = "carte", required = true) Integer carte, ModelMap model, Locale locale, HttpSession session) {

        @SuppressWarnings("unchecked")
        LinkedList<VueTable> lvt = (LinkedList<VueTable>) session.getAttribute(INFO_SESSION);
        VueTable vt = lvt.getLast();

        // Faire copie du dernier
        VueTable vtClone = SerializationUtils.clone((VueTable) vt);

        // Trouver la bonne main - et appliqué changement
        switch (direction) {
        case "S":
            vtClone.getMainSud().remove(carte);
            vtClone.setCarteSud(carte);
            break;
        case "O":
            vtClone.getMainOuest().remove(carte);
            vtClone.setCarteOuest(carte);
            break;
        case "N":
            vtClone.getMainNord().remove(carte);
            vtClone.setCarteNord(carte);
            break;
        case "E":
            vtClone.getMainEst().remove(carte);
            vtClone.setCarteEst(carte);
            break;

        default:
            // TODO - traitement erreur

        }

        // Ajouter le nouvel etat à list
        lvt.add(vtClone);

        model.addAttribute("mainVue", vtClone);

        return "homejsp";

    }

    /**
     * 
     * @param model
     * @param locale
     * @param session
     * @return
     */
    @RequestMapping(value = "/retour", method = RequestMethod.GET)
    public String retourEtatPrec(Model model, Locale locale, HttpSession session) {

        // TODO - verif si au moins 2 élément

        @SuppressWarnings("unchecked")
        LinkedList<VueTable> lvt = (LinkedList<VueTable>) session.getAttribute(INFO_SESSION);
        // Enleve le dernier
        lvt.removeLast();
        // recup le précédent
        VueTable vt = lvt.getLast();

        model.addAttribute("mainVue", vt);

        return "homejsp";

    }

    public static void main(String[] args) throws JAXBException {
        // https://examples.javacodegeeks.com/core-java/xml/bind/jaxb-json-example/

        // MARSHALL
        String fileMarsh = "/Users/marcbeaulieu/developpement/jouerbridge/mainTable.json";
        // File fileOutput = new File(fileMarsh);
        //
        // StockageTable mtbOutput = new StockageTable();
        //
        // mtbOutput.setMainSudPique("A,7,3");
        // mtbOutput.setMainSudCoeur("A,K,10,4");
        // mtbOutput.setMainSudCarreau("K,9,8");
        // mtbOutput.setMainSudTrefle("Q,J,4");
        //
        // mtbOutput.setMainOuestPique("K,Q,J,9,8");
        // mtbOutput.setMainOuestCoeur("Q,8,7");
        // mtbOutput.setMainOuestCarreau("4,3,2");
        // mtbOutput.setMainOuestTrefle("6,2");
        //
        // mtbOutput.setMainNordPique("10,5");
        // mtbOutput.setMainNordCoeur("J,9");
        // mtbOutput.setMainNordCarreau("A,J,10,7");
        // mtbOutput.setMainNordTrefle("A,10,9,7,3");
        //
        // mtbOutput.setMainEstPique("6,4,2");
        // mtbOutput.setMainEstCoeur("6,5,3,2");
        // mtbOutput.setMainEstCarreau("Q,6,5");
        // mtbOutput.setMainEstTrefle("K,8,5");
        //
        // mtbOutput.setDonneur("S");
        // mtbOutput.setEncheres("encheres");
        // mtbOutput.setNotes("notes");
        // mtbOutput.setVulnerabilite("vulnerabilite");
        //
        // // Create a JaxBContext
        // JAXBContext jcOutput = JAXBContext.newInstance(StockageTable.class);
        // // Create the Marshaller Object using the JaxB Context
        // Marshaller marshaller = jcOutput.createMarshaller();
        // // Set the Marshaller media type to JSON or XML
        // marshaller.setProperty(MarshallerProperties.MEDIA_TYPE,
        // "application/json");
        //
        // // Set it to true if you need to include the JSON root element in the
        // // JSON output
        // marshaller.setProperty(MarshallerProperties.JSON_INCLUDE_ROOT, true);
        //
        // // Set it to true if you need the JSON output to formatted
        // marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        //
        // // Marshal the employee object to JSON and print the output to
        // // console
        // marshaller.marshal(mtbOutput, System.out);
        // marshaller.marshal(mtbOutput, fileOutput);

        // UNMARSHALL
        File fileInput = new File(fileMarsh);

        // Create a JaxBContext
        JAXBContext jcInput = JAXBContext.newInstance(StockageTable.class);

        // Create the Unmarshaller Object using the JaxB Context
        Unmarshaller unmarshaller = jcInput.createUnmarshaller();

        // Set the Unmarshaller media type to JSON or XML
        unmarshaller.setProperty(UnmarshallerProperties.MEDIA_TYPE, "application/json");

        // Set it to true if you need to include the JSON root element in the
        // JSON input
        unmarshaller.setProperty(UnmarshallerProperties.JSON_INCLUDE_ROOT, true);

        StockageTable mtbInput = (StockageTable) unmarshaller.unmarshal(fileInput);
        System.out.println("=================");
        System.out.println(mtbInput);

    }
}
