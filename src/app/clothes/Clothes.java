package app.clothes;

public enum Clothes {

    T_SHIRT,CAP;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
