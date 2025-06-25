package org.example.model;

import java.util.List;

public class Aluno {
    private String nome;
    private List<Double> notas;

    public Aluno(String nome, List<Double> notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public double calcularMedia(){
        return notas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    public String getSituacao() {
        double media = calcularMedia();

        return Classificador.classificar.apply(media);
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Notas: " + notas);
        System.out.printf("Média: %.2f%n", calcularMedia());
        System.out.println("Situação: " + getSituacao());
    }
}
