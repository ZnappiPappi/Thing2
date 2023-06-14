package lesson08;

public class Visits {
    
    private String hotelCode;
    private int days;
    public Visits(String h, int d) {
        hotelCode = h;
        days = d;
    }

    // accessor method, required to give read access to private variables( give access to days which is encapsulated, privated and hidden)
    public int getDays() {
        return days;
    }

    public String gethotelCode() {
        return hotelCode;
    }

}
