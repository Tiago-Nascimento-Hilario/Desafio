package com.tiago.desafiotecnico.colections;

import java.util.HashSet;

public class TestandoColecoes {
    public static void main(String[] args) {

        /* Colection hashSet - Função criar  um conjunto, não permitir duplicidade 
         * Nesse exemplo criei uma classe Empresa com os atributos Nome do funcionário e matrícula, criei um construtor e os metodos get e set.
         * utilizei a colection hashSet para criar um conjunto assim não ocorrer duplicidade visto que outros funcionários poderam ser adicionados
         * Fiz o foreach para listar os dados dos funcionários que foram incluídos no conjunto.
         */
        HashSet<Empresa> listaDEFuncionarios = new HashSet<Empresa>();

        listaDEFuncionarios.add(new Empresa("Tiago Nascimento Hilario", 1234));
        listaDEFuncionarios.add(new Empresa("Arthur Teixeira Hilario",2345));
        //Teste - Duplicidade
        listaDEFuncionarios.add(new Empresa("Tiago Nascimento Hilario", 1234));


        for (Empresa listarEmpresa : listaDEFuncionarios) {
             System.out.println("Funcionário: "+listarEmpresa.getNomeDoFuncionario()+"\n"+"Matrícula: "+listarEmpresa.getMatriculaDoFuncionario());
             System.out.println("------------------------");
        }
    
    }
}
