package ro.lucas.enums;

public enum CookLevel {

    RARE(1),MEDIUM(2),WELL_COOKED(3);

     final int id;

    CookLevel(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
