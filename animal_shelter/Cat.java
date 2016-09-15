package animal_shelter;
import behaviours.*;

public class Cat extends Animal {

  public Cat(String name) {
    super(name);
    this.habitat = HabitatType.INDOOR;
  }

}