/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.util.Scanner;

public class A {

    public String Ligar() {

        return null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iniciar;

        System.out.println("Bem Vindo ao Sistema HelpDesk...");

        for (int x = 0; x == 0;) {
            System.out.println("");
            System.out.println("Para direcionar uma ligação - 1 / "
                    + "Para Conferir os numeros de atendimento dos atendentes - 2");
            iniciar = input.nextInt();

            if (iniciar == 1) {
                
                
                x++;
            } else if (iniciar == 2) {
               
                
                x++;
            } else {
                System.out.println("Digito Invalido Tente novamente..");
                System.out.println("");
            }
        }
    }

}
