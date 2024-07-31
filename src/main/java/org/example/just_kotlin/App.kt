package org.example.just_kotlin

class App {
}

fun main() {
    var soma = 0
    var numero = 2 // Começa com o primeiro número par

    while (numero <= 10) {
        soma = soma + numero // Adiciona o número par à soma
        numero = numero + 2    // Avança para o próximo número par
    }

    println("A soma dos números pares de 1 a 10 é: $soma")
    comparacao(true, false)

}


fun comparacao(a: Boolean, b: Boolean) {

  if (a == true && b == true){
      println(true)
  } else {
      println(false)
  }
}