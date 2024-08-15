let panel = document.getElementById("side_panel");

document.getElementById("side_panel_close_button").addEventListener("click", () => {
    panel.style.left = "-71vw";
});

document.getElementById("profile_btn").addEventListener("click", () => {
    panel.style.left = "0vw";
});

// loading card 
function load() {
    var str = "";

    for (let index = 0; index < 10; index++) {
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
