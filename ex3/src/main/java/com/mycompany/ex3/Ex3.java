package com.mycompany.ex3;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeContas gerenciador = new GerenciadorDeContas("C:\\Users\\55219\\Documents\\NetBeansProjects\\ex3\\contas.csv");
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Incluir conta");
            System.out.println("2. Alterar saldo");
            System.out.println("3. Excluir conta");
            System.out.println("4. Consultar contas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("ID da conta: ");
                    String id = scanner.nextLine();
                    System.out.print("Nome do correntista: ");
                    String nome = scanner.nextLine();
                    try {
                        System.out.print("Saldo inicial: ");
                        double saldo = scanner.nextDouble();
                        gerenciador.incluirConta(id, nome, saldo);
                    } catch (Exception e) {
                        System.out.println("Erro: O saldo deve ser um número válido.(número inteiro ou com vírgula)");
                        scanner.nextLine(); 
                    }
                    break;

                    case 2:
                    System.out.print("ID da conta: ");
                    id = scanner.nextLine();
                     try {
                        System.out.print("Valor para creditar ou debitar: ");
                        double valor = scanner.nextDouble();
                        System.out.print("Tipo de operação (1 para creditar, 2 para debitar): ");
                        int tipo = scanner.nextInt();
                        boolean isCredito;
                        if (tipo == 1) {
                            isCredito = true;
                        } else {
                            isCredito = false;
                        }
                        gerenciador.alterarSaldo(id, valor, isCredito);
                    } catch (Exception e) {
                        System.out.println("Erro: O valor deve ser um número válido (número inteiro ou com vírgula).");
                        scanner.nextLine();  
                    }
                    break;

                case 3:
                    System.out.print("ID da conta: ");
                    id = scanner.nextLine();
                    gerenciador.excluirConta(id);
                    break;

                case 4:
                gerenciador.consultarContas();
                    break;

                case 5:
                gerenciador.salvarContasNoArquivo();
                    System.out.println("Dados salvos. Saindo...");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

    }
}
