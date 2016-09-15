package animal_shelter;
import java.util.*;
import behaviours.*;

public class Enclosure {

  private int capacity;
  private HabitatType habitat;
  private ArrayList<Animal> animals;


  public Enclosure (int capacity, HabitatType habitat){
    this.capacity = capacity;
    this.habitat = habitat;
    this.animals = new ArrayList<Animal>();
  }

  public int getCapacity(){
    return this.capacity;
  }

  public void setCapacity(int newCapacity){
    this.name = newCapacity;
  }

  public HabitatType getHabitat(){
    return this.habitat;
  }

  public void setHabitat(HabitatType newHabitat){
    this.name = newHabitat;
  }

}
