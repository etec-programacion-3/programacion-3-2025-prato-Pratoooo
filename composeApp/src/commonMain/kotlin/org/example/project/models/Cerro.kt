package org.example.project.models

import kotlinx.serialization.Serializable

@Serializable
data class Cerro(
    val id: Int,
    val nombre: String,
    val altura: Int,
    val dificultad: String,
    val descripcion: String,
    val latitud: Double,
    val longitud: Double
)
