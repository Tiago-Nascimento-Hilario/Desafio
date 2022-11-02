package com.tiago.desafioTecnico;

/*Escreva um programa em linguagem  Java que imprime cada número de 1 até 100 em uma nova linha.

Para cada múltiplo de 3, imprima "Foo", ao invés do número.
Para cada múltiplo de 5, imprima "Baa", ao invés do número.
Para números múltiplos simultaneamente de 3 e 5, imprima "FooBaa", ao invés do número.

A sua solução deverá ser utilizando o menor número de linhas de código possível porém deve produzir um código eficiente.*/

public class Questao6 {
    public static void main(String[] args) {

        int numero = 1;
        int multiploDe3 = 3;
        int multiploDe5 = 5;

        while (numero <= 100) {

            int resultadoMultiploDe3 = numero % multiploDe3;
            int resultadoMultiploDe5 = numero % multiploDe5;

            if(resultadoMultiploDe5 == 0 && resultadoMultiploDe3 == 0){
                System.out.println("FooBaa");

            } else if (resultadoMultiploDe3 == 0) {
                System.out.println("Foo");

                } else if (resultadoMultiploDe5 == 0) {
                System.out.println("Baa");
            }
            
            else{
                System.out.println(numero);
            }

            numero++;
        }

    }

}
