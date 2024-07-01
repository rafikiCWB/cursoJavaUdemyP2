package org.example.desafiotecnicojunior.biblioteca

import java.util.function.Consumer

class Biblioteca {
    private val livro: MutableList<Livro> = ArrayList()

    fun adicionarLivro(livro: Livro) {
        this.livro.add(livro)
    }

    fun listarLivros() {
        livro.forEach(Consumer { x: Livro? -> println(x) })
    }

    fun buscarLivroPorTitulo(titulo: String?) {
        livro.forEach(Consumer { livro: Livro ->
            if (livro.titulo.equals(titulo, ignoreCase = true)) {
                println(livro)
            }
        })
    }
}


