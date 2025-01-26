package com.mycompany.ex2_1;

abstract class Colaborador {
    private String id;
    private String nome;
    private String telefone;
    private double salario;

    
    public Colaborador(String id, String nome, String telefone, double salario) {
        this.id = id; 
        this.nome = nome;
        this.telefone = telefone;
        this.salario = salario;
    }

     public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    public abstract double calcSalario();

    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Salário Fixo: " + salario);
        System.out.println("Salário Total: " + calcSalario());
    }
}
