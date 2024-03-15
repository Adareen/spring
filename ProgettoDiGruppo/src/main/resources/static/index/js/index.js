const URL = "https://api.tvmaze.com/singlesearch/shows?q=";

let ricerca = document.querySelector("#cerca");
let btnCerca = document.querySelector("#btnCerca");
let serie = [];

btnCerca.addEventListener("submit", function () {
  let ricerca = document.querySelector("#cerca").value;
  fetch(URL + ricerca)
    .then((data) => {
      console.log(data);
      return data.json();
    })
    .then((response) => {

        // creo i child mentre sono nella response della fetch, devo fare append dei value. 
      serie = response.data;
      let l1 = document.createElement("label");
      let inputTitolo = document.createElement("input");
      let l2 = document.createElement("label");
      let inputRating = document.createElement("input");
      let l3 = document.createElement("label");
      let inputTrama = document.createElement("textarea");

      l1.textContent="titolo";
      l2.textContent="rating";
      l3.textContent="trama";

      let div=document.createElement("div");
      div.appendChild(l1);
      div.appendChild(inputTitolo);
      div.appendChild(l2);
      div.appendChild(inputRating);
      div.appendChild(l3);
      div.appendChild(inputTrama);


    //   let btnRem=document.createElement("button");
    //   btnRem.textContent=" X ";
    //   li.appendChild(btnRem);

      
    });

  //.then(response=> {console.log(response);});
});
