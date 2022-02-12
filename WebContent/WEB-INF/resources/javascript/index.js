function processWaitingButtonSpinner(whatToProcess) 
{
	switch (whatToProcess) {
	case 'START_WAIT_TIMER': 
		$('.spinner-border').show();
		$(':button').prop('disabled', true);
		break;
	case 'END_WAIT_TIMER': 
		$('.spinner-border').hide();
		$(':button').prop('disabled', false);
		break;
	}
	
}
function reloadPage(whichPage)
{
	switch (whichPage) {
	case 'initialise':
		processUserSelection($('#select_broadcaster'));
		break;
	}
}
function processUserSelection(whichInput)
{	
	switch ($(whichInput).attr('name')) {
	case 'bug_animate_in_btn':
		if ($('#selectPlayer:selected').val()) {
			processCricketProcedures('POPULATE-ANIMATE-BUG');
		} else {
			alert('No player selected');
		}
		break;
	case 'cancel_bug_graphics_btn':
		$('#select_graphic_options_div').empty();
		document.getElementById('select_graphic_options_div').style.display = 'none';
		$("#captions_div *").attr("disabled", false);
		break;
	case 'select_broadcaster':
		switch ($('#select_broadcaster :selected').val()) {
		case 'doad':
			$('#vizScene').attr('value','/Default/DOAD_In_House/BatBallSummary');
			break;
		}
		break;
	case 'load_scene_btn':
		if(checkEmpty($('#vizIPAddress'),'IP Address Blank') == false
			|| checkEmpty($('#vizPortNumber'),'Port Number Blank') == false
			|| checkEmpty($('#vizScene'),'Scene Path Blank') == false) {
			return false;
		}
      	document.initialise_form.submit();
		break;
	case 'bug_graphic_btn':
		addItemsToList('BUG-OPTIONS',null);
		break;
	}
}
function processCricketProcedures(whatToProcess)
{
	var valueToProcess;
	
	switch(whatToProcess) {
	case 'POPULATE-ANIMATE-BUG':
		valueToProcess = 'Stats:' + $('#selectStats:selected').val() + 
			'|Inning:' + $('#selectInning:selected').val() + 
			'|Player:' + $('#selectPlayer:selected').val();
		break;
	}

	$.ajax({    
        type : 'Get',     
        url : 'processCricketProcedures.html',     
        data : 'whatToProcess=' + whatToProcess + '&valueToProcess=' + valueToProcess, 
        dataType : 'json',
        success : function(data) {
        	switch(whatToProcess) {
			case 'POPULATE-ANIMATE-BUG':
				break;
			case 'POPULATE-SELECT-PLAYER':
				addItemsToList(whatToProcess,data);
				break;
        	}
	    },    
	    error : function(e) {    
	  	 	console.log('Error occured in ' + whatToProcess + ' with error description = ' + e);     
	    }    
	});
}
function addItemsToList(whatToProcess, dataToProcess)
{
	var select,option,header_text,div,table,tbody,row,max_cols;
	
	switch (whatToProcess) {
	case 'POPULATE-SELECT-PLAYER':
		
		$('#select_batsman').empty();
		select = document.getElementById('selectPlayer');
		
		dataToProcess.inning.forEach(function(inn,index,arr) {
			if(inn.inningNumber == $('#selectInning:selected').val()) {
				switch ($('#selectStats:selected').val()) {
				case 'batsmanStats':
				    inn.battingCard.forEach(function(bc,bc_index,bc_arr){
						if(bc.runs > 0 || bc.balls > 0) {
							option = document.createElement('option');
							option.value = bc.playerId;
						    option.text = bc.player.surname + ': ' + bc.runs + ' (' + bc.balls + ')';
						    if(bc.onStrike.toLowerCase() == 'yes') {
							    option.selected = true;
						    }
						    select.appendChild(option);
						}
					});
					break;
				}
			}
		});
		break;
		
	case 'BUG-OPTIONS':

		$('#select_graphic_options_div').empty();

		header_text = document.createElement('h6');
		header_text.innerHTML = 'Select Bug Options';
		document.getElementById('select_graphic_options_div').appendChild(header_text);
		
		table = document.createElement('table');
		table.setAttribute('class', 'table table-bordered');
				
		tbody = document.createElement('tbody');

		table.appendChild(tbody);
		document.getElementById('select_graphic_options_div').appendChild(table);
		
		row = tbody.insertRow(tbody.rows.length);
		
		max_cols = 3;
		
		for(var i=1; i<=max_cols; i++) {
			select = document.createElement('select');
			select.setAttribute('onchange',"processCricketProcedures('POPULATE-SELECT-PLAYER',this)");				
			row.insertCell(i-1).appendChild(select);
			switch (i) {
			case 1: // Stats type
				select.id = 'selectStats';
				for(var j=1; j<=3; j++) {
					option = document.createElement('option');
					switch (j) {
					case 1:
						option.value = 'batsmanStats';
					    option.text = "Batsman's Stats";
						break;
					case 2:
						option.value = 'bowlerStats';
					    option.text = "Bowler's Stats";
						break;
					case 3:
						option.value = 'teamStats';
					    option.text = "Team's Stats";
						break; 
					}
				    select.appendChild(option);
				}
				break;
			case 2: // Select inning
				select.id = 'selectInning';
				select.setAttribute('onchange',"processCricketProcedures('POPULATE-SELECT-PLAYER',this)");				
				dataToProcess.inning.forEach(function(inn,index,arr){
					option = document.createElement('option');
					option.value = inn.inningNumber;
				    option.text = 'Inning ' + inn.inningNumber;
					if(inn.isCurrentInning.toLowerCase() == 'yes') {
					    option.selected = true;
					}
				    select.appendChild(option);
				});
				break;
			case 3: // Select player
				select.id = 'selectPlayer';
			}
		}

	    option = document.createElement('input');
	    option.type = 'button';
	    option.name = 'bug_animate_in_btn';
	    option.value = 'Animate In Bug';
	    option.id = option.name;
	    option.setAttribute('onclick',"processUserSelection(this)");
	    
	    div = document.createElement('div');
	    div.append(option);

		option = document.createElement('input');
		option.type = 'button';
		option.name = 'cancel_bug_graphics_btn';
		option.id = option.name;
		option.value = 'Cancel';
		option.setAttribute('onclick','processUserSelection(this)');

	    div.append(document.createElement('br'));
	    div.append(option);
	    
	    row.insertCell(max_cols).appendChild(div);
	    
		document.getElementById('select_graphic_options_div').style.display = '';
		$("#captions_div *").attr("disabled", true);
		
		break;
	}
}
function checkEmpty(inputBox,textToShow) {

	var name = $(inputBox).attr('id');
	
	document.getElementById(name + '-validation').innerHTML = '';
	document.getElementById(name + '-validation').style.display = 'none';
	$(inputBox).css('border','');
	if(document.getElementById(name).value.trim() == '') {
		$(inputBox).css('border','#E11E26 2px solid');
		document.getElementById(name + '-validation').innerHTML = textToShow + ' required';
		document.getElementById(name + '-validation').style.display = '';
		document.getElementById(name).focus({preventScroll:false});
		return false;
	}
	return true;	
}
/*function uploadFormDataToSessionObjects(whatToProcess)
{
	var formData = new FormData();
	var url_path;

	$('input, select, textarea').each(
		function(index){  
			formData.append($(this).attr('id'),document.getElementById($(this).attr('id')).value);  
		}
	);
	
	switch(whatToProcess.toUpperCase()) {
	case 'POPULATE-ANIMATE-BUG':
		url_path = 'populate_animate_in_bug';
		break;
	}
	
	$.ajax({    
		headers: {'X-CSRF-TOKEN': $('meta[name="_csrf"]').attr('content')},
        url : url_path,     
        data : formData,
        cache: false,
        contentType: false,
        processData: false,
        type: 'POST',     
        success : function(response) {
        	switch(whatToProcess.toUpperCase()) {
        	case 'POPULATE-ANIMATE-BUG':
        		break;
        	}
        },    
        error : function(e) {    
       	 	console.log('Error occured in uploadFormDataToSessionObjects with error description = ' + e);     
        }    
    });		
	
} */