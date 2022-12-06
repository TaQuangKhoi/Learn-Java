/* ÁNH XẠ */
let btn = document.getElementById("btn");
let appName = document.getElementById("app-name"); //h1
let input = document.getElementById("ipt-text");


/* THÊM SỰ KIỆN */
addEventListener('input', UpdateOnType);
btn.onclick = function() {
    UpdateOnType();
}


/* HÀM */

// Update element when type in input tag
function UpdateOnType () {
    appName.innerHTML = input.value;
}

function Tong(a, b) {
    return a + b
}

