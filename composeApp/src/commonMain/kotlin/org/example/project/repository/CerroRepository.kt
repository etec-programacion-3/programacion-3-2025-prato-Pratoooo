package org.example.project.repository

import org.example.project.models.Cerro

interface CerroRepository {
    /**
     * Obtiene todos los cerros disponibles.
     */
    suspend fun getCerros(): List<Cerro>

    /**
     * Busca un cerro por su ID.
     * @param id Identificador del cerro
     * @return El cerro encontrado o null si no existe
     */
    suspend fun getCerroById(id: Int): Cerro?
}
