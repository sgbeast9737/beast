let panel = document.getElementById("side_panel");

// code that verifys user log in
if (localStorage.getItem('userLogIn') === null) {
    localStorage.setItem('userLogIn', 'false');
    
    document.getElementById("sign_in_page").style.zIndex = 0;
}
else
{
    document.getElementById("sign_in_page").style.display = "none";
}

document.getElementById("login").addEventListener("click", () => {
    window.location.href = "log_in_page/login.html";
});

window.addEventListener('beforeunload',remove_data);

document.getElementById("log_out").addEventListener("click", remove_data);

function remove_data(){
    localStorage.removeItem('userLogIn');
    
    let sign_in_page = document.getElementById("sign_in_page").style;

    sign_in_page.display = "flex";
    sign_in_page.zIndex = "0";
};

// differnte type of events called when user interacts with page

document.getElementById("side_panel_close_button").addEventListener("click", () => {
    panel.style.left = "-71vw";
});

document.getElementById("profile_btn").addEventListener("click", () => {
    panel.style.left = "0vw";
});


// loading card 
function load() {
    var str = "";

    for (let index = 1; index < 13; index++) {
        str += `
                <div id="card">
                    <div class="card_img">
                        <div id="price">$70</div>
                        <img loading="lazy" src="images/p${index + 1}.jpg" alt="shoes image">
                    </div>
                    <div class="card_details">
                        <p>Name</p>
                        <p>Brand Name</p>
                        <p>Category</p>
                    </div>
                </div>`;
    }
    document.getElementById('card_layout').innerHTML = str;
}
load()
