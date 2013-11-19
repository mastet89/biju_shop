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

function mouse_over(elem) {
    document.all[elem].style.color="#222222";
    document.all[elem].style.textDecoration="underline";
}

function mouse_out(elem) {
    document.all[elem].style.color="#828282";
    document.all[elem].style.textDecoration="none";
}

function getTovar(){
    $.get("/tovar/123");
}

