const URL="http://localhost:9015/dettagli.html";

let addProdotto=document.querySelector("#addProdotto");

let info=document.querySelector("#info");

info.addEventListener("click", function(){
    fetch(URL)
    .then(res=>{return res.json()})
    .then(data =>{
        
    })
})


addProdotto.addEventListener("click", function(){
    window.location="nuovoProdotto.html"
})