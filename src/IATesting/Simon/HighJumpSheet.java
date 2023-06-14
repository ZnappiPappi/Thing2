package IATesting.Simon;

public class HighJumpSheet {
    // ----- Attributes -----
    Student[] participants; // name of student participanting 
    double[] heights; // heights of the high jump
    // static members
    final static String[] AGE_GROUPS = {"U9", "U10", "U11", "U12", "U13"};


    // ----- Constructor -----



    // ----- Methods -----
    public void storeResult(Student[] student, double[] heights) {
        // perform a linear search to find the student in the array and get it's position index 
        // replace the value of height in the corresponding index

        tallyResults();
    }
    public void tallyResults() {
        // perform a bubble sort on the results(and the participants)
    }
    public Student calculateStudentWinner() {
        tallyResults();
        return participants[0];
    }
    public House calculateHouseWinner() {
        return null;
    }

}
