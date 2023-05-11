const mainContainer = document.querySelector(".container")
console.log(mainContainer);
const thanksContainer = document.querySelector(".container-agradecimentos")
const submitButton = document.getElementById("submit")
const rateAgain = document.getElementById("rate-again")
const rating = document.getElementById("rating")
const rates = document.querySelectorAll(".btn")


submitButton.addEventListener("click", () =>{
    thanksContainer.classList.remove("hidden")
    // quando clicar no botão vai remover classe hidden
    // class list permite a manipulação de conteudo de classe do elemento
    mainContainer.style.display = "none"
    // display none vai fazer o outro display desaparecer quando clicar no botão
    // não vai mais ficar aparecendo o outro card quando clicar
})


rateAgain.addEventListener("click", () =>{
    thanksContainer.classList.add("hidden")
    // vai adicionar de volta o card principal, porém vai aparecer o outro card
    mainContainer.style.display = "block"
    // para não aparecer o outro card usamos block
    // Sem o block nosso display principal desaparece


})

rates.forEach((rate) => {
    rate.addEventListener("click", () => {
        // console.log(rate.innerHTML);
        rate.innerHTML = rate.innerHTML
    })
})