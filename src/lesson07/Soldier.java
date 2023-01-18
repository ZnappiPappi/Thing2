package lesson07;

public class Soldier {
    
    /*
     * ---------------------Attributes---------------------
     * These are all the properties that describe the state
     */
    String name;
    String weapon;
    int health = 100;
    int id = 001;
    int energy = 100;
    boolean isTired;
    char gender;
     /*
      *  -------------------Coming Soon--------------------
      */
    public Soldier() {} // default constructor
    public Soldier(char gender) { // parametised constructor to immediately get a desired state
        this.gender = gender;
    }
      /*
       *  ---------------Behavioral Methods ----------------
       * The functions the object can use to update the state
       */
    public void damage() {
        health = health - 20;
    }
    public void heal() {
        health = health + 20;
    }
    public void attack() {
        energy = energy - 10;
        if (energy < 30) {
            isTired = true;
        } else if (energy > 30) {
            isTired = false;
        }
    }
    public void rest() {
        energy = energy + 10;
        if (energy == 100) {
            isTired = false;
        }
    }

}
