package org.example.workingwithfile

import org.apache.commons.logging.LogFactory
import java.io.BufferedWriter
import java.io.FileWriter
import java.io.IOException

object CriandoArquivos {
    private val LOG = LogFactory.getLog(CriandoArquivos::class.java)
    @JvmStatic
    fun main(args: Array<String>) {
        val lines = arrayOf("Good morning", "Good afternoon", "Good night")
        val path = "C:\\temp\\teste.txt"
        try {
            BufferedWriter(FileWriter(path)).use { bw ->
                for (line in lines) {
                    bw.write(line)
                    bw.newLine()
                    LOG.info(String.format("Linha %s escrita com sucesso", line))
                    println(String.format("Line %s written", line))
                }
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}