package app.clothes;

public enum Color {

    RED,BLUE,BLACK,WHITE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
