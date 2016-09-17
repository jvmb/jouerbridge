package com.jvmb.jouerbridge.model;

/**
 * classe enum pour représenter des cartes à jouer
 * 
 * 
 * @author marcbeaulieu
 *
 */
public enum Carte {

    // rang/13 donne sorte: 0 trèfle, 1 carreau, 2 coeur et 3 pique
    // rang%13 donne ordre dans la sorte: 0 pour 2, 1 pour 3.... 11 pour roi et
    // 12 pour as

    // La déclaration des carte est du plus petit au plus grand pour que le
    // compareTo fct naturellement

    // Trèfles
    _2T(0), _3T(1), _4T(2), _5T(3), _6T(4), _7T(5), _8T(6), _9T(7), _10T(8), VT(9), DT(10), RT(11), AT(12),
    // Carreaux
    _2K(13), _3K(14), _4K(15), _5K(16), _6K(17), _7K(18), _8K(19), _9K(20), _10K(21), VK(22), DK(23), RK(24), AK(25),
    // Coeurs
    _2C(26), _3C(27), _4C(28), _5C(29), _6C(30), _7C(31), _8C(32), _9C(33), _10C(34), VC(35), DC(36), RC(37), AC(38),
    // Piques
    _2P(39), _3P(40), _4P(41), _5P(42), _6P(43), _7P(44), _8P(45), _9P(46), _10P(47), VP(48), DP(49), RP(50), AP(51);

    private final Integer rang;

    private Carte(Integer rang) {
        this.rang = rang;
    }

    public Integer getRang() {
        return rang;
    }

}
