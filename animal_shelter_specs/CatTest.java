import static org.junit.Assert.*;
import org.junit.*;
import animal_shelter.*;

public class CatTest {

  Cat cat;
  Kibble kibble;

  @Before
  public void before() {
    cat = new Cat("Poppy");
  }

  @Test
  public void hasName() {
    assertEquals("Poppy", cat.getName());
  }

  @Test
  public void hasHabitat() {
    assertEquals(HabitatType.INDOOR, cat.getHabitat());
  }

  @Test
  public void bellyStartsEmpty() {
    assertEquals(0, cat.foodCount());
  }

  @Test
  public void canEatFood() {
    cat.eat(kibble);
    assertEquals(1, cat.foodCount());
  }

}