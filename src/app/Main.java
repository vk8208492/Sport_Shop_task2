package app;

import app.clothes.Clothes;
import app.clothes.Color;
import app.clothes.Producer;
import app.clothes.Type;
import app.utils.Position;
import app.utils.Production;

public class Main {

    public static void main(String[] args) {


        Production production1 = new Production.Builder(Position.CUSTOMERS, "A1")
                .withColor(Color.RED)
                .withType(Type.COTTON)
                .withProducer(Producer.ACTIVE_SPORTS)
                .withClothes(Clothes.T_SHIRT)
                .build();

        System.out.println(production1.toString());

        Production production2 = new Production.Builder(Position.CUSTOMERS, "A2")
                .withColor(Color.WHITE)
                .withType(Type.SYNTHETIC)
                .withProducer(Producer.SMART_CAPS)
                .withClothes(Clothes.CAP)
                .build();

        System.out.println(production2.toString());

        Production production3 = new Production.Builder(Position.CUSTOMERS, "B1")
                .withColor(Color.BLUE)
                .withType(Type.COTTON)
                .withProducer(Producer.ACTIVE_SPORTS)
                .withClothes(Clothes.T_SHIRT)
                .build();

        System.out.println(production3.toString());

        Production production4 = new Production.Builder(Position.CUSTOMERS,"B2")
                .withColor(Color.BLACK)
                .withType(Type.SYNTHETIC)
                .withProducer(Producer.SMART_CAPS)
                .withClothes(Clothes.CAP)
                .build();

        System.out.println(production4.toString());

    }
}
