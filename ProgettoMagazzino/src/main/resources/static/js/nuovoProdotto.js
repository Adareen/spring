


let btnAdd = document.querySelector("#btnAdd");
btnAdd.addEventListener("click", function (){


    const URL="http://localhost:9015/api/nuovoProdotto.html";
    let nome=document.querySelector("#nome").value
    let descrizione=document.querySelector("#descrizione").value
    let prezzo=document.querySelector("#prezzo").value

    let nuovoProdotto={

        descrizione: descrizione,
        nome: nome,
        prezzo: prezzo
    }

    fetch(URL, {
        method: "POST",
        headers:{ "Content-Type":"application/json"},
        body: JSON.stringify(nuovoProdotto)
    })
    .then(data=> {return data.json()})

})
