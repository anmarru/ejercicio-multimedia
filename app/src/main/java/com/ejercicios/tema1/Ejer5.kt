/*Crea una función llamada filtrarPorRango que reciba una lista de
números, un valor mínimo y un valor máximo. La función debe filtrar los números
que estén entre minValue y maxValue (inclusive).*/
package com.ejercicios.tema1


fun filtrarPorRango(lista: List<Int>, minValue: Int, maxValue: Int): List<Int> {
    return lista.filter { it in minValue..maxValue }
}

fun main() {
    // Ejemplo de uso
    val numeros = listOf(1, 5, 10, 15, 20, 25)
    val resultado = filtrarPorRango(numeros, 10, 20)
    println("Números filtrados: $resultado") // Imprime: Números filtrados: [10, 15, 20]
}
