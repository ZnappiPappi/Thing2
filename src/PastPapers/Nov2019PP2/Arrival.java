package PastPapers.Nov2019PP2;

public class Arrival {
    // Attributes
    // the use of the private keyword is data hiding which is related to encapsulation, one of the main pillars of OOP
    private Flight myFlight;
    private String sta; // scheduled time of arrival
    private int runway;
    private String gate;
    private int delay;
    private boolean landed;


    // methods

    public int compareWIth(String flightId) {
        if(this.myFlight.getId().equals(flightId)) {
            return 0;
        }
        return 1;
    }

    public int compareWith(Arrival anotherArrival) {
        return this.getETA().compareTo(anotherArrival.getETA()) 
        
    }

}
