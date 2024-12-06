package dev.wynncollie.pruebasjavaykotlin.prog_modular;

import java.util.Scanner;

public class ModularJava {
    public static void main(String[] args) {
        // Declaración de variables
        int edad;
        String nombre;
        String apellido1;
        String apellido2;

        // Entrada de datos
        Object[] datosPersonales = recuperarDatosPersonales();
        nombre = (String) datosPersonales[0];
        apellido1 = (String) datosPersonales[1];
        apellido2 = (String) datosPersonales[2];
        edad = (int) datosPersonales[3];

        // Salida de datos
        imprimirDatosPersonales(nombre, apellido1, apellido2, edad);
        
        // Condicionales
        esMayorDeEdad(edad);

        // Bucle while
        cuentaAtrasEdad(edad);
        
        // Bucle for
        imprimirCaracteresNombre(nombre);

        System.out.println("Programa finalizado");
    }

    private static void imprimirCaracteresNombre(String nombre) {
        System.out.println("Imprimiremos los caracteres de tu nombre");
        for (int i = 0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(i));
        }
        System.out.println();
    }

    private static void cuentaAtrasEdad(int edad) {
        System.out.println("Cuenta atrás desde tu edad: " + edad);
        while (edad != 0) {
            System.out.println(edad);
            edad--; // edad = edad - 1 || edad -= 1
        }
        System.out.println();
    }

    private static Object[] recuperarDatosPersonales() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca su nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Introduzca su primer apellido:");
        String apellido1 = scanner.nextLine();
        System.out.println("Introduzca su segundo apellido:");
        String apellido2 = scanner.nextLine();
        System.out.println("Introduzca su edad:");
        int edad = scanner.nextInt();

        return new Object[]{nombre, apellido1, apellido2, edad};
    }

    private static void imprimirDatosPersonales(String nombre, String apellido1, String apellido2, int edad) {
        System.out.println("Hola " + nombre + " " + apellido1 + " " + apellido2 + ", tienes " + edad + " años.");
    }

    private static void esMayorDeEdad(int edad) {
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
        System.out.println();
    }
    
}
