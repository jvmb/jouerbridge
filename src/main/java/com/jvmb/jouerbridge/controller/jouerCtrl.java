package com.jvmb.jouerbridge.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.eclipse.persistence.jaxb.MarshallerProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jvmb.jouerbridge.model.Carte;
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
     */

    @RequestMapping(value = "/homejsp", method = RequestMethod.GET)
    public String getHomeJsp(Model model, Locale locale, HttpSession session) {
        logger.info("getHomeJsp()");

        // session.invalidate();

        VueTable vt = new VueTable();

        // TODO - monter main
        vt.getMainSud().add(Carte.AP.getRang());
        vt.getMainSud().add(Carte.DP.getRang());
        vt.getMainSud().add(Carte._6P.getRang());
        vt.getMainSud().add(Carte._4P.getRang());
        vt.getMainSud().add(Carte.VC.getRang());
        vt.getMainSud().add(Carte._6C.getRang());
        vt.getMainSud().add(Carte._5C.getRang());
        vt.getMainSud().add(Carte.RK.getRang());
        vt.getMainSud().add(Carte.VK.getRang());
        vt.getMainSud().add(Carte._5K.getRang());
        vt.getMainSud().add(Carte._9T.getRang());
        vt.getMainSud().add(Carte._8T.getRang());
        vt.getMainSud().add(Carte._6T.getRang());

        vt.getMainOuest().add(Carte._10P.getRang());
        vt.getMainOuest().add(Carte._9P.getRang());
        vt.getMainOuest().add(Carte._7P.getRang());
        vt.getMainOuest().add(Carte._3P.getRang());
        vt.getMainOuest().add(Carte._10C.getRang());
        vt.getMainOuest().add(Carte._9C.getRang());
        vt.getMainOuest().add(Carte._7C.getRang());
        vt.getMainOuest().add(Carte.DK.getRang());
        vt.getMainOuest().add(Carte._8K.getRang());
        vt.getMainOuest().add(Carte._2K.getRang());
        vt.getMainOuest().add(Carte._7T.getRang());
        vt.getMainOuest().add(Carte._4T.getRang());
        vt.getMainOuest().add(Carte._2T.getRang());

        vt.getMainNord().add(Carte.RP.getRang());
        vt.getMainNord().add(Carte._5P.getRang());
        vt.getMainNord().add(Carte._2P.getRang());
        vt.getMainNord().add(Carte.RC.getRang());
        vt.getMainNord().add(Carte.DC.getRang());
        vt.getMainNord().add(Carte._4C.getRang());
        vt.getMainNord().add(Carte._9K.getRang());
        vt.getMainNord().add(Carte._6K.getRang());
        vt.getMainNord().add(Carte.AT.getRang());
        vt.getMainNord().add(Carte.DT.getRang());
        vt.getMainNord().add(Carte.VT.getRang());
        vt.getMainNord().add(Carte._10T.getRang());
        vt.getMainNord().add(Carte._5T.getRang());

        vt.getMainEst().add(Carte.VP.getRang());
        vt.getMainEst().add(Carte._8P.getRang());
        vt.getMainEst().add(Carte.AC.getRang());
        vt.getMainEst().add(Carte._8C.getRang());
        vt.getMainEst().add(Carte._3C.getRang());
        vt.getMainEst().add(Carte._2C.getRang());
        vt.getMainEst().add(Carte.AK.getRang());
        vt.getMainEst().add(Carte._10K.getRang());
        vt.getMainEst().add(Carte._7K.getRang());
        vt.getMainEst().add(Carte._4K.getRang());
        vt.getMainEst().add(Carte._3K.getRang());
        vt.getMainEst().add(Carte.RT.getRang());
        vt.getMainEst().add(Carte._3T.getRang());

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

        // List<Integer> mainTraite = null;

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

        StockageTable mtb = new StockageTable();

        mtb.getMainSud().add(1);
        mtb.getMainOuest().add(2);
        mtb.getMainNord().add(3);
        mtb.getMainEst().add(4);

        // Create a JaxBContext
        JAXBContext jc = JAXBContext.newInstance(StockageTable.class);
        // Create the Marshaller Object using the JaxB Context
        Marshaller marshaller = jc.createMarshaller();
        // Set the Marshaller media type to JSON or XML
        marshaller.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");

        // Set it to true if you need to include the JSON root element in the
        // JSON output
        marshaller.setProperty(MarshallerProperties.JSON_INCLUDE_ROOT, true);

        // Set it to true if you need the JSON output to formatted
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // Marshal the employee object to JSON and print the output to console
        marshaller.marshal(mtb, System.out);

    }
}
