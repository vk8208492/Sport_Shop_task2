package app.clothes;

public enum Producer {

    ACTIVE_SPORTS("Active_sports"),
    SMART_CAPS("Smart caps");

    private final String name;

    Producer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
