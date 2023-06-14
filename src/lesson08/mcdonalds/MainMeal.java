package lesson08.mcdonalds;

public class MainMeal extends FoodItem {
    
    final double PRICE_MARKUP= 0.26;


    public double getPrice() {
        return super.price + (super.price * PRICE_MARKUP);
        
    }

}
