function resetLocForm(){
	document.getElementById("locNameErr").innerHTML = '';
	document.getElementById("locTypeErr").innerHTML = '';
}
function doValidateLocForm() {
	var expName = /^[a-zA-Z]{2,8}$/;
	resetLocForm();
	if (!(document.locForm.locName.value.match(expName))) {
		document.getElementById("locNameErr").innerHTML = '* Invalid Name Entered';
		return false;
	}
	if (document.locForm.locType[0].checked == false
			&& document.locForm.locType[1].checked == false) {
		document.getElementById("locTypeErr").innerHTML = '* Select any one option';
		return false;
	}
	return true;
}