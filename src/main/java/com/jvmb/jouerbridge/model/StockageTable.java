package com.jvmb.jouerbridge.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * Classe pour marshaller main de bridge dans un ficher.
 * 
 * 
 * 
 * @author marcbeaulieu
 *
 */
@XmlRootElement
public class StockageTable {

    private String mainSudPique;
    private String mainSudCoeur;
    private String mainSudCarreau;
    private String mainSudTrefle;
    private String mainOuestPique;
    private String mainOuestCoeur;
    private String mainOuestCarreau;
    private String mainOuestTrefle;
    private String mainNordPique;
    private String mainNordCoeur;
    private String mainNordCarreau;
    private String mainNordTrefle;
    private String mainEstPique;
    private String mainEstCoeur;
    private String mainEstCarreau;
    private String mainEstTrefle;

    public String getMainSudPique() {
        return mainSudPique;
    }

    public void setMainSudPique(String mainSudPique) {
        this.mainSudPique = mainSudPique;
    }

    public String getMainSudCoeur() {
        return mainSudCoeur;
    }

    public void setMainSudCoeur(String mainSudCoeur) {
        this.mainSudCoeur = mainSudCoeur;
    }

    public String getMainSudCarreau() {
        return mainSudCarreau;
    }

    public void setMainSudCarreau(String mainSudCarreau) {
        this.mainSudCarreau = mainSudCarreau;
    }

    public String getMainSudTrefle() {
        return mainSudTrefle;
    }

    public void setMainSudTrefle(String mainSudTrefle) {
        this.mainSudTrefle = mainSudTrefle;
    }

    public String getMainOuestPique() {
        return mainOuestPique;
    }

    public void setMainOuestPique(String mainOuestPique) {
        this.mainOuestPique = mainOuestPique;
    }

    public String getMainOuestCoeur() {
        return mainOuestCoeur;
    }

    public void setMainOuestCoeur(String mainOuestCoeur) {
        this.mainOuestCoeur = mainOuestCoeur;
    }

    public String getMainOuestCarreau() {
        return mainOuestCarreau;
    }

    public void setMainOuestCarreau(String mainOuestCarreau) {
        this.mainOuestCarreau = mainOuestCarreau;
    }

    public String getMainOuestTrefle() {
        return mainOuestTrefle;
    }

    public void setMainOuestTrefle(String mainOuestTrefle) {
        this.mainOuestTrefle = mainOuestTrefle;
    }

    public String getMainNordPique() {
        return mainNordPique;
    }

    public void setMainNordPique(String mainNordPique) {
        this.mainNordPique = mainNordPique;
    }

    public String getMainNordCoeur() {
        return mainNordCoeur;
    }

    public void setMainNordCoeur(String mainNordCoeur) {
        this.mainNordCoeur = mainNordCoeur;
    }

    public String getMainNordCarreau() {
        return mainNordCarreau;
    }

    public void setMainNordCarreau(String mainNordCarreau) {
        this.mainNordCarreau = mainNordCarreau;
    }

    public String getMainNordTrefle() {
        return mainNordTrefle;
    }

    public void setMainNordTrefle(String mainNordTrefle) {
        this.mainNordTrefle = mainNordTrefle;
    }

    public String getMainEstPique() {
        return mainEstPique;
    }

    public void setMainEstPique(String mainEstPique) {
        this.mainEstPique = mainEstPique;
    }

    public String getMainEstCoeur() {
        return mainEstCoeur;
    }

    public void setMainEstCoeur(String mainEstCoeur) {
        this.mainEstCoeur = mainEstCoeur;
    }

    public String getMainEstCarreau() {
        return mainEstCarreau;
    }

    public void setMainEstCarreau(String mainEstCarreau) {
        this.mainEstCarreau = mainEstCarreau;
    }

    public String getMainEstTrefle() {
        return mainEstTrefle;
    }

    public void setMainEstTrefle(String mainEstTrefle) {
        this.mainEstTrefle = mainEstTrefle;
    }

    @Override
    public String toString() {
        return "StockageTable [mainSudPique=" + mainSudPique + ", mainSudCoeur=" + mainSudCoeur + ", mainSudCarreau=" + mainSudCarreau + ", mainSudTrefle="
                + mainSudTrefle + ",\n\nmainOuestPique=" + mainOuestPique + ", mainOuestCoeur=" + mainOuestCoeur + ", mainOuestCarreau=" + mainOuestCarreau
                + ", mainOuestTrefle=" + mainOuestTrefle + ",\n\nmainNordPique=" + mainNordPique + ", mainNordCoeur=" + mainNordCoeur + ", mainNordCarreau="
                + mainNordCarreau + ", mainNordTrefle=" + mainNordTrefle + ",\n\nmainEstPique=" + mainEstPique + ", mainEstCoeur=" + mainEstCoeur
                + ", mainEstCarreau=" + mainEstCarreau + ", mainEstTrefle=" + mainEstTrefle + "]";
    }

}
