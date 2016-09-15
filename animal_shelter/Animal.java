package animal_shelter;
import behaviours.*;
import java.util.*;

public abstract class Animal {

  private String name;
  private GenderType gender;
  protected HabitatType habitat;
  private ArrayList<Edible> belly;

  public Animal(String name, GenderType gender){
    this.name = name;
    this.gender = gender;
    this.belly = new ArrayList<Edible>();
  }

  public String getName(){
    return this.name;
  }

  public void setName(String newName){
    this.name = newName;
  }

  public GenderType getGender(){
    return this.gender;
  }

  public void setGender(GenderType newGender){
    this.gender = newGender;
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