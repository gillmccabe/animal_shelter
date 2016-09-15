package animal_shelter;
import behaviours.*;
import java.util.*;

public class Dog extends Animal {

  public Dog(String name) {
    super(name);
    this.habitat = HabitatType.OUTDOOR;
  }

}