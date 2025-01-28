package com.mycompany.ex3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class GerenciadorDeContas {
    private List<Conta> contas;
    private String caminhoArquivo;

    public GerenciadorDeContas(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
        this.contas = new ArrayList<>();
        carregarContas();
    }

    private void carregarContas() {
        try (BufferedReader br = Files.newBufferedReader(Paths.get(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(","); 
                String id = dados[0];
                String nome = dados[1];
                double saldo = Double.parseDouble(dados[2]);
                contas.add(new Conta(id, nome, saldo));
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
 public void salvarContasNoArquivo() {
        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(caminhoArquivo))) {
            for (int i = 0; i < contas.size(); i++) {
                Conta conta = contas.get(i);
                bw.write(conta.toString()); 
                bw.newLine(); 
}
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }

    public void incluirConta(String id, String nome, double saldo) {
        
        if (saldo <= 0) {
            System.out.println("Erro: O saldo inicial deve ser maior ou igual a zero.");
            return;
        }
        
        for (int i = 0; i < contas.size(); i++) {
            Conta conta = contas.get(i);
            if (conta.getId().equals(id)) {
                System.out.println("Erro: ID da conta já existe. Tente outro.");
                return;
    }
}

        contas.add(new Conta(id, nome, saldo));
        System.out.println("Conta adicionada com sucesso.");
      } 
    
public void alterarSaldo(String id, double valor, boolean isCredito) {
    
    if (valor <= 0) {
        System.out.println("Erro: O valor deve ser maior que zero.");
        return;
    }

    for (int i = 0; i < contas.size(); i++) {
    Conta conta = contas.get(i);
    if (conta.getId().equals(id)) {
        if (isCredito) { 
            conta.setSaldo(conta.getSaldo() + valor);
            System.out.println("Crédito realizado com sucesso. Novo saldo: " + conta.getSaldo());
        } else {
            if (conta.getSaldo() >= valor) {
                conta.setSaldo(conta.getSaldo() - valor);
                System.out.println("Débito realizado com sucesso. Novo saldo: " + conta.getSaldo());
            } else {
                System.out.println("Saldo insuficiente para realizar o débito.");
            }
        }
        return;
    }
}

    System.out.println("Conta não encontrada.");
}

   public void excluirConta(String id) {
    for (int i = 0; i < contas.size(); i++) {
        Conta conta = contas.get(i); 
        if (conta.getId().equals(id)) {
            if (conta.getSaldo() == 0) {
                contas.remove(i); 
                System.out.println("Conta excluída com sucesso.");
            } else {
                System.out.println("Erro: O saldo da conta precisa ser zero para exclusão.");
            }
            return;
        }
    }
    System.out.println("Essa conta não existe.");
}
   
    public void consultarContas() {
        for (int i = 0; i < contas.size(); i++) {
            Conta conta = contas.get(i);
            System.out.println("ID: " + conta.getId() + ", Nome: " + conta.getNome() + ", Saldo: " + conta.getSaldo());
}

    }
}
