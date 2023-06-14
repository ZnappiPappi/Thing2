package topicDlearningaids;

public class AmongUsFactory {

    public static AmongUs[] allCrew = new AmongUs[18];
    
     public static void main(String[] args) {
        // Example of using the "plain cookie cutter" constructor
        // What AmongUs colour do we get?
        AmongUs randomAstronaut = new AmongUs();
        for (int i = 0; i < 5; i++) {
            AmongUs randomAstonaut = new AmongUs();
            allCrew[0] = randomAstronaut;
        }
        System.out.println("");
    }

    public static void createAmongUsEveryColour() {
        // TODO: Create an instances of the AmongUs in every colour
        for(int c = 0; c < AmongUs.WARDROBE.length; c++) {
            //create an instance of amongus in every colour
            String role = AmongUs.ROLES[(c % 7)];
            AmongUs astro = new AmongUs(AmongUs.WARDROBE[c], role);
            //store it in all Crew
            allCrew[c] = astro;
        }
    }
    
    
}
