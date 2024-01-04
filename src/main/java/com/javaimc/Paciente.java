package com.javaimc;

import java.util.HashMap;
import java.util.Map;

public class Paciente {

    private Double peso;
    private Double altura;

    /*
     * Baixo peso muito grave = IMC abaixo de 16 kg/m²
     * 
     * Baixo peso grave = IMC entre 16 e 16,99 kg/m²
     * 
     * Baixo peso = IMC entre 17 e 18,49 kg/m²
     * 
     * Peso normal = IMC entre 18,50 e 24,99 kg/m²
     * 
     * Sobrepeso = IMC entre 25 e 29,99 kg/m²
     * 
     * Obesidade grau I = IMC entre 30 e 34,99 kg/m²
     * 
     * Obesidade grau II = IMC entre 35 e 39,99 kg/m²
     * 
     * Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²
     */

    public Paciente(Double peso, Double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    private Double calcularIMC() {
        return peso / (altura * altura);
    }

    public void diagnostico() {
        // Criando um HashMap com valores dos intervalos de IMC

        Map<Boolean, String> mapaDiagnostico = new HashMap<Boolean, String>() {
            {
                put((calcularIMC() < 16d), "Baixo peso muito grave");
                put((calcularIMC() > 16d && calcularIMC() < 16.99d), "Baixo peso grave");
                put((calcularIMC() > 17d && calcularIMC() < 18.49d), "Baixo peso");
                put((calcularIMC() > 18.50d && calcularIMC() < 24.99d), "Peso normal");
                put((calcularIMC() > 25d && calcularIMC() < 29.99d), "Sobrepeso");
                put((calcularIMC() > 30d && calcularIMC() < 34.99d), "Obesidade grau I");
                put((calcularIMC() > 35d && calcularIMC() < 39.99d), "Obesidade grau II");
                put((calcularIMC() >= 40d), "Obesidade grau III (obesidade mórbida)");
            }
        };
        for (Boolean chave : mapaDiagnostico.keySet()) {
            if (chave) {
                System.out.println("Diagnóstico: " + mapaDiagnostico.get(chave));
            }

        }
    }
}
