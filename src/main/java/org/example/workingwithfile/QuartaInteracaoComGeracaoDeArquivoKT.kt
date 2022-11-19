package org.example.workingwithfile

import java.io.File
import java.util.*

object QuartaInteracaoComGeracaoDeArquivoKT {
    @JvmStatic
    fun main(args: Array<String>) {
        val teclado = Scanner(System.`in`)
        print("Entre com o caminho do arquivo: ")

        val caminho = teclado.nextLine()
        val path = File(caminho)
        val folders = path.listFiles { obj: File -> obj.isDirectory }
        println("Pastas")
        for (pasta in folders) {
            println(pasta)
        }
        val files = path.listFiles { obj: File -> obj.isFile }
        println("Arquivos")
        for (arquivo in files) {
            println(arquivo)
        }
        val success = File("$caminho\\subpasta").mkdir()
        println("Diretório criado com sucesso: $success")
        teclado.close()
    }
}