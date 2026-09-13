package ru.kmpcourse.kmp01.data

import kmp01.shared.generated.resources.Res
import kmp01.shared.generated.resources.poster_01
import kmp01.shared.generated.resources.poster_02
import kmp01.shared.generated.resources.poster_03
import kmp01.shared.generated.resources.poster_04
import kmp01.shared.generated.resources.poster_05
import kmp01.shared.generated.resources.poster_06
import kmp01.shared.generated.resources.poster_07
import kmp01.shared.generated.resources.poster_08
import kmp01.shared.generated.resources.poster_09
import kmp01.shared.generated.resources.poster_10
import ru.kmpcourse.kmp01.model.Movie

/** Учебная заглушка: десять фильмов с постерами-плашками. Настоящие данные придут из сети на четвёртом вечере. */
object FakeMovies {
    val all: List<Movie> = listOf(
        Movie(1, "Побег из Шоушенка", 1994, 9.1, 142, "Бухгалтер Энди Дюфрейн осуждён за убийство, которого не совершал, и годами строит план побега.", Res.drawable.poster_01),
        Movie(2, "Зелёная миля", 1999, 9.1, 189, "Надзиратель блока смертников встречает заключённого с необъяснимым даром.", Res.drawable.poster_02),
        Movie(3, "Форрест Гамп", 1994, 8.9, 142, "Простодушный человек оказывается свидетелем и участником главных событий второй половины века.", Res.drawable.poster_03),
        Movie(4, "Начало", 2010, 8.7, 148, "Команда специалистов внедряет идею в сознание через многослойный сон.", Res.drawable.poster_04),
        Movie(5, "Интерстеллар", 2014, 8.6, 169, "Экспедиция сквозь червоточину в поисках планеты, пригодной для жизни.", Res.drawable.poster_05),
        Movie(6, "Криминальное чтиво", 1994, 8.6, 154, "Несколько историй из жизни Лос-Анджелеса, рассказанных не по порядку.", Res.drawable.poster_06),
        Movie(7, "Властелин колец: Братство Кольца", 2001, 8.6, 178, "Хоббит Фродо отправляется в путь, чтобы уничтожить Кольцо Всевластья.", Res.drawable.poster_07),
        Movie(8, "Гладиатор", 2000, 8.6, 155, "Преданный генерал становится гладиатором и идёт мстить императору.", Res.drawable.poster_08),
        Movie(9, "Бойцовский клуб", 1999, 8.6, 139, "Страдающий бессонницей клерк и продавец мыла основывают подпольный клуб.", Res.drawable.poster_09),
        Movie(10, "Матрица", 1999, 8.5, 136, "Хакер Нео узнаёт, что привычный мир — симуляция, и выбирает красную таблетку.", Res.drawable.poster_10),
    )
}
