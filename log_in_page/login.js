document.getElementById("login").addEventListener("click",() => {
    localStorage.setItem("userLogIn","true");
    window.location.href = "../index.html";
});