package PastPapers.Nov2019PP2;

public class Flight {
    // Attributes

    private String id;
    private String eta;

    // methods
    // all accesor and mutator methods, we as class designers have control over what to allow in terms of read write access
    public String getId() {
        return this.id;
    }

    public String getETA(String sta, String delay) {
        eta = sta + delay;
        return this.eta;
    }
    // 
}
