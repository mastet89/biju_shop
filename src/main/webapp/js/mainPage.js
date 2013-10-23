function displayText(text){
	alert(text);
};

function checkStorageSupport() {
//sessionStorage
if (window.sessionStorage) {
alert('This browser supports sessionStorage');
} else {
alert('This browser does NOT support sessionStorage');
}
//localStorage
if (window.localStorage) {
alert('This browser supports localStorage');
} else {
alert('This browser does NOT support localStorage');
}
}