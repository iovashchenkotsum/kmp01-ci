package ru.kmpcourse.kmp01

import ru.kmpcourse.kmp01.data.FakeMovies
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class SharedCommonTest {

    @Test
    fun fakeMoviesHasTenUniqueIds() {
        assertEquals(10, FakeMovies.all.size)
        assertEquals(10, FakeMovies.all.map { it.id }.toSet().size)
    }

    @Test
    fun ratingsAreWithinTenPointScale() {
        assertTrue(FakeMovies.all.all { it.rating in 0.0..10.0 })
    }
}
