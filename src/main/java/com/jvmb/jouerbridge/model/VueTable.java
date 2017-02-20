package com.jvmb.jouerbridge.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.jvmb.jouerbridge.util.ModelUtils;

/**
 * Modèle POJO pour affciher une planchette de bridge et des notes.
 * 
 * 
 * 
 * @author marcbeaulieu
 *
 */
public class VueTable implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Integer> mainSud = new LinkedList<Integer>();
    private List<Integer> mainOuest = new LinkedList<Integer>();
    private List<Integer> mainNord = new LinkedList<Integer>();
    private List<Integer> mainEst = new LinkedList<Integer>();

    private Integer carteSud;
    private Integer carteOuest;
    private Integer carteNord;
    private Integer carteEst;

    /**
     * 
     */
    public VueTable() {
        super();
    }

    /**
     * 
     * @param sTable
     */
    public VueTable(StockageTable sTable) {
        super();
        // Batit main sud
        mainSud.addAll(ModelUtils.mainStockVersVue(sTable.getMainSudPique(), Sorte.PIQUE));
        mainSud.addAll(ModelUtils.mainStockVersVue(sTable.getMainSudCoeur(), Sorte.COEUR));
        mainSud.addAll(ModelUtils.mainStockVersVue(sTable.getMainSudCarreau(), Sorte.CARREAU));
        mainSud.addAll(ModelUtils.mainStockVersVue(sTable.getMainSudTrefle(), Sorte.TREFLE));
        Collections.sort(mainSud, Collections.reverseOrder());
        // Batit main ouest
        mainOuest.addAll(ModelUtils.mainStockVersVue(sTable.getMainOuestPique(), Sorte.PIQUE));
        mainOuest.addAll(ModelUtils.mainStockVersVue(sTable.getMainOuestCoeur(), Sorte.COEUR));
        mainOuest.addAll(ModelUtils.mainStockVersVue(sTable.getMainOuestCarreau(), Sorte.CARREAU));
        mainOuest.addAll(ModelUtils.mainStockVersVue(sTable.getMainOuestTrefle(), Sorte.TREFLE));
        Collections.sort(mainOuest, Collections.reverseOrder());
        // Batit main nord
        mainNord.addAll(ModelUtils.mainStockVersVue(sTable.getMainNordPique(), Sorte.PIQUE));
        mainNord.addAll(ModelUtils.mainStockVersVue(sTable.getMainNordCoeur(), Sorte.COEUR));
        mainNord.addAll(ModelUtils.mainStockVersVue(sTable.getMainNordCarreau(), Sorte.CARREAU));
        mainNord.addAll(ModelUtils.mainStockVersVue(sTable.getMainNordTrefle(), Sorte.TREFLE));
        Collections.sort(mainNord, Collections.reverseOrder());
        // Batit main est
        mainEst.addAll(ModelUtils.mainStockVersVue(sTable.getMainEstPique(), Sorte.PIQUE));
        mainEst.addAll(ModelUtils.mainStockVersVue(sTable.getMainEstCoeur(), Sorte.COEUR));
        mainEst.addAll(ModelUtils.mainStockVersVue(sTable.getMainEstCarreau(), Sorte.CARREAU));
        mainEst.addAll(ModelUtils.mainStockVersVue(sTable.getMainEstTrefle(), Sorte.TREFLE));
        Collections.sort(mainEst, Collections.reverseOrder());

    }

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

    public boolean isVueTableEmpty() {
        int sud = mainSud.size();
        int ouest = mainOuest.size();
        int nord = mainNord.size();
        int est = mainEst.size();
        // Si on a au moins 1 carte retourne false
        if (sud + ouest + nord + est > 0) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "VueTable [mainSud=" + mainSud + ", mainOuest=" + mainOuest + ", mainNord=" + mainNord + ", mainEst=" + mainEst + ", carteSud=" + carteSud
                + ", carteOuest=" + carteOuest + ", carteNord=" + carteNord + ", carteEst=" + carteEst + "]";
    }

}
