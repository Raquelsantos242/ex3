package com.mycompany.ex1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Digite uma sequência de números (digite 0 para terminar):");
        
        while (true) {
            String entrada = scanner.nextLine();
            if (LerNumeros(numeros, scanner, entrada)) {
                break;
            }
            
        }
         if (!numeros.isEmpty()) { 
            VerificarVezes(numeros, scanner);
            double media = calcularMedia(numeros); 
            VerificarMaioresOuIguais(numeros, media); 
        } else {
            System.out.println("Nenhum número válido foi inserido.");
        }

        scanner.close(); 
    }

        
    public static boolean LerNumeros(ArrayList<Integer> numeros, Scanner scanner, String entrada) {
    while (true) {  
        try {
            if (numeros.size() >= 10) {
                System.out.println("Você atingiu o número máximo de entradas permitidas (10 números).");
                return true; 
            }

            if (entrada.equals("0")) {
                return true;
            }

            try {
                int numero = Integer.parseInt(entrada); 
                numeros.add(numero);  
                return false;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, digite um número inteiro válido.");
                return true;
            }
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
            return true;
        }
    }
}


    public static void VerificarVezes(ArrayList<Integer> numeros, Scanner scanner) {
        System.out.println("Digite o número que deseja verificar quantas vezes aparece:");
        int numeroBuscado = scanner.nextInt(); 
        int contador = 0;
        for (int i = 0; i < numeros.size(); i++) { 
        int numero = numeros.get(i);
        if (numero == numeroBuscado) {
            contador++;
        }
    }

        System.out.println("O número " + numeroBuscado + " aparece " + contador + " vez(es) no vetor.");
    }

    public static double calcularMedia(ArrayList<Integer> numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            int numero = numeros.get(i); 
            soma += numero; 
}
        double media = (double) soma / numeros.size();

        System.out.println("Média: " + media);
        return media; 
    }

    public static void  VerificarMaioresOuIguais(ArrayList<Integer> numeros, double media) {
        ArrayList<Integer> numeros_maiores_ou_iguais = new ArrayList<>();

        for (int i = 0; i < numeros.size(); i++) {
            int numero = numeros.get(i); 
            if (numero >= media) { 
              numeros_maiores_ou_iguais.add(numero);
    }
}

        System.out.println("Números maiores ou iguais à média: " + numeros_maiores_ou_iguais);
    }
}


