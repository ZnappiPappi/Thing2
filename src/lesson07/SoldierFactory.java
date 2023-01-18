package lesson07;

public class SoldierFactory {
    
     public static void main(String[] args) {
        //creating an instance of soldier 
        Soldier mySoldier = new Soldier();
        mySoldier.health = 100; //directly manipulating the state of the Soldier
        mySoldier.energy = 100;
        Soldier femaleSoldier = new Soldier('F');
    }
}
