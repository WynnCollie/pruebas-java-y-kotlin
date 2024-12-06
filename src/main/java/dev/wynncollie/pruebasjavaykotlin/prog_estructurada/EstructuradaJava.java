package dev.wynncollie.pruebasjavaykotlin.prog_estructurada;

import java.util.Scanner;

public class EstructuradaJava {
    public static void main(String[] args) {
        // Declaración de variables
        int edad;
        String nombre;
        String apellido1;
        String apellido2;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca su nombre:");
        nombre = scanner.nextLine();
        System.out.println("Introduzca su primer apellido:");
        apellido1 = scanner.nextLine();
        System.out.println("Introduzca su segundo apellido:");
        apellido2 = scanner.nextLine();
        System.out.println("Introduzca su edad:");
        edad = scanner.nextInt();

        // Salida de datos
        System.out.println("Hola " + nombre + " " + apellido1 + " " + apellido2 + ", tienes " + edad + " años.");

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
        System.out.println();

        // Bucle while
        System.out.println("Cuenta atrás desde tu edad: " + edad);
        while (edad != 0) {
            System.out.println(edad);
            edad--; // edad = edad - 1 || edad -= 1
        }
        System.out.println();
        // Bucle for
        System.out.println("Imprimiremos los caracteres de tu nombre");
        for (int i = 0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(i));
        }
        System.out.println();
        System.out.println("Programa finalizado");
    }
}
