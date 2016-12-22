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
public class VueTable {

    private List<Integer> mainSud = new LinkedList<Integer>();
    private List<Integer> mainOuest = new LinkedList<Integer>();
    private List<Integer> mainNord = new LinkedList<Integer>();
    private List<Integer> mainEst = new LinkedList<Integer>();

    private Integer carteSud;
    private Integer carteOuest;
    private Integer carteNord;
    private Integer carteEst;

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

    // TODO pour recup
    // public void sortMainsPlanchette() {
    // Collections.sort(mainSud);
    // Collections.reverse(mainSud);
    // Collections.sort(mainOuest);
    // Collections.reverse(mainOuest);
    // Collections.sort(mainNord);
    // Collections.reverse(mainNord);
    // Collections.sort(mainEst);
    // Collections.reverse(mainEst);
    // }

    public Integer getCarteSud() {
        return carteSud;
    }

    public void setCarteSud(Integer carteSud) {
        this.carteSud = carteSud;
    }

    public Integer getCarteOuest() {
        return carteOuest;
    }

    public void setCarteOuest(Integer carteOuest) {
        this.carteOuest = carteOuest;
    }

    public Integer getCarteNord() {
        return carteNord;
    }

    public void setCarteNord(Integer carteNord) {
        this.carteNord = carteNord;
    }

    public Integer getCarteEst() {
        return carteEst;
    }

    public void setCarteEst(Integer carteEst) {
        this.carteEst = carteEst;
    }

    @Override
    public String toString() {
        return "VueTable [mainSud=" + mainSud + ", mainOuest=" + mainOuest + ", mainNord=" + mainNord + ", mainEst=" + mainEst + ", carteSud=" + carteSud
                + ", carteOuest=" + carteOuest + ", carteNord=" + carteNord + ", carteEst=" + carteEst + "]";
    }

}
