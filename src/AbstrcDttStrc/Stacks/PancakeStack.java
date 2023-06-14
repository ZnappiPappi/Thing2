package AbstrcDttStrc.Stacks;

public class PancakeStack {
    
    // Attributes, States
    int size; // making the size of our pancake statck :>, this is a statck atribute

    Pancake[] stack = new Pancake[5];

    
    String topping; // this is a pancake attrribute 

    // making the cute constructor 
    public PancakeStack(String topping) {
        this.topping = topping;
        this.size = 5;
    }

    // Methods, Behaviour

    public void push() {
        if (!isFull()) {
        // create the pancake
        Pancake p = new Pancake();
        int position = stack.length - size;
        stack[position] = p;
        size++;
        }
        
    }

    public Pancake pop() {
        if (!isEmpty()) {
        int position = stack.length - size;
        Pancake p = stack[position];
        stack[position] = null;
        size--;
        return p;
        }
        return null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == stack.length;
    }

}
