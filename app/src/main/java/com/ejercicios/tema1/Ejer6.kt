/*Crea una función llamada procesarPares, que reciba una lista de
números y debe:
• Verificar que todos los números de la lista sean pares.
• En caso de ser todos pares debe multiplicar cada uno de ellos por 4 y
devolver la lista modificada.
• En caso de no ser todos pares se debe calcular el cubo de cada número y
devolver la lista modfiicada.
• En caso de recibir una lista vacía devuelve null.*/
package com.ejercicios.tema1

fun procesarPares(lista: List<Int>): List<Int>? {
    // Verificar si la lista está vacía
    if (lista.isEmpty()) return null

    // Verificar si todos los números de la lista son pares
    return if (lista.all { it % 2 == 0 }) {
        // Si todos son pares, multiplicar cada número por 4
        lista.map { it * 4 }
    } else {
        // Si no todos son pares, calcular el cubo de cada número
        lista.map { it * it * it }
    }
}

fun main() {
    // Ejemplos de uso
    val listaPares = listOf(2, 4, 6, 8)
    val listaNoPares = listOf(1, 3, 5, 7)
    val listaMixta = listOf(2, 3, 6, 7)
    val listaVacia = listOf<Int>()

    println("Lista de pares multiplicados por 4: ${procesarPares(listaPares)}")
    println("Lista de impares al cubo: ${procesarPares(listaNoPares)}")
    println("Lista mixta al cubo: ${procesarPares(listaMixta)}")
    println("Lista vacía: ${procesarPares(listaVacia)}")
}

