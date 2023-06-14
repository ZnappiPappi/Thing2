package IATesting.Caitlin;

public class IdealGasEquation {
    // ------ Attributes ------
    // Pressure (P)
    // Volume (V) 
    // Amt. of Moles (n)
    // Gas Constant (R)
    // Temperature (T)

    public static final double R = 8.314; // the ideal gas constant

    public double v; // the Volume
    public double t; // the temperature
    public double n; // number of moles
    public double p; // the pressure

    // ------ Constructors ------
    //
    public IdealGasEquation(double v, double t, double n, double p) { // we pass param values to the cookie cutter to create a
        if (v >= 0) {
            this.v = v; // this means of the current member
        }
        // todo: update rest of properties
    }

    // ------ Methods ------
    // subject of formula
    // conversion
    //
    public void calc() {
        // todo: flowchart to determine how the formula will look
        // depending on the values given the formula changes shape
    }

    

    
}
