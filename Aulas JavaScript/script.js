function calculaMedia(N1, N2, N3){
    let resultado = (N1 + N2 + N3)/3;
    return resultado;
}

function calcularExame(nota){
    let resultado = 10 - nota;
    return resultado;
}

function calcularDelta(a, b, c){
    let delta = b**2 - (4*a*c);
    return delta;
}

function calcularx1(a, b, delta){
    let x1 = (-1*b + Math.sqrt(delta)) / 2 * a;
    return x1;
}

function calcularx2(a, b, delta){
    let x2 = (-1*b - Math.sqrt(delta)) / 2 * a;
    return x2;
}

function calcularCPF(cpf){
    let total = 0;    
    for (i=0;i<9;i++) { 
        total = total + ((10-i)*cpf[i]); 
    }
    primeiroDigito = 11 - (total % 11);

    total = 0;    
    for (i=0;i<10;i++) {
        total = total + ((11-i)*cpf[i]);        
    }    
    segundoDigito = 11 - (total % 11);    
    
    return (String(cpf[9]) + String(cpf[10]) == String(primeiroDigito) + String(segundoDigito));
}

function primeiro(nome){
    let nomeFinal = nome[0].toUpperCase();
    
    for (i=1;i<nome.length;i++) {
        nomeFinal = nomeFinal + nome[i].toLowerCase();
    }    

    return nomeFinal;
}

$('#inputOla').click(
    function(){  
        console.log(primeiro('wILLIAN'));
        
        // let cpfDigitado = document.getElementById("inputA").value;

        // if (calcularCPF(cpfDigitado)) {
        //     alert("Valido");
        // } else {
        //     alert("Invalido");
        // }
    }
)