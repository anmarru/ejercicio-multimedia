/*Ejercicio 3. Define las siguientes expresiones lambda en variables:
a) Calcula el cubo de un número.
b) Transforma una cadena de mayúscula a minúscula e invócala pasando
como parámetro una lista de palabras usando la función map que recibe
un lambda como parámetro.*/
package com.ejercicios.tema1

    fun cubo(a: Int): Int{
    return a*a*a
    }




 fun main() {
    println(cubo(3))



         // Lista de palabras en mayúsculas
         val palabras = listOf("HOLA", "MUNDO", "KOTLIN")

         // Usando map con una lambda para transformar a minúsculas
         val palabrasMinusculas = palabras.map { it.lowercase() }

         // Imprime la lista transformada
         println(palabrasMinusculas)

 }