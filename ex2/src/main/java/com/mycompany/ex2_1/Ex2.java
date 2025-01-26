package com.mycompany.ex2_1;
import java.util.Arrays;
import java.util.List;

public class Ex2 {

    public static void main(String[] args) {
        Colaborador[] colaboradores = new Colaborador[3];
        
        colaboradores[0] = new Funcionario("1", "Raquel Braga", "1234-5678", 2000.00);
        colaboradores[1] = new Gerente("2", "Sarah Guido", "1243-9865", 5500.00, 1000.00);
        colaboradores[2] = new Vendedor("3", "Pedro Brito", "1376-4584", 2500.00, 700.00);

         for (int i = 0; i < colaboradores.length; i++) {
            Colaborador colaborador = colaboradores[i];
            colaborador.exibirInformacoes();
            System.out.println();
        }
        
    }

 
}
