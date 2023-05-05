// passar o botão para o JS e quando clicar chamar a função
const btnCalcular = document.querySelector('#btnCalcularXP');

btnCalcular.addEventListener('click', function(){
    
    // pegando os elementos que possuem a classe heroi
    const herois = document.querySelectorAll('.heroi');
    
    for(let i = 0; i<herois.length; i++) {
        const forca = Number(herois[i].querySelector('.forca').textContent);
        const velocidade = Number(herois[i].querySelector('.velocidade').textContent);
        const agilidade = Number(herois[i].querySelector('.agilidade').textContent);
        const xpFinal = (forca + velocidade + agilidade)/3;
        herois[i].querySelector('.xp').textContent = xpFinal.toFixed(1);

        if(xpFinal < 75){
            herois[i].classList.add('bg-danger','text-light');
            // herois[i].style.backgroundColor='#900';
            // herois[i].style.color='#FFF';
        }
    }
});

let forca = document.querySelectorAll('.forca');
    if(forca[3].textContent.length > 0){
        console.log('Tem conteúdo');
    }
    else {
        console.log('Não tem conteúdo');        
    }
console.log(forca[3].textContent);


//sortear números = SORTEIA NÚMEROS ENTRE 0 E 1
const numero = parseInt(Math.random()*31);
console.log(numero);










// criando uma função
// function mensagem(){
//   alert('oi, uma função me chamou');
// }
// mensagem();