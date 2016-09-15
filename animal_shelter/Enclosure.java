package animal_shelter;
import java.util.*;

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
    this.capacity = newCapacity;
  }

  public HabitatType getHabitat(){
    return this.habitat;
  }

  public void setHabitat(HabitatType newHabitat){
    this.habitat = newHabitat;
  }

  public ArrayList<Animal> getAnimals(){
    return this.animals;
  }

}
