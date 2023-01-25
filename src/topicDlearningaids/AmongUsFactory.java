package topicDlearningaids;

public class AmongUsFactory {
    public static void main(String[] args) {

        // Example of using the "plain cookie cutter" constructor
        // What AmongUs colour do we get?
        AmongUs randomAstronaut = new AmongUs();

        AmongUs[] allCrew = new AmongUs[18];
         
        // TODO: Create an instances of the AmongUs in every colour
        for(int c = 0; c < AmongUs.WARDROBE.length; c++) {
            //create an instance of amongus in every colour
            String role = AmongUs.ROLES[(c % 7)];
            AmongUs astro = new AmongUs(AmongUs.WARDROBE[c], role);
            //store it in all Crew
            allCrew[c] = astro;
        }

        System.out.println("");
    }
}
