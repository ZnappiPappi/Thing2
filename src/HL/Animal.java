package HL;

public class Animal {
    // ------- Attributes-------
    // this animal....
     String name; // Dog, Cat, Tarantula, Wombat...

     String origin; // Australia, Africa, South America
    // my pointers...
     Animal next;

     Animal previous;

     private Animal head;

     boolean isHead;

     boolean isTail;


    // ------- Constructor -------
    
     public Animal (String name, String origin, Animal next,Animal previous, boolean isHead) {
        // node data
        this.name = name;
        this.origin = origin;
        // set pointers
        this.next = next;
        this.previous = previous;

        if (isHead) {
         this.setAsHead();
        }
     }

    // ------- Behaviour -------
    public void setAsHead() {
      this.head = this;
    }

     public boolean hasNext() {
        if(this.next != null) {
            return true;
        }
        return false;
     }

     public boolean hasPrevious() {
        if(this.previous != null) {
            return true;
        }
        return false;
     }

     public Animal getNext() {
      return this.next;
     }

     public Animal getPrevious() {
      return this.previous;
     }

     // the current node to visit must be the first
     public void resetNext() {
      // head node data
      this.name = head.name;
      this.origin = head.origin;
      // set pointers
      this.next = head.next;
      this.previous = head.previous;
     }

}
