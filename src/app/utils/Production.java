package app.utils;

import app.clothes.Clothes;
import app.clothes.Color;
import app.clothes.Producer;
import app.clothes.Type;

public record Production(Position position, String name, Type type, Color color,
                         Producer producer, Clothes clothes) {
    private Production(Builder builder) {
        this(builder.position, builder.name, builder.type, builder.color, builder.producer, builder.clothes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("This is ")
                .append(name)
                .append(" in position ")
                .append(position);
        if ( color != null || type != null ) {
            sb.append(" with ");
            if ( color != null ) {
                sb.append(color).append(' ');
            }
            if ( type != null ) {
                sb.append(type).append(' ');
            }
            sb.append(type != Type.COTTON ? "cloth" : "woof");
        }
        if ( producer != null ) {
            sb.append(" has ").append(producer).append(" producer");
        }
        if ( clothes != null ) {
            sb.append(" and wears with ").append(clothes);
        }
        sb.append('.');
        return sb.toString();
    }

    public static class Builder {

        private final Position position;
        private final String name;
        private Type type;
        private Color color;
        private Producer producer;
        private Clothes clothes;

        public Builder(Position position, String name) {
            if ( position == null || name == null ) {
                throw new IllegalArgumentException("position and name " +
                        "can not be null");
            }
            this.position = position;
            this.name = name;
        }

        public Builder withType(Type type) {
            this.type = type;
            return this;
        }

        public Builder withColor(Color color) {
            this.color = color;
            return this;
        }

        public Builder withProducer(Producer producer) {
            this.producer = producer;
            return this;
        }

        public Builder withClothes(Clothes clothes) {
            this.clothes = clothes;
            return this;
        }

        public Production build() {
            return new Production(this);
        }
    }
}
