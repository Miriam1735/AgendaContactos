package com.example.agendacontactos

class Agenda {
    private val contactos = mutableListOf<Contacto>()

    fun agregarContacto(nombre: String, telefono: String)
    {
        val nuevoContacto = Contacto(nombre, telefono)
        contactos.add(nuevoContacto)
        println("Contacto '$nombre' agregado con exito.")
    }

    fun mostrarTodosLosContactos() {
        if (contactos.isEmpty()) {
            println("Agenda vacía.No hay contactos para mostrar.")
            return
        }
        println("\n--- Lista de Contactos ---")
        contactos.forEachIndexed { index, contacto ->
            println("${index + 1}. Nombre: ${contacto.nombre} - Telefono: ${contacto.telefono}")
        }

    }

    fun buscarContacto(nombre:String):Contacto?{
        return contactos.find{
            it.nombre.equals(nombre,ignoreCase = true)}
        }
    }



