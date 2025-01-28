package com.mycompany.ex3;

class Conta {
    private String id;
    private String nome;
    private double saldo;

    public Conta(String id, String nome, double saldo) {
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return id + "," + nome + "," + saldo;
    }
}
