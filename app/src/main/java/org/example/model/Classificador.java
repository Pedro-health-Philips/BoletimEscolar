package org.example.model;

import java.util.function.Function;

public class Classificador {
    public static Function<Double, String> classificar = media -> {
        if (media >= 7.0) return "Aprovado";
        else if (media >= 5.0) return "Recuperação";
        else return "Reprovado";
    };
}
