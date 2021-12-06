package animal_farm;

import java.util.ArrayList;
import java.util.List;

public class AnimalSanctuary
{
    private Dog woofer = new Dog(4);
    private Dog woofette = new Dog(4);
    private Fox Foxy = new Fox(4);
    private Fox Kurama = new Fox(4);
    private List<Animal> animals = new ArrayList<>();
    private List<Fox> foxes = new ArrayList<>();

    public AnimalSanctuary()
    {
        foxes.add(this.Foxy);
        foxes.add(this.Kurama);

        animals.add(this.woofer);
        animals.add(this.woofette);
    }

}
