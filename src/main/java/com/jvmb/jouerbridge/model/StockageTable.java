package com.jvmb.jouerbridge.model;

import java.util.LinkedList;
import java.util.List;

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

    private List<Integer> mainSud = new LinkedList<Integer>();
    private List<Integer> mainOuest = new LinkedList<Integer>();
    private List<Integer> mainNord = new LinkedList<Integer>();
    private List<Integer> mainEst = new LinkedList<Integer>();

    public List<Integer> getMainSud() {
        return mainSud;
    }

    public void setMainSud(List<Integer> mainSud) {
        this.mainSud = mainSud;
    }

    public List<Integer> getMainOuest() {
        return mainOuest;
    }

    public void setMainOuest(List<Integer> mainOuest) {
        this.mainOuest = mainOuest;
    }

    public List<Integer> getMainNord() {
        return mainNord;
    }

    public void setMainNord(List<Integer> mainNord) {
        this.mainNord = mainNord;
    }

    public List<Integer> getMainEst() {
        return mainEst;
    }

    public void setMainEst(List<Integer> mainEst) {
        this.mainEst = mainEst;
    }

    @Override
    public String toString() {
        return "StockageTable [mainSud=" + mainSud + ", mainOuest=" + mainOuest + ", mainNord=" + mainNord + ", mainEst=" + mainEst + "]";
    }

}
