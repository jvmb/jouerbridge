/**
 * jouerbridge.js
 */
$(document).ready(function() {

	// Si on a un message d'erreur, on affiche et rien d'autre
	var msgErreur = String(document.getElementById("mainErreurId").value);
	if (msgErreur.trim()) {
		alert("ERREUR: " + msgErreur);
	}

	// On va chercher les 4 mains
	var mSudVar = eleveBracket(document.getElementById("mSudId").value);
	var mOuestVar = eleveBracket(document.getElementById("mOuestId").value);
	var mNordVar = eleveBracket(document.getElementById("mNordId").value);
	var mEstVar = eleveBracket(document.getElementById("mEstId").value);

	// Afficher les mains
	afficheMain("S", mSudVar);
	afficheMain("O", mOuestVar);
	afficheMain("N", mNordVar);
	afficheMain("E", mEstVar);

	// Afficher les cartes jouées
	afficheCarteJouer("S", document.getElementById("mSudIdCarte").value);
	afficheCarteJouer("O", document.getElementById("mOuestIdCarte").value);
	afficheCarteJouer("N", document.getElementById("mNordIdCarte").value);
	afficheCarteJouer("E", document.getElementById("mEstIdCarte").value);

	// Les plis
	$("#BADGENS").text(document.getElementById("mPliNS").value);
	$("#BADGEEO").text(document.getElementById("mPliEO").value);

});

/**
 * Fonction qui enleve les brackets dans une chaine de caractères
 * 
 * 
 * @param chaine
 * @returns
 */
function eleveBracket(chaine) {

	chaine = chaine.replace("[", "");
	chaine = chaine.replace("]", "");

	return chaine;
}

/**
 * Cette fonction affiche les carte de chaineMaine pour une direction donnée:
 * nord, sud est, ouest.
 * 
 * 
 * @param direction
 * @param chaineMain
 */
function afficheMain(direction, chaineMain) {

	var carte = chaineMain.split(',');
	$.each(carte, function(key, value) {
		var numCarteStr = String(value.trim());
		if (numCarteStr) {
			var numCarte = parseInt(numCarteStr);
			var contextPath = String(document.getElementById("ctxFromJspId").value);
			// alert(contextPath);
			var bouton = "<a href=\"" + contextPath + "/jouer?direction=" + direction + "&carte=" + numCarte + "\""
					+ " class=\"btn btn-default btn-carte\" role=\"button\"><span class=\"text-center\"  style=\"color:" + retourCouleur(retourSorte(numCarte))
					+ ";\">" + retourRang(numCarte) + retourSorteSymbole(numCarte) + "</span></a>";
			console.log(bouton);
			var directionSorte = "#" + direction + retourSorte(numCarte);
			console.log(directionSorte);
			$(directionSorte).append(bouton);
		}
	});
}

/**
 * Cette fonction affiche la carte à jouer pour une direction donnée
 * 
 * @param direction
 * @param carteJouer
 */
function afficheCarteJouer(direction, carteJouer) {
	var numCarteStr = String(carteJouer.trim());
	// Si different d'une carte vides
	if (numCarteStr !== "52") {
		var numCarte = parseInt(numCarteStr);
		var bouton = "<a href=\"#\" class=\"btn btn-default btn-carte\" role=\"button\"><span class=\"text-center\"  style=\"color:"
				+ retourCouleur(retourSorte(numCarte)) + ";\">" + retourRang(numCarte) + retourSorteSymbole(numCarte) + "</span></a>";
		console.log(bouton);
		var directionSorte = "#" + direction;
		console.log(directionSorte);
		$(directionSorte).append(bouton);
	}
}

/**
 * Fonction qui retourne la couleur d'une sorte
 * 
 * @param sorte
 * @returns {String}
 */
function retourCouleur(sorte) {

	var couleur;

	switch (sorte) {

	case "C":
	case "K":
		couleur = "red";
		break;
	case "P":
	case "T":
	default:
		couleur = "black";

	}

	return couleur;
}

/**
 * Fonction qui retourne le rang de la carte: A,R,D....
 * 
 * @param numCarte
 * @returns {String}
 */
function retourRang(numCarte) {

	var rang;

	switch (numCarte) {
	case 51:
	case 38:
	case 25:
	case 12:
		rang = "A";
		break;
	case 50:
	case 37:
	case 24:
	case 11:
		rang = "R";
		break;
	case 49:
	case 36:
	case 23:
	case 10:
		rang = "D";
		break;
	case 48:
	case 35:
	case 22:
	case 9:
		rang = "V";
		break;
	case 47:
	case 34:
	case 21:
	case 8:
		rang = "10";
		break;
	case 46:
	case 33:
	case 20:
	case 7:
		rang = "9";
		break;
	case 45:
	case 32:
	case 19:
	case 6:
		rang = "8";
		break;
	case 44:
	case 31:
	case 18:
	case 5:
		rang = "7";
		break;
	case 43:
	case 30:
	case 17:
	case 4:
		rang = "6";
		break;
	case 42:
	case 29:
	case 16:
	case 3:
		rang = "5";
		break;
	case 41:
	case 28:
	case 15:
	case 2:
		rang = "4";
		break;
	case 40:
	case 27:
	case 14:
	case 1:
		rang = "3";
		break;
	case 39:
	case 26:
	case 13:
	case 0:
		rang = "2";
		break;
	default:
		console.log("retourRang(), numCarte impossible: " + numCarte);
		rang = "";
	}

	return rang;

}

/**
 * Fonction qui retourne la sorte de la carte: P,C,K,T
 * 
 * @param numCarte
 * @returns {String}
 */
function retourSorte(numCarte) {

	var sorte;

	switch (numCarte) {
	case 51:
	case 50:
	case 49:
	case 48:
	case 47:
	case 46:
	case 45:
	case 44:
	case 43:
	case 42:
	case 41:
	case 40:
	case 39:
		sorte = "P";
		break;
	case 38:
	case 37:
	case 36:
	case 35:
	case 34:
	case 33:
	case 32:
	case 31:
	case 30:
	case 29:
	case 28:
	case 27:
	case 26:
		sorte = "C";
		break;
	case 25:
	case 24:
	case 23:
	case 22:
	case 21:
	case 20:
	case 19:
	case 18:
	case 17:
	case 16:
	case 15:
	case 14:
	case 13:
		sorte = "K";
		break;
	case 12:
	case 11:
	case 10:
	case 9:
	case 8:
	case 7:
	case 6:
	case 5:
	case 4:
	case 3:
	case 2:
	case 1:
	case 0:
		sorte = "T";
		break;
	default:
		console.log("retourSorte(), numCarte impossible: " + numCarte);
		sorte = "";
	}

	return sorte;

}

/**
 * Fonction qui retourne la sorte de la carte: P,C,K,T
 * 
 * @param numCarte
 * @returns {String}
 */
function retourSorteSymbole(numCarte) {

	var sorte;

	switch (numCarte) {
	case 51:
	case 50:
	case 49:
	case 48:
	case 47:
	case 46:
	case 45:
	case 44:
	case 43:
	case 42:
	case 41:
	case 40:
	case 39:
		sorte = "&spades;";
		break;
	case 38:
	case 37:
	case 36:
	case 35:
	case 34:
	case 33:
	case 32:
	case 31:
	case 30:
	case 29:
	case 28:
	case 27:
	case 26:
		sorte = "&hearts;";
		break;
	case 25:
	case 24:
	case 23:
	case 22:
	case 21:
	case 20:
	case 19:
	case 18:
	case 17:
	case 16:
	case 15:
	case 14:
	case 13:
		sorte = sorte = "&diams;";
		break;
	case 12:
	case 11:
	case 10:
	case 9:
	case 8:
	case 7:
	case 6:
	case 5:
	case 4:
	case 3:
	case 2:
	case 1:
	case 0:
		sorte = "&clubs;";
		break;
	default:
		console.log("retourSorte(), numCarte impossible: " + numCarte);
		sorte = "";
	}

	return sorte;

}