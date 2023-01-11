package lesson06;
    import helpers.Keyboard;
public class WhatsTheWeather {

     // let us agree on a number chart for constants
     final int SUNNY = 0;
     final int CLOUDY = 1;
     final int RAINY = 2;
     final int SNOWY = 3;
     final int THUNDER = 4;

     // Declare all the arrays we need
     static char[]weekDays = {'M', 'T', 'W', 'T', 'F', 'S', 'S'};
     static float[] temperature = new float[7];
     static int[] humidity = new int[7];
     static int[] conditions = new int[7];

    public static void main(String[] args) {
         // System.out.println("Which day would you like to record weather data for?");
         
        // record all temperature data for each day of the week
        for (int i = 0; i <= 6; i++) {
            System.out.println("Record the temperature data for " + weekDays[i]);
            System.out.println("------------------------------------------------");

            // ask user to input temperature of the day
            System.out.println("Enter temperature value: ");
            temperature[i] =  Keyboard.readFloat();
            System.out.println("");

            System.out.println("Record the humidity data for " + weekDays[i]);
            System.out.println("------------------------------------------------");

            System.out.println("Enter humidity value: ");
            humidity[i] =  Keyboard.readInt();
            System.out.println("");

            System.out.println("Record the weather condition data for " + weekDays[i]);
            System.out.println("------------------------------------------------");

            System.out.println("Enter weather condition using the following codes: ");
            System.out.println("[0] SUNNy, [1] CLOUDY, [2] RAINY, [3] SNOWY, [4] THUNDER.");
            conditions[i] =  Keyboard.readInt();
            System.out.println("");
            
        }
        // datat entry is complete 
        System.out.println("Thanks bestie.");
    }
}
