package com.jvmb.jouerbridge.model;

import java.util.LinkedList;
import java.util.List;

/**
 * Modèle POJO pour affciher une planchette de bridge et des notes.
 * 
 * 
 * 
 * @author marcbeaulieu
 *
 */
public class PlanchetteBridge {

    // main sud
    private List<String> sudPiques = new LinkedList<String>();
    private List<String> sudCoeurs = new LinkedList<String>();
    private List<String> sudCarreaux = new LinkedList<String>();
    private List<String> sudTrefles = new LinkedList<String>();

    // main ouest
    private List<String> ouestPiques = new LinkedList<String>();
    private List<String> ouestCoeurs = new LinkedList<String>();
    private List<String> ouestCarreaux = new LinkedList<String>();
    private List<String> ouestTrefles = new LinkedList<String>();

    // main nord
    private List<String> nordPiques = new LinkedList<String>();
    private List<String> nordCoeurs = new LinkedList<String>();
    private List<String> nordCarreaux = new LinkedList<String>();
    private List<String> nordTrefles = new LinkedList<String>();

    // main est
    private List<String> estPiques = new LinkedList<String>();
    private List<String> estCoeurs = new LinkedList<String>();
    private List<String> estCarreaux = new LinkedList<String>();
    private List<String> estTrefles = new LinkedList<String>();

    public List<String> getSudPiques() {
        return sudPiques;
    }

    public void setSudPiques(List<String> sudPiques) {
        this.sudPiques = sudPiques;
    }

    public List<String> getSudCoeurs() {
        return sudCoeurs;
    }

    public void setSudCoeurs(List<String> sudCoeurs) {
        this.sudCoeurs = sudCoeurs;
    }

    public List<String> getSudCarreaux() {
        return sudCarreaux;
    }

    public void setSudCarreaux(List<String> sudCarreaux) {
        this.sudCarreaux = sudCarreaux;
    }

    public List<String> getSudTrefles() {
        return sudTrefles;
    }

    public void setSudTrefles(List<String> sudTrefles) {
        this.sudTrefles = sudTrefles;
    }

    public List<String> getOuestPiques() {
        return ouestPiques;
    }

    public void setOuestPiques(List<String> ouestPiques) {
        this.ouestPiques = ouestPiques;
    }

    public List<String> getOuestCoeurs() {
        return ouestCoeurs;
    }

    public void setOuestCoeurs(List<String> ouestCoeurs) {
        this.ouestCoeurs = ouestCoeurs;
    }

    public List<String> getOuestCarreaux() {
        return ouestCarreaux;
    }

    public void setOuestCarreaux(List<String> ouestCarreaux) {
        this.ouestCarreaux = ouestCarreaux;
    }

    public List<String> getOuestTrefles() {
        return ouestTrefles;
    }

    public void setOuestTrefles(List<String> ouestTrefles) {
        this.ouestTrefles = ouestTrefles;
    }

    public List<String> getNordPiques() {
        return nordPiques;
    }

    public void setNordPiques(List<String> nordPiques) {
        this.nordPiques = nordPiques;
    }

    public List<String> getNordCoeurs() {
        return nordCoeurs;
    }

    public void setNordCoeurs(List<String> nordCoeurs) {
        this.nordCoeurs = nordCoeurs;
    }

    public List<String> getNordCarreaux() {
        return nordCarreaux;
    }

    public void setNordCarreaux(List<String> nordCarreaux) {
        this.nordCarreaux = nordCarreaux;
    }

    public List<String> getNordTrefles() {
        return nordTrefles;
    }

    public void setNordTrefles(List<String> nordTrefles) {
        this.nordTrefles = nordTrefles;
    }

    public List<String> getEstPiques() {
        return estPiques;
    }

    public void setEstPiques(List<String> estPiques) {
        this.estPiques = estPiques;
    }

    public List<String> getEstCoeurs() {
        return estCoeurs;
    }

    public void setEstCoeurs(List<String> estCoeurs) {
        this.estCoeurs = estCoeurs;
    }

    public List<String> getEstCarreaux() {
        return estCarreaux;
    }

    public void setEstCarreaux(List<String> estCarreaux) {
        this.estCarreaux = estCarreaux;
    }

    public List<String> getEstTrefles() {
        return estTrefles;
    }

    public void setEstTrefles(List<String> estTrefles) {
        this.estTrefles = estTrefles;
    }

    @Override
    public String toString() {
        return "PlanchetteBridge [sudPiques=" + sudPiques + ", sudCoeurs=" + sudCoeurs + ", sudCarreaux=" + sudCarreaux + ", sudTrefles=" + sudTrefles
                + ", ouestPiques=" + ouestPiques + ", ouestCoeurs=" + ouestCoeurs + ", ouestCarreaux=" + ouestCarreaux + ", ouestTrefles=" + ouestTrefles
                + ", nordPiques=" + nordPiques + ", nordCoeurs=" + nordCoeurs + ", nordCarreaux=" + nordCarreaux + ", nordTrefles=" + nordTrefles
                + ", estPiques=" + estPiques + ", estCoeurs=" + estCoeurs + ", estCarreaux=" + estCarreaux + ", estTrefles=" + estTrefles + "]";
    }

}
