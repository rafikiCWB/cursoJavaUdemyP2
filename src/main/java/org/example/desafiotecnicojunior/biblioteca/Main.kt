package org.example.desafiotecnicojunior.biblioteca

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val biblioteca = Biblioteca()
        biblioteca.adicionarLivro(Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954))
        biblioteca.adicionarLivro(Livro("1984", "George Orwell", 1949))
        biblioteca.adicionarLivro(Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943))

        println("\nListar livros")
        biblioteca.listarLivros()

        println("\nBuscando por um livro específico:")
        biblioteca.buscarLivroPorTitulo("1984")
    }
}
