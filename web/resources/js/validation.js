/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
function onlyNumericCharacter(fildid) {
    $(fildid).val($(fildid).val().replace(/[^\d]/ig, ''));
}

function isValidEmailAddress(emailAddress) {  
    var pattern = new RegExp(/^[+a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/i);      
    if(!pattern.test(emailAddress.val())){
        alert("Email is invalid");
    }
}

function checkSpecialChar(fildid){
    var inputVal = fildid.val();
    var characterReg = /^\s*[~!@#$%^&*\s]+\s*$/;
    if (!characterReg.test(inputVal) && inputVal != '') {
        alert("Only alow special character.");
        $(fildid).val($(fildid).val().replace(/^\s*[~!@#$%^&*\s]+\s*$/ig, ''));
    }
}



