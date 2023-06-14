package lesson08;

/**
 * Copied from May 2018 SL Paper 2
 * A hotel chain has a loyalty scheme in which customers are awarded 1000 points for each day they stay in one of their hotels. 
 * With these points, customers can achieve one of three status levels: Gold, Silver or Bronze.  The level will determine the extra services to which they are entitled.
 * The total number of points collected during the current year will determine which of the three status levels they are assigned for the following year:
 * For example only the points collected in 2018 will determine the status level for 2019.
 * Occasionally, new customers receive additional bonus points as part of a promotion.
 * The Points class keeps details of the points and status levels of each customer.
 */
public class Points {
    
    private String memberId;  // id of the hotel customer
    
    private int totalPoints;  // this year's points 
    
    private int bonusPoints;  // any bonus points given to this year's new member 
    
    private String statusNow; // current(this year's)status
    
    private String statusNextYear; // following year's status 
    
    private Visits[] allVisits = new Visits[366];//details of each visit during the year
    
    int y;                    // number of visits this year

    // constructor for new member
    public Points(String id)  {    
        memberId = id;    
        bonusPoints = 0;    
        y = 0;    
        statusNow  =  "Bronze";  
    }

    // Accessor methods
    public String getMemberId() {
        return this.memberId;
    }

    public Visits getallVisits(int v) {
        return allVisits[v];
    }

    public void addVisit(Visits v) {
        allVisits[y] = v;
        y = y +1;
    }

    // Mutator methods

    // Behaviour methods
    public boolean isGold() {
        boolean isGold = statusNow.equals("Gold");
        return isGold;
    }

    public int calculateTotalPoints() { 
        // decalre and assign variables
        int totalCurrentYear = 0;
        for(int i = 0; i < allVisits.length; i++) {
            if(allVisits[i] != null) {
                totalCurrentYear += (allVisits[i].getDays() * 1000);
            }
        }

        // update the total current year
        return totalCurrentYear;
    }
}
