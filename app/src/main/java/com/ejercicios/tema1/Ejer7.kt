package com.ejercicios.tema1

/*Crea un sistema simple para gestionar vehículos. Debes
implementar una clase Coche (marca, modelo, año) y una clase Concesionario
(nombre). El concesionario debe permitir la agregación de coches a su

concesionario. Para ello, coches será una lista que se inicializa vacía en la clase
Concesionario.*/

// Clase Coche
class Coche(val marca: String, val modelo: String, val anio: Int) {
    // Método para mostrar información del coche
    fun mostrarInfo(): String {
        return "Coche: Marca=$marca, Modelo=$modelo, Año=$anio"
    }
}

// Clase Concesionario
class Concesionario(val nombre: String) {
    // Lista para almacenar los coches
    private val coches: MutableList<Coche> = mutableListOf()

    // Método para agregar un coche al concesionario
    fun agregarCoche(coche: Coche) {
        coches.add(coche)
        println("Coche agregado: ${coche.mostrarInfo()}")
    }

    // Método para mostrar todos los coches del concesionario
    fun mostrarCoches() {
        if (coches.isEmpty()) {
            println("El concesionario '$nombre' no tiene coches.")
        } else {
            println("Coches en el concesionario '$nombre':")
            coches.forEach { coche ->
                println(coche.mostrarInfo())
            }
        }
    }
}

fun main() {
    // Crear un concesionario
    val concesionario = Concesionario("AutoManía")

    // Crear algunos coches
    val coche1 = Coche("Toyota", "Corolla", 2020)
    val coche2 = Coche("Honda", "Civic", 2021)
    val coche3 = Coche("Ford", "Mustang", 2022)

    // Agregar coches al concesionario
    concesionario.agregarCoche(coche1)
    concesionario.agregarCoche(coche2)
    concesionario.agregarCoche(coche3)

    // Mostrar los coches en el concesionario
    concesionario.mostrarCoches()
}



