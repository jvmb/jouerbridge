//jouerbridge.js
$(document).ready(function() {

	// DEBUG
	// alert("Coucou");

	// Toggle le menu
	$("#menu-toggle").click(function(e) {
		e.preventDefault();
		$("#wrapper").toggleClass("toggled");
	});

});