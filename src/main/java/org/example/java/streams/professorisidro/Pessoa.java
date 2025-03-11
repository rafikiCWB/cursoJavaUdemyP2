package org.example.java.streams.professorisidro;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Pessoa {
    private int id;
    private String nome;
    private String email;
    private String cpf;
    private int idade;

}
