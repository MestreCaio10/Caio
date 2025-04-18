function calcularExe1() {
    let num1 = Number(document.getElementById("num1").value)
    let num2 = Number(document.getElementById("num2").value)
    let num3 = Number(document.getElementById("num3").value)
    let num4 = Number(document.getElementById("num4").value)

    let soma = num1 + num2 + num3 + num4

    console.log("O Valor da Soma: " + soma)

    document.getElementById("resposta").innerHTML = "A Soma dos Quatro Números é " + soma
}

function calcularExe2() {
    let nota1 = Number(document.getElementById("nota1").value)
    let nota2 = Number(document.getElementById("nota2").value)
    let nota3 = Number(document.getElementById("nota3").value)

    let medari = (nota1 + nota2 + nota3) / 3
    let medare = medari.toFixed(1)

    console.log("A Média Aritmética é " + medare)

    document.getElementById("resposta").innerHTML = "A Média Aritmética é " + medare
}

function calcularExe4() {
    let salario = Number(document.getElementById("salario").value)
    let percentualAumento = Number(document.getElementById("percentualAumento").value)

    let percentualPadrao = salario + (salario * 0.25)
    let percentualAum = salario + (salario * (percentualAumento/100))

    console.log("O Novo Salário Com Aumento de 25% é: " + percentualPadrao)
    console.log("o Novo Salário com Aumento de Percentual Indicado Pelo User é: " + percentualAum)

    document.getElementById("respostaPadrao").innerHTML = "O Novo Salário Com Aumento de 25% é " + percentualPadrao
    document.getElementById("respostaPorcentagem").innerHTML = "O Novo Salário Com Aumento de Percentual Indicado Pelo User é " + percentualAum
}

function calcularExe5() {
    let salario = Number(document.getElementById("salario").value)
    let percentualAumento = Number(document.getElementById("percentualAumento").value)

    let percentualAum = salario + (salario * (percentualAumento/100))

    console.log("o Novo Salário com Aumento é: " + percentualAum)

    document.getElementById("respostaPorcentagem").innerHTML = "O Novo Salário Com é R$" + percentualAum
}

function calcularExe6() {

    let salario = Number(document.getElementById("salario").value);
    let gratificacao = Number(document.getElementById("gratificacao").value);
    let  descontos = Number(document.getElementById("descontos").value);

    let aumento = (salario * (gratificacao/100));
    let imposto = (salario * (descontos/100));
    let novoSalario = (salario + aumento - imposto);

    console.log("Valor do Salário: " +  salario)
    console.log("Valor da Gratificação: " + aumento)
    console.log("Valor do Desconto: " + imposto)
    console.log("Novo Salário: " + novoSalario)

    document.getElementById("respostaSalario").innerHTML = "O Salário Base é R$" + salario;
    document.getElementById("respostaGratificacao").innerHTML = "O Valor da Gratificação é R$" + aumento;
    document.getElementById("respostaDescontos").innerHTML = "O Valor dos Descontos é R$" + imposto;
    document.getElementById("respostaNovoSalario").innerHTML = "O Novo Salário é R$" + novoSalario;
    
}