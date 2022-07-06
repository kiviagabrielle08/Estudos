package javaBasico;

import java.util.Scanner;

public class Exercício02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("informe o primeiro número");
        int numero1 = entrada.nextInt();

        System.out.println("informe o segundo número");
        int numero2 =  entrada.nextInt();

        System.out.println("a soma do número1 e número2 é: " + (numero1 + numero2));
        System.out.println("a subtracao do número1 e número2 é: " + (numero1 - numero2));
        System.out.println("a divisao do número1 e número2 é: " + (numero1 / numero2 ) );
        System.out.println("a multplicacao do número1 e número2 é: " + (numero1 * numero2 ) ) ;

    }

}
