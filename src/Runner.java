import java.util.ArrayList;

public class Runner {
    public static void main(String[] args){
        Tiger tigger = new Tiger("Tigger");
//        tigger.eat("meat");

        Bear pooh = new Bear("Pooh");
//        pooh.eat("fish");
//        pooh.eat("meat");

        Unicorn rarity = new Unicorn("Rarity");
//        rarity.eat("marshmallows");

        Giraffe gemma = new Giraffe("Gemma");
//        gemma.eat("meat");
//        gemma.eat("leaves");

        Bee stinger = new Bee("Stinger");
//        stinger.eat("ice cream");
//        stinger.eat("pollen");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(tigger);
        animals.add(pooh);
        animals.add(rarity);
        animals.add(gemma);
        animals.add(stinger);

        Zookeeper zoe = new Zookeeper("Zoe");
        zoe.feedAnimals(animals, "ice cream");
    }
}
