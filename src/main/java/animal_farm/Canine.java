package animal_farm;

import java.util.Collection;

//Only abstract methods
//Constant Variables
public interface Canine {
    int legs = 4;
    String diet = "Carnivore";

    String hunt();
    String run(String speed);
    String tricks(String Tricks);

}
