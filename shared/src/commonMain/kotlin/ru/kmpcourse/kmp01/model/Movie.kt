package ru.kmpcourse.kmp01.model

import org.jetbrains.compose.resources.DrawableResource

/** Фильм в списке и в карточке. Поля неизменяемые: экран их только показывает. */
data class Movie(
    val id: Int,
    val title: String,
    val year: Int,
    val rating: Double,
    val durationMinutes: Int,
    val description: String,
    val poster: DrawableResource,
)
