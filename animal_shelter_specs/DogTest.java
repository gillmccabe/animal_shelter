import static org.junit.Assert.*;
import org.junit.*;
import animal_shelter.*;

public class DogTest {

  Dog dog;

  @Before
  public void before() {
    dog = new Dog("Archie");
  }

  @Test
  public void hasName() {
    assertEquals( "Archie", dog.getName());
  }

  @Test
  public void hasHabitat() {
    assertEquals(HabitatType.OUTDOOR, dog.getHabitat());
  }

  @Test
   public void bellyStartsEmpty() {
     assertEquals( 0, dog.foodCount());
   }

}