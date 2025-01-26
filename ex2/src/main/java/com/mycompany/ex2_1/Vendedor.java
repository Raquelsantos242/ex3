package com.mycompany.ex2_1;

class Vendedor extends Colaborador {
    private double comissao;

    public Vendedor(String id, String nome, String telefone, double salario, double comissao) {
        super(id, nome, telefone, salario);
        this.comissao = comissao;
    }

    @Override
    public double calcSalario() { 
        return getSalario() + comissao; 
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Comissão: " + comissao);
    }
}

