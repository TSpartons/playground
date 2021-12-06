package animal_farm;

//                              demands that the methods are in place
public class Dog extends Animal implements Canine{
    public Dog(int legs) {
        super(4);
    }

    @Override
    public String eat() {
        return "Cat litter";
    }

    @Override
    public String sound() {
        return "Bork!";
    }

    @Override
    public String hunt() {
        return "Sniffing";
    }

    @Override
    public String run(String speed) {
        return speed;
    }

    @Override
    public String tricks(String Tricks) {
        return Tricks;
    }
}
