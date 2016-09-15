package animal_shelter;
import java.util.*;

public abstract class Animal {

  private String name;
  protected HabitatType habitat;

  public Animal(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public void setName(String newName){
    this.name = newName;
  }

  public HabitatType getHabitat(){
    return this.habitat;
  }

  public void setHabitat(HabitatType newHabitat){
    this.habitat = newHabitat;
  }


}