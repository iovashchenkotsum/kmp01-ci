package homework

import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Проверка домашнего 1. Скопируйте этот файл в shared/src/commonTest/kotlin/homework/
 * и запустите: зелёный тест — критерий сдачи. Имена классов и функций — как в OrderScreen.java.
 */
class OrderTest {

    @Test
    fun packingByDefault() {
        assertEquals("Собираем…", OrderScreen().render())
    }

    @Test
    fun onWayShowsCourier() {
        val screen = OrderScreen()
        screen.state = OnWay(Order(7, 1200), "Иван")
        assertEquals("Везёт Иван", screen.render())
    }

    @Test
    fun deliveredShowsTotalAndCommentAfterRepeat() {
        val screen = OrderScreen()
        screen.state = Delivered(Order(7, 1200))
        assertEquals("1200 ₽", screen.render())
        screen.onRepeat()
        assertEquals("1200 ₽, Повторить", screen.render())
    }

    @Test
    fun cancelledShowsReason() {
        val screen = OrderScreen()
        screen.state = Cancelled("Нет курьера")
        assertEquals("Нет курьера", screen.render())
    }

    @Test
    fun emptyOrderAndMoney() {
        assertEquals(Order(0, 0), Order.empty())
        assertEquals("7 ₽", 7.money())
    }
}
