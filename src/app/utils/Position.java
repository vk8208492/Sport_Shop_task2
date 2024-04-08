package app.utils;

public enum Position {

    CUSTOMERS;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
