package org.example.app.workingwithfile.rocket;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Cadastro {
    String nome;
    String sexo;
    Long telefone;
    LocalDate dataNascimento;
    Double valorSugerido;
    boolean cliente;

    public Cadastro(String nome, String sexo, Long telefone, LocalDate dataNascimento, Double valorSugerido, boolean cliente) {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.valorSugerido = valorSugerido;
        this.cliente = cliente;
    }


    public static void escreverLayoutDelimitado(List<Cadastro> cadastros) {
        System.out.println("***** - LAYOUT DELIMITADO - ******");
        try {
            StringBuilder conteudo = getModeloDelimitado(cadastros);
            System.out.println(conteudo.toString());
            Path arquivoDestino = Paths.get("C:\\temp\\rocket\\lista-contato-modelo-delimitado.csv");
            Files.write(arquivoDestino, conteudo.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static @NotNull StringBuilder getModeloDelimitado(List<Cadastro> cadastros) {
        StringBuilder conteudo = new StringBuilder();
        for (Cadastro cadastro : cadastros) {
            conteudo.append(cadastro.getNome() + ";");
            conteudo.append(STR."\{cadastro.getSexo()};");
            conteudo.append(cadastro.getTelefone() + ";");
            conteudo.append(cadastro.getDataNascimento() + ";");
            conteudo.append(cadastro.getValorSugerido() + ";");
            conteudo.append(cadastro.isCliente() + ";");
            conteudo.append(System.lineSeparator());
        }
        return conteudo;
    }

    public static void main(String[] args) {
        //Nossos cadastros na forma de objetos
        List<Cadastro> cadastros = new ArrayList<>();
        cadastros.add(new Cadastro("Joemia Giron Lyrio Monnerat", "F", 8321485886L, LocalDate.of(1984, 6, 30), 35.0, false));
        cadastros.add(new Cadastro("Rafael Grando", "M", 4891234567L, LocalDate.of(1984, 6, 30), 35.0, true));
        cadastros.add(new Cadastro("Joemia Giron Lyrio Monnerat", "F", 8321485886L, LocalDate.of(1984, 6, 30), 35.0, false));
        cadastros.add(new Cadastro("Polliana Carvalhor", "M", 4891234567L, LocalDate.of(1984, 6, 30), 35.0, true));
        cadastros.add(new Cadastro("Joemia Giron Lyrio Monnerat", "F", 8321485886L, LocalDate.of(1984, 6, 30), 35.0, false));

        escreverLayoutDelimitado(cadastros);
        escreverLayoutPosicional(cadastros);
//        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
//        System.out.println(numberFormat.format(0));


    }

    public static void escreverLayoutPosicional(List<Cadastro> cadastros) {
        System.out.println("***** - LAYOUT POSICIONAL - ******");

        try {
            StringBuilder conteudo = new StringBuilder();
            for (Cadastro cadastro : cadastros) {
                String nome = cadastro.getNome();
                if (nome.length() > 30) {
                    nome = nome.substring(0, 30);
                }
                if (nome.length() < 30) {
                    nome = String.format("%-30s", nome);
                }
                conteudo.append(nome);
                conteudo.append(cadastro.getSexo().toUpperCase());
                conteudo.append(cadastro.getTelefone());
                conteudo.append(cadastro.getDataNascimento());

//            DecimalFormat decimalFormat = new DecimalFormat("#0000.00");

                NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
                String valorFormatado = numberFormat.format(cadastro.getValorSugerido());

                conteudo.append(valorFormatado.replaceAll("\\,", "\\."));
                conteudo.append(cadastro.isCliente() ? "1" : "0");

                // nova linha
                conteudo.append(System.lineSeparator());

            }
            System.out.println(conteudo.toString());

            Path arquivoDestino = Paths.get("C:\\temp\\rocket\\lista-contato-modelo-posicional.csv");
            Files.writeString(arquivoDestino, conteudo.toString(), StandardOpenOption.CREATE);

        } catch (IOException ex) {
            ex.getMessage();
        }

    }
}
