package com.example.agendacontactos

fun main(){
    val miAgenda = Agenda()
    var opcion: Int

    do {
        println("--- Mi Agenda ---")
        println("1. Registrar nuevo contacto")
        println("2. Mostrar todos los contactos")
        println("3. Buscar contacto")
        println("4. Salir")
        print("Elige una opcion: ")

        opcion = try {
            readLine()?.toIntOrNull() ?: 0
        } catch (e: Exception) {
            0
        }

        when(opcion){
            1->{
                print("Ingresa el nombre del contacto:")
                val nombre=readLine().orEmpty()
                print("Ingresa el numero de telefono:")
                val telefono=readLine().orEmpty()
                miAgenda.agregarContacto(nombre,telefono)
            }
            2->{
                miAgenda.mostrarTodosLosContactos()
            }
            3->{
                print("Ingresa el nombre del contacto a buscar: ")
                val nombreBusqueda = readLine().orEmpty()
                val contactoEncontrado=miAgenda.buscarContacto(nombreBusqueda)
                if (contactoEncontrado != null) {
                    println("Contacto encontrado")
                    println("Nombre: ${contactoEncontrado.nombre}")
                    println("Telefono: ${contactoEncontrado.telefono}")
                } else {
                    println("No se encontro el contacto con el nombre '$nombreBusqueda'.")
                }
            }
            4->
                println("Saliendo de la agenda")
                else -> println("Opcion no valida.Por favor, elige un numero del 1 al 4.")

            }
            println()
        }while (opcion!=4)
    }
