package animal_shelter;
import behaviours.*;
import java.util.*;

public class Dog extends Animal {

  public Dog(String name, GenderType gender) {
    super(name, gender);
    this.habitat = HabitatType.INDOOR;
  }

}