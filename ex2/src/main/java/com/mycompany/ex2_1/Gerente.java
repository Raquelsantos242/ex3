package com.mycompany.ex2_1;

class Gerente extends Colaborador {
    private double bonus;

    public Gerente(String id, String nome, String telefone, double salario, double bonus) {
        super(id, nome, telefone, salario);
        this.bonus = bonus;
    }

    @Override
    public double calcSalario() {
        return getSalario() + bonus;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Bônus: " + bonus);
    }
}

