/*Define una función llamada funcionMatematica, que dada un
parámetro Int y un parámetro lambda, devuelva ese número tras aplicarle esa
operación lambda.*/
package com.ejercicios.tema1


    fun funcionMatematica(numero: Int, operacion: (Int) -> Int): Int {
        return operacion(numero)
    }

    fun main() {
        // Ejemplo de uso con una lambda que duplica el número
        val resultado = funcionMatematica(5) { it * 2 }
        println("El resultado es: $resultado") // Imprime: El resultado es: 10
    }


