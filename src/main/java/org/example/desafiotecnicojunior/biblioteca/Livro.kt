package org.example.desafiotecnicojunior.biblioteca

data class Livro(var titulo: String, private var autor: String, var anoPublicacao: Int) {
    override fun toString(): String {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}'
    }
}
