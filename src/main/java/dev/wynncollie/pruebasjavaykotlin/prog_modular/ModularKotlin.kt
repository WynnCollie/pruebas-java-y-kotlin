package dev.wynncollie.pruebasjavaykotlin.prog_modular

fun main() {
    // Declaración de variables
    var edad: Int
    val nombre: String
    val apellido1: String
    val apellido2: String

    // Entrada de datos
    val datosPersonales = recuperarDatosPersonales()
    nombre = datosPersonales[0] as String
    apellido1 = datosPersonales[1] as String
    apellido2 = datosPersonales[2] as String
    edad = datosPersonales[3] as Int

    // Salida de datos
    imprimirDatosPersonales(nombre, apellido1, apellido2, edad)

    // Condicionales
    esMayorDeEdad(edad)

    // Bucle while
    mostrarCuentaAtrasEdad(edad)

    // Bucle for
    imprimirCaracteresNombre(nombre)

    println("Programa finalizado")
}

private fun recuperarDatosPersonales(): Array<Any> {
    print("Introduzca su nombre: ")
    val nombre1 = readln()
    print("Introduzca su primer apellido: ")
    val apellido1 = readln()
    print("Introduzca su segundo apellido: ")
    val apellido2 = readln()
    print("Introduzca su edad: ")
    val edad1 = readln().toInt()

    return arrayOf(nombre1, apellido1, apellido2, edad1)
}

private fun imprimirDatosPersonales(nombre: String, apellido1: String, apellido2: String, edad: Int) {
    println("Hola $nombre $apellido1 $apellido2, tienes $edad años.")
}

private fun esMayorDeEdad(edad: Int) {
    if (edad >= 18) {
        println("Eres mayor de edad.")
    } else {
        println("Eres menor de edad.")
    }
    println()
}

private fun mostrarCuentaAtrasEdad(edad: Int) {
    var edad1 = edad
    println("Cuenta atrás desde tu edad: $edad1")
    while (edad1 != 0) {
        println(edad1)
        edad1--
    }
    println()
}

private fun imprimirCaracteresNombre(nombre: String) {
    println("Imprimiremos los caracteres de tu nombre")
    for (char in nombre) {
        println(char)
    }
    println()
}
