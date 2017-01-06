package com.jvmb.jouerbridge.util;

import java.util.LinkedList;
import java.util.List;

import com.jvmb.jouerbridge.model.Carte;
import com.jvmb.jouerbridge.model.Sorte;

/**
 * Classe utilitaire pour transformer une model vers un autre model
 * 
 * @author marcbeaulieu
 *
 */
// final, pas de sous-classe
public final class ModelUtils {

    // private constructor, pas d'instanciation possible
    private ModelUtils() {
    }

    /**
     * 
     * @param mainSorte
     * @param sorte
     * @return
     */
    public static List<Integer> mainStockVersVue(String mainSorte, Sorte sorte) {

        List<Integer> mainSorteInt = new LinkedList<Integer>();
        String carte = "";

        // On va chercher les chaine separé par virgule
        String[] result = mainSorte.split(",");

        for (int x = 0; x < result.length; x++) {

            // trim plus en majuscule
            carte = result[x].toUpperCase().trim();

            // Si on a une string
            if (carte.length() > 0) {
                switch (sorte) {
                case PIQUE:
                    switch (carte) {
                    case "A":
                        mainSorteInt.add(Carte.AP.getRang());
                        break;
                    case "R":
                    case "K":
                        mainSorteInt.add(Carte.RP.getRang());
                        break;
                    case "D":
                    case "Q":
                        mainSorteInt.add(Carte.DP.getRang());
                        break;
                    case "V":
                    case "J":
                        mainSorteInt.add(Carte.VP.getRang());
                        break;
                    case "10":
                        mainSorteInt.add(Carte._10P.getRang());
                        break;
                    case "9":
                        mainSorteInt.add(Carte._9P.getRang());
                        break;
                    case "8":
                        mainSorteInt.add(Carte._8P.getRang());
                        break;
                    case "7":
                        mainSorteInt.add(Carte._7P.getRang());
                        break;
                    case "6":
                        mainSorteInt.add(Carte._6P.getRang());
                        break;
                    case "5":
                        mainSorteInt.add(Carte._5P.getRang());
                        break;
                    case "4":
                        mainSorteInt.add(Carte._4P.getRang());
                        break;
                    case "3":
                        mainSorteInt.add(Carte._3P.getRang());
                        break;
                    case "2":
                        mainSorteInt.add(Carte._2P.getRang());
                        break;
                    default:
                        // TODO - Exception
                    }
                    break;
                case COEUR:
                    switch (carte) {
                    case "A":
                        mainSorteInt.add(Carte.AC.getRang());
                        break;
                    case "R":
                    case "K":
                        mainSorteInt.add(Carte.RC.getRang());
                        break;
                    case "D":
                    case "Q":
                        mainSorteInt.add(Carte.DC.getRang());
                        break;
                    case "V":
                    case "J":
                        mainSorteInt.add(Carte.VC.getRang());
                        break;
                    case "10":
                        mainSorteInt.add(Carte._10C.getRang());
                        break;
                    case "9":
                        mainSorteInt.add(Carte._9C.getRang());
                        break;
                    case "8":
                        mainSorteInt.add(Carte._8C.getRang());
                        break;
                    case "7":
                        mainSorteInt.add(Carte._7C.getRang());
                        break;
                    case "6":
                        mainSorteInt.add(Carte._6C.getRang());
                        break;
                    case "5":
                        mainSorteInt.add(Carte._5C.getRang());
                        break;
                    case "4":
                        mainSorteInt.add(Carte._4C.getRang());
                        break;
                    case "3":
                        mainSorteInt.add(Carte._3C.getRang());
                        break;
                    case "2":
                        mainSorteInt.add(Carte._2C.getRang());
                        break;
                    default:
                        // TODO - Exception
                    }
                    break;
                case CARREAU:
                    switch (carte) {
                    case "A":
                        mainSorteInt.add(Carte.AK.getRang());
                        break;
                    case "R":
                    case "K":
                        mainSorteInt.add(Carte.RK.getRang());
                        break;
                    case "D":
                    case "Q":
                        mainSorteInt.add(Carte.DK.getRang());
                        break;
                    case "V":
                    case "J":
                        mainSorteInt.add(Carte.VK.getRang());
                        break;
                    case "10":
                        mainSorteInt.add(Carte._10K.getRang());
                        break;
                    case "9":
                        mainSorteInt.add(Carte._9K.getRang());
                        break;
                    case "8":
                        mainSorteInt.add(Carte._8K.getRang());
                        break;
                    case "7":
                        mainSorteInt.add(Carte._7K.getRang());
                        break;
                    case "6":
                        mainSorteInt.add(Carte._6K.getRang());
                        break;
                    case "5":
                        mainSorteInt.add(Carte._5K.getRang());
                        break;
                    case "4":
                        mainSorteInt.add(Carte._4K.getRang());
                        break;
                    case "3":
                        mainSorteInt.add(Carte._3K.getRang());
                        break;
                    case "2":
                        mainSorteInt.add(Carte._2K.getRang());
                        break;
                    default:
                        // TODO - Exception
                    }
                    break;
                case TREFLE:
                    switch (carte) {
                    case "A":
                        mainSorteInt.add(Carte.AT.getRang());
                        break;
                    case "R":
                    case "K":
                        mainSorteInt.add(Carte.RT.getRang());
                        break;
                    case "D":
                    case "Q":
                        mainSorteInt.add(Carte.DT.getRang());
                        break;
                    case "V":
                    case "J":
                        mainSorteInt.add(Carte.VT.getRang());
                        break;
                    case "10":
                        mainSorteInt.add(Carte._10T.getRang());
                        break;
                    case "9":
                        mainSorteInt.add(Carte._9T.getRang());
                        break;
                    case "8":
                        mainSorteInt.add(Carte._8T.getRang());
                        break;
                    case "7":
                        mainSorteInt.add(Carte._7T.getRang());
                        break;
                    case "6":
                        mainSorteInt.add(Carte._6T.getRang());
                        break;
                    case "5":
                        mainSorteInt.add(Carte._5T.getRang());
                        break;
                    case "4":
                        mainSorteInt.add(Carte._4T.getRang());
                        break;
                    case "3":
                        mainSorteInt.add(Carte._3T.getRang());
                        break;
                    case "2":
                        mainSorteInt.add(Carte._2T.getRang());
                        break;
                    default:
                        // TODO - Exception
                    }
                    break;
                }
            }
        }

        return mainSorteInt;
    }
}
