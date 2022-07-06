package javaBasico;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro número");
        int número1 = entrada.nextInt();

        System.out.println("informe o segundo número");
        int número2 = entrada.nextInt();

        int resultado = número1 + número2;

        System.out.println("a soma dos dois números é: " + resultado);
    }
}
