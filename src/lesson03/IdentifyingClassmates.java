package lesson03;


import helpers.Keyboard;

public class IdentifyingClassmates {
     public static void main(String[] args){
        System.out.println("Welcome to our program of who is who year 12 Computer Science edition.");
        System.out.println("This program is a decision tree of the classroom, to identify the people by their traits.");

        /*
         * Colour of hair, brown, blonde, black, 
         * Colour of eyes, brown, blue, green, 
         * haitr texture, straight, wavy, curly
         * Gender, male, female
         * Height, tall, medium, short
         */
        boolean hasFeature;

        System.out.println("Is the person you are looking for a teacher?");
        hasFeature = Keyboard.readBoolean();
        if (hasFeature){
            System.out.println("You are looking for epic Ms. C");
        }
        else {
            System.out.println("Does the student you're identifying have black hair?");
            hasFeature = Keyboard.readBoolean();
            if (hasFeature){
                   System.out.println("You are looking for Kailu.");
            } 
            else {
               System.out.println("Is the student you're identifying a woman?");
               hasFeature = Keyboard.readBoolean();
               if (hasFeature){
                   System.out.println("You are looking for Caitlin.(coolest person in CS)");
               } 
               else {
                   System.out.println("Is the student you're identifying super tall?");
                   hasFeature = Keyboard.readBoolean();
                   if (hasFeature){
                       System.out.println("You are looking for tallest Friedrich.");
                   } 
                   else {
                       System.out.println("Does the student you are looking for have brown eyes?");
                       hasFeature = Keyboard.readBoolean();
                       if (hasFeature){
                           System.out.println("You are looking for Benedik.");
                       } 
                       else {
                           System.out.println("Does the person you are looking for have curly hair?");
                           hasFeature = Keyboard.readBoolean();
                           if (hasFeature){
                               System.out.println("You are looking for tall Friedrich.");
                           }
                           else{
                               System.out.println("Is the person you are looking for short?");
                               hasFeature = Keyboard.readBoolean();
                               if (hasFeature){
                                   System.out.println("You are looking for Joshua.");
                               }
                               else{
                                   System.out.println("Does the person you are looking for wear glasses?");
                                   hasFeature = Keyboard.readBoolean();
                                   if (hasFeature){
                                       System.out.println("You are looking for Dimitri.");
                                   }
                                   else{
                                       System.out.println("You are looking for Simon.");
                                   }
                               }
                           }
                       }
                   }
               } 
        }
         
        }

    }
}
