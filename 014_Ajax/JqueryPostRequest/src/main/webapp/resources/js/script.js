jQuery(document).ready(function($) {
	$("#search-form").submit(function(event) {
		
		// Disable the search button
		enableSearchButton(false);
		
		// Prevent the form from submitting via the browser.
		event.preventDefault();
		searchViaAjax();
	});
});

/**
 * Search Ajax
 * @returns
 */
function searchViaAjax() {
	var search = {};
	search["username"] = $("#username").val();
	
	// jQuery POST
	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : "users/search",
		data : JSON.stringify(search),
		dataType : 'json',
		timeout : 100000,
		success : function(data) {
			console.log("SUCCESS: ", data);
			display(data);
		},
		error : function(e) {
			console.log("ERROR: ", e);
			display(e);
		},
		done : function(e) {
			console.log("DONE");
			enableSearchButton(true);
		}
	});
}

function display(data) {
	var json = "<h4>Ajax Response</h4><pre>" + JSON.stringify(data, null, 4)
			+ "</pre>";
	$('#feedback').html(json);
}

/**
 * Enable-Disable Search Button
 * @param flag
 * @returns
 */
function enableSearchButton(flag) {
	$("#btn-search").prop("disabled", flag);
}