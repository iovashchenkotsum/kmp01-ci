// Домашнее к занятию 1: переписать на Kotlin без единого !! и без else в when.
// В двух фразах обосновать: где data class, где object, где расширение.

class Order {
    private final int number;
    private final int total;
    private String comment;          // может быть не задан
    Order(int number, int total) {
        this.number = number;
        this.total = total;
    }
    int getNumber() { return number; }
    int getTotal() { return total; }
    String getComment() { return comment; }
    void setComment(String c) { comment = c; }
    static Order empty() {
        return new Order(0, 0);
    }
    public boolean equals(Object o) {
        return o instanceof Order
            && number == ((Order) o).number;
    }
    public int hashCode() { return number; }
}

class Delivery {
    static final int ON_WAY = 1, DELIVERED = 2, CANCELLED = 3;
    int kind;        // 0 — заказ ещё собирают
    Order order;     // в пути и доставлен
    String courier;  // только в пути
    String reason;   // только при отмене
}

class OrderScreen {
    Delivery state = new Delivery();
    Runnable onRepeat = new Runnable() {
        public void run() {
            state.order.setComment("Повторить");
        }
    };
    static String money(int total) {
        return total + " ₽";
    }
    String render() {
        switch (state.kind) {
        case Delivery.ON_WAY:
            return "Везёт " + state.courier;
        case Delivery.DELIVERED:
            String c = state.order.getComment();
            if (c == null) return money(state.order.getTotal());
            return money(state.order.getTotal()) + ", " + c;
        case Delivery.CANCELLED:
            return state.reason;
        default:
            return "Собираем…";
        }
    }
}
