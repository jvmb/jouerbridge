package com.jvmb.jouerbridge.model;

import java.util.Collections;
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
public class VueTable {

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

    public void sortMainsPlanchette() {
        Collections.sort(mainSud);
        Collections.reverse(mainSud);
        Collections.sort(mainOuest);
        Collections.reverse(mainOuest);
        Collections.sort(mainNord);
        Collections.reverse(mainNord);
        Collections.sort(mainEst);
        Collections.reverse(mainEst);
    }

    @Override
    public String toString() {
        return "VueTable [mainSud=" + mainSud + ", mainOuest=" + mainOuest + ", mainNord=" + mainNord + ", mainEst=" + mainEst + "]";
    }

}
