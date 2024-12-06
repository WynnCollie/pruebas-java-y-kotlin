package dev.wynncollie.pruebasjavaykotlin.prog_estructurada

fun main() {
    // Declaración de variables
    var edad: Int
    val nombre: String
    val apellido1: String
    val apellido2: String

    // Entrada de datos
    print("Introduzca su nombre: ")
    nombre = readln()
    print("Introduzca su primer apellido: ")
    apellido1 = readln()
    print("Introduzca su segundo apellido: ")
    apellido2 = readln()
    print("Introduzca su edad: ")
    edad = readln().toInt()
    // Salida de datos
    println("Hola $nombre $apellido1 $apellido2, tienes $edad años.")

    if (edad >= 18) {
        println("Eres mayor de edad.")
    } else {
        println("Eres menor de edad.")
    }
    println()

    // Bucle while
    println("Cuenta atrás desde tu edad: $edad")
    while (edad != 0) {
        println(edad)
        edad--
    }
    println()
    // Bucle for
    println("Imprimiremos los caracteres de tu nombre")
    for (char in nombre) {
        println(char)
    }
    println()
    println("Programa finalizado")
}