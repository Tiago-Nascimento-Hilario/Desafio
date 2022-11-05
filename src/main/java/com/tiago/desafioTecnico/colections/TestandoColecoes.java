package com.tiago.desafiotecnico.colections;

import java.util.ArrayList;

public class TestandoColecoes {
    public static void main(String[] args) {

        /* Colection arrayList - Função criar uma lista dinâmica
         * Nesse exemplo criei uma classe Empresa com os atributos Nome do funcionário e matrícula, criei um construtor e os metodos get e set.
         * utilizei a colection arrayList para criar uma lista dinâmica visto outros funcionários poderam ser adicionados
         * Fiz o foreach para listar os dados dos funcionários que foram incluídos na lista.
         */
        ArrayList<Empresa> listaDEFuncionarios = new ArrayList<Empresa>();

        listaDEFuncionarios.add(new Empresa("Tiago Nascimento Hilario", 1234));
        listaDEFuncionarios.add(new Empresa("Arthur Teixeira Hilario",2345));

        for (Empresa listarEmpresa : listaDEFuncionarios) {
             System.out.println("Funcionário: "+listarEmpresa.getNomeDoFuncionario()+"\n"+"Matrícula: "+listarEmpresa.getMatriculaDoFuncionario());
             System.out.println("------------------------");
        }
    
    }
}
