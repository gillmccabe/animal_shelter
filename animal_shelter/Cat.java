package animal_shelter;
import behaviours.*;

public class Cat extends Animal {

  public Cat(String name, GenderType gender) {
    super(name, gender);
    this.habitat = HabitatType.INDOOR;
  }

}