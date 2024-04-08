package app.clothes;

public enum Type {

    COTTON("cotton"),
    SYNTHETIC("synthetic");

    private final String name;

    Type(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
