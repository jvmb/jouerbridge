package com.jvmb.jouerbridge.model;

/**
 * classe enum pour représenter des cartes à jouer
 * 
 * 
 * @author marcbeaulieu
 *
 */
public enum Carte {

    AS_PIQUE("AP"), ROI_PIQUE("RP"), DAME_PIQUE("DP"), 
    VALET_PIQUE("VP"), DIX_PIQUE("10P"), NEUF_PIQUE("9P"), 
    HUIT_PIQUE("8P"), SEPT_PIQUE("7P"), SIX_PIQUE("6P"), 
    CINQ_PIQUE("5P"), QUATRE_PIQUE("4P"), TROIS_PIQUE("3P"), DEUX_PIQUE("2P");
    
    // TODO - finir les sorte

    private String symbCarte;

    private Carte(String symbCarte) {
        this.symbCarte = symbCarte;
    }

    public String symbole() {
        return symbCarte;
    }

}
