package PastPapers;

public class Question10 {
    
    String[] Name = {"Annie", "Boris", "Hugh", "Paul", "Robby", "Zara"};

    double[] Height = {52.4, 100.0, 105.0, 61.0, 88.0, 68.0};

    double[] Weight = {1.56, 2.00, 2.03, 1.75, 1.80, 1.71};

    public static double calcBMI(double Weight, double Height) {
        double temp = Height * Height;
        double BMI = Weight/temp;
        return BMI;
    }

    public static void main(String[] arg) {
        for (int i = 0; i <= 5; i++) {
            bmi[i] = calcBMI(i, i);
        }
        return bmi[i];
    }
    
}