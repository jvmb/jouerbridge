package com.jvmb.jouerbridge.controller;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;

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

        VueTable vt = new VueTable(mtbInput);

        session.setAttribute(INFO_SESSION, vt);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);
        model.addAttribute("serverTime", formattedDate);
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

        // TODO - Travailler les cartes
        VueTable vt = (VueTable) session.getAttribute(INFO_SESSION);

        // Trouver la bonne main
        switch (direction) {
        case "S":
            vt.getMainSud().remove(carte);
            vt.setCarteSud(carte);
            break;
        case "O":
            vt.getMainOuest().remove(carte);
            vt.setCarteOuest(carte);
            break;
        case "N":
            vt.getMainNord().remove(carte);
            vt.setCarteNord(carte);
            break;
        case "E":
            vt.getMainEst().remove(carte);
            vt.setCarteEst(carte);
            break;

        default:
            // TODO - traitement erreur

        }

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);
        model.addAttribute("serverTime", formattedDate);
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
