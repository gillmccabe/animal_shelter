package animal_shelter;
import java.util.*;
import behaviours.*;

public class Dog extends Animal {

  public Dog(String name) {
    super(name);
    this.habitat = HabitatType.OUTDOOR;
  }

}