package com.tiago.desafiotecnico.colections;

public class Empresa {
    String NomeDoFuncionario;
    Integer MatriculaDoFuncionario;

    public Empresa(String NomeDoFuncionario, Integer MatriculaDoFuncionario  ){
        this.NomeDoFuncionario = NomeDoFuncionario;
        this.MatriculaDoFuncionario = MatriculaDoFuncionario;
    }

    public String getNomeDoFuncionario() {
        return NomeDoFuncionario;
    }

    public void setNomeDoFuncionario(String nomeDoFuncionario) {
        NomeDoFuncionario = nomeDoFuncionario;
    }

    public Integer getMatriculaDoFuncionario() {
        return MatriculaDoFuncionario;
    }

    public void setMatriculaDoFuncionario(Integer matriculaDoFuncionario) {
        MatriculaDoFuncionario = matriculaDoFuncionario;
    }

    
    
}
