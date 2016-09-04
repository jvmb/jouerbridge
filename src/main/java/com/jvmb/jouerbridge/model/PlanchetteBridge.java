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
public class PlanchetteBridge {

    private List<String> mainSud = new LinkedList<String>();
    private List<String> mainOuest = new LinkedList<String>();
    private List<String> mainNord = new LinkedList<String>();
    private List<String> mainEst = new LinkedList<String>();

    public List<String> getMainSud() {
        return mainSud;
    }

    public void setMainSud(List<String> mainSud) {
        this.mainSud = mainSud;
    }

    public List<String> getMainOuest() {
        return mainOuest;
    }

    public void setMainOuest(List<String> mainOuest) {
        this.mainOuest = mainOuest;
    }

    public List<String> getMainNord() {
        return mainNord;
    }

    public void setMainNord(List<String> mainNord) {
        this.mainNord = mainNord;
    }

    public List<String> getMainEst() {
        return mainEst;
    }

    public void setMainEst(List<String> mainEst) {
        this.mainEst = mainEst;
    }

    public void sortMainsPlanchette() {
        Collections.sort(mainSud);
        Collections.sort(mainOuest);
        Collections.sort(mainNord);
        Collections.sort(mainEst);
    }

    @Override
    public String toString() {
        return "PlanchetteBridge [mainSud=" + mainSud + ", mainOuest=" + mainOuest + ", mainNord=" + mainNord + ", mainEst=" + mainEst + "]";
    }

    public static void main(String[] args) {
        PlanchetteBridge p = new PlanchetteBridge();
        List<String> s = p.getMainSud();
        List<String> o = p.getMainOuest();
        List<String> n = p.getMainNord();
        List<String> e = p.getMainEst();

        s.add("3");
        s.add("2");
        s.add("1");
        o.add("3");
        o.add("2");
        o.add("1");
        n.add("3");
        n.add("2");
        n.add("1");
        e.add("3");
        e.add("2");
        e.add("1");

        System.out.println(p);
        p.sortMainsPlanchette();
        System.out.println(p);

    }

}
