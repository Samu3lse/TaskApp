package jedi.projeto.taskapp.enumeration;


import lombok.AllArgsConstructor;

import lombok.Getter;


@Getter
@AllArgsConstructor

public enum DiaSemanaEnum {

    DOMINGO("Domingo"),
    SEGUNDA_FEIRA("Segunda-feira"),
    TERCA_FEIRA("Terça-feira"),
    QUARTA_FEIRA("Quarta-feira"),
    QUINTA_FEIRA("Quinta-feira"),
    SEXTA_FEIRA("Sexta-feira"),
    SABADO("Sábado");

    private String nome;

    public static DiaSemanaEnum getByNome(String nome){
        for (DiaSemanaEnum diaSemana : DiaSemanaEnum.values()){
            if (diaSemana.getNome().equals(nome)){
                return diaSemana;
            }
        }
        return null;
    }
}
