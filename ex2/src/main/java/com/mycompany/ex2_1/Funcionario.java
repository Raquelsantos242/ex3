package com.mycompany.ex2_1;

class Funcionario extends Colaborador {

    public Funcionario(String id, String nome, String telefone, double salario) {
        super(id, nome, telefone, salario);
    }

    @Override
public double calcSalario() {
    return getSalario(); 
}

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
    }
}

