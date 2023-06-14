package HL;

public class AnimalCollection {
    // ------- Attributes------- //
    Animal headAnimal;

    Animal currentAnimal;

    Animal tailAnimal;

    // ------- Constructor ----- //
    public AnimalCollection(Animal headAnimal) {
        this.headAnimal = headAnimal;
        this.currentAnimal = headAnimal;
        
    }

    // ------- Behaviour ------- // 

    // As Contracted in the IB Collection
    public void resetNext() {

    }

    public boolean hasNext() {
        return false;
    }

    public Animal getNext() {
        return null;
    }

    public void addItem(Animal item) {
        Animal tail = getTail();
        tail.next = item;
    }

    public void removeItem(Animal item) {    

    }

    // Nicer Perks we want to add because we're cool, in an exam these require an explanation

    public Animal getHead() {
        return this.headAnimal;
    }

    public Animal getTail() { // get the last item in the element collection to make it easier to loop in circula linked lists
        Animal tempIterator = this.headAnimal;
        while (tempIterator.hasNext()) {
            tempIterator = tempIterator.getNext();
        }
        return tempIterator;
    }

    public Boolean isEmpty() { // checks if the linmked list is empty
        if (this.headAnimal == null) {
            return true;
        }
        return false; 
    }

}
