package com.jvmb.jouerbridge.controller;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.lang3.SerializationUtils;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.persistence.jaxb.UnmarshallerProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
     * @param session
     * @return
     */
    @RequestMapping(value = "/homejsp", method = RequestMethod.GET)
    public String getHomeJsp(Model model, HttpSession session) {
        logger.info("getHomeJsp()");

        // On reset l'objet INFO_SESSION
        session.removeAttribute(INFO_SESSION);
        LinkedList<VueTable> lvt = new LinkedList<VueTable>();
        VueTable vt = new VueTable();
        lvt.add(vt);

        session.setAttribute(INFO_SESSION, lvt);

        model.addAttribute("mainVue", vt);
        model.addAttribute("mainErreur", "");

        return "homejsp";
    }

    /**
     * 
     * @param filebridge
     * @param model
     * @param session
     * @param request
     * @return
     */
    @RequestMapping(value = "/loaderfichier", method = RequestMethod.POST)
    public String loaderFichier(@RequestParam("filebridge") MultipartFile filebridge, Model model, HttpSession session, HttpServletRequest request) {
        logger.info("loaderFichier()");

        StockageTable mtbInput = null;
        String erreurMsg = "";

        if (!filebridge.isEmpty()) {
            try {
                logger.info("Original name: " + filebridge.getOriginalFilename());

                String uploadsDir = "/uploads/";

                String realPathtoUploads = request.getServletContext().getRealPath(uploadsDir);
                if (!new File(realPathtoUploads).exists()) {
                    new File(realPathtoUploads).mkdir();
                }

                String orgName = filebridge.getOriginalFilename();
                String filePathandname = realPathtoUploads + orgName;

                logger.info("filepath + Original name: " + filePathandname);

                File fileInput = new File(filePathandname);
                filebridge.transferTo(fileInput);

                // Create a JaxBContext
                JAXBContext jcInput = JAXBContext.newInstance(StockageTable.class);

                // Create the Unmarshaller Object using the JaxB Context
                Unmarshaller unmarshaller = jcInput.createUnmarshaller();

                // Set the Unmarshaller media type to JSON or XML
                unmarshaller.setProperty(UnmarshallerProperties.MEDIA_TYPE, "application/json");

                // Set it to true if you need to include the JSON root element
                // in the JSON input
                unmarshaller.setProperty(UnmarshallerProperties.JSON_INCLUDE_ROOT, true);

                mtbInput = (StockageTable) unmarshaller.unmarshal(fileInput);

            } catch (PropertyException e) {
                erreurMsg = "PropertyException: " + StringUtils.defaultString(e.getMessage());
            } catch (JAXBException e) {
                erreurMsg = "JAXBException - fichier probablement invalide " + StringUtils.defaultString(e.getMessage());
            } catch (IllegalStateException e) {
                erreurMsg = "PropertyException: " + StringUtils.defaultString(e.getMessage());
            } catch (IOException e) {
                erreurMsg = "PropertyException: " + StringUtils.defaultString(e.getMessage());
            }
        } else {
            erreurMsg = "Il n'y a aucun ficher de choisi!";
        }

        // On reset l'objet INFO_SESSION
        session.removeAttribute(INFO_SESSION);
        // Creation de la list des etats du jeu
        LinkedList<VueTable> lvt = new LinkedList<VueTable>();
        VueTable vt = null;
        if (mtbInput != null) {
            vt = new VueTable(mtbInput);
        } else {
            vt = new VueTable();
        }
        lvt.add(vt);
        session.setAttribute(INFO_SESSION, lvt);
        model.addAttribute("mainVue", vt);
        model.addAttribute("mainErreur", erreurMsg);

        return "homejsp";
    }

    /**
     * 
     * @param direction
     * @param carte
     * @param model
     * @param session
     * @return
     */
    @RequestMapping(value = "/jouer", method = RequestMethod.GET)
    public String jouerUneCarte(@RequestParam(value = "direction", required = true) String direction,
            @RequestParam(value = "carte", required = true) Integer carte, ModelMap model, HttpSession session) {

        @SuppressWarnings("unchecked")
        LinkedList<VueTable> lvt = (LinkedList<VueTable>) session.getAttribute(INFO_SESSION);

        String erreurMsg = "";
        VueTable vtClone = null;
        VueTable vt = lvt.getLast();

        if (!vt.isVueTableEmpty()) {

            // Faire copie du dernier
            vtClone = SerializationUtils.clone((VueTable) vt);

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

            }
            // Ajouter le nouvel etat à list
            lvt.add(vtClone);
        } else {
            erreurMsg = "Il n'y a pas de main de charger!";
            vtClone = vt;
        }

        model.addAttribute("mainVue", vtClone);
        model.addAttribute("mainErreur", erreurMsg);

        return "homejsp";

    }

    /**
     * 
     * @param direction
     * @param model
     * @param session
     * @return
     */
    @RequestMapping(value = "/pli", method = RequestMethod.GET)
    public String pliAUneEquipe(@RequestParam(value = "direction", required = true) String direction, Model model, HttpSession session) {

        @SuppressWarnings("unchecked")
        LinkedList<VueTable> lvt = (LinkedList<VueTable>) session.getAttribute(INFO_SESSION);

        String erreurMsg = "";
        VueTable vt = lvt.getLast();

        if (!vt.isVueTableEmpty()) {
            if (lvt.size() >= 2) {

                VueTable vtClone = null;

                // Faire copie du dernier
                vtClone = SerializationUtils.clone((VueTable) vt);

                vtClone.setCarteSud(Carte.VIDE.getRang());
                vtClone.setCarteOuest(Carte.VIDE.getRang());
                vtClone.setCarteNord(Carte.VIDE.getRang());
                vtClone.setCarteEst(Carte.VIDE.getRang());

                switch (direction) {
                case "NS":
                    vtClone.setPliNS(vtClone.getPliNS() + 1);
                    break;
                case "EO":
                    vtClone.setPliEO(vtClone.getPliEO() + 1);
                    break;
                default:
                    erreurMsg = "Problème pliAUneEquipe()!!";

                }

                // Ajout à la liste
                lvt.add(vtClone);
                model.addAttribute("mainVue", vtClone);
            } else {
                erreurMsg = "Vous êtes au début du jeu, aucun pli à ajouter!";
                model.addAttribute("mainVue", vt);
            }

        } else {
            erreurMsg = "Il n'y a pas de main de charger!";

        }

        model.addAttribute("mainErreur", erreurMsg);

        return "homejsp";

    }

    /**
     * 
     * @param model
     * @param session
     * @return
     */
    @RequestMapping(value = "/retour", method = RequestMethod.GET)
    public String retourEtatPrec(Model model, HttpSession session) {

        @SuppressWarnings("unchecked")
        LinkedList<VueTable> lvt = (LinkedList<VueTable>) session.getAttribute(INFO_SESSION);

        String erreurMsg = "";
        VueTable vt = lvt.getLast();

        if (!vt.isVueTableEmpty()) {
            if (lvt.size() >= 2) {
                // Enleve le dernier
                lvt.removeLast();
                // recup le précédent
                vt = lvt.getLast();
            } else {
                erreurMsg = "Vous êtes au début du jeu, le retour est impossible!";
            }
        } else {
            erreurMsg = "Il n'y a pas de main de charger!";
        }

        model.addAttribute("mainVue", vt);
        model.addAttribute("mainErreur", erreurMsg);

        return "homejsp";

    }
}
