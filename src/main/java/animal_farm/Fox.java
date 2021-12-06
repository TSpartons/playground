package animal_farm;

public class Fox extends Animal implements Canine{
    public Fox(int legs) {
        super(4);
    }

    @Override
    public String eat() {
        return "It's eating garbage";
    }

    @Override
    public String sound() {
        return "Yip Yip";
    }

    public static void main(String[] args)
    {
        Animal David = new Fox(4);
        System.out.println(David.eat());
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
