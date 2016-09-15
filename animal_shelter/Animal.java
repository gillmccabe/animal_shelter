package animal_shelter;
import behaviours.*;
import java.util.*;

public abstract class Animal {

  private String name;
  protected HabitatType habitat;
  private ArrayList<Edible> belly;

  public Animal(String name){
    this.name = name;
    this.belly = new ArrayList<Edible>();
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

  public int foodCount() {
    return belly.size();
    }

  public void eat(Edible food) {
      belly.add(food);
    }


}