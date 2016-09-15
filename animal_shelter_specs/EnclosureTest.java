import static org.junit.Assert.*;
import org.junit.*;
import animal_shelter.*;
import java.util.*;

public class EnclosureTest{

  Enclosure enclosure;
  Dog dog;
  Cat cat;
  
  @Before 
  public void before(){
    enclosure = new Enclosure(4, HabitatType.INDOOR);
    dog = new Dog("Archie", GenderType.MALE);
    cat = new Cat("Poppy", GenderType.FEMALE);
  }

  @Test
  public void canGetCapacity(){
    assertEquals(4, enclosure.getCapacity());
  }

  @Test
  public void canGetHabitat(){
    assertEquals(HabitatType.INDOOR, enclosure.getHabitat());
  }

  @Test
  public void enclosureStartsEmpty(){
    assertEquals(0, enclosure.getCount());
  }

  @Test
  public void canAddAnimal(){
    enclosure.addAnimal(dog);
    enclosure.addAnimal(cat);
    assertEquals(2, enclosure.getCount());
  }

}
