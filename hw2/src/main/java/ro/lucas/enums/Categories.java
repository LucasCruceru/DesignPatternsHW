package ro.lucas.enums;

public enum Categories {
    PIZZA(1),PASTA(2),MEAT(3),SIDEDISH(4),DRESSING(5),DESERT(6),DRINKS(7);

    final int id;

    Categories(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
