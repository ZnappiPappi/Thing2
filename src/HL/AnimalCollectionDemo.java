package HL;

public class AnimalCollectionDemo {
    public static void main(String[] args) {
        
    }
    public static void testIsEmptyTrue() {
        Animal myAnimal = new Animal("Dog", "Malta",null, null, false);

        AnimalCollection myAnimalCollection = new AnimalCollection(myAnimal);

        System.out.println(myAnimalCollection.isEmpty());

    }

    public static void testOne() {
        //target an animals to search for
        Animal targetAnimal = new Animal("Cat", "Egypt", null, null, false);

        // search flag
        boolean isFound = false;

        // Instantiate the Animal Collection
        AnimalCollection myAnimals = new AnimalCollection(null);

        // Reset to the head of collection
        myAnimals.resetNext();

        // loop through my collection
        while (myAnimals.hasNext()) {
            Animal nextAnimal = myAnimals.getNext();
            if (nextAnimal.name == targetAnimal.name) {
                System.out.println("I have foud my animal");
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("Animal was not found :(");
        }
    }
}
