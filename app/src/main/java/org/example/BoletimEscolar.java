package org.example;

import org.example.model.Aluno;

import java.util.Arrays;

public class BoletimEscolar {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", Arrays.asList(6.0, 8.0, 7.0));
        aluno.exibirInformacoes();

    }
}
