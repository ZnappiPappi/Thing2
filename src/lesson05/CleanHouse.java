package lesson05;

public class CleanHouse {
    public static void main(String[] args){



    }

    public static void sweepTheFloor(String supply1) {
        System.out.println("I am sweeping the floor with:  " + supply1);
    }

    public static void decluttering(String action1) {
        System.out.println("I am " + action1);
    }

    public static void rearranging(String action2) {
        System.out.println("I am" + action2);
    }

    public static void mopfloor(String supply2) {
        System.out.println("I am " + supply2);
    }

    public static void cleankitchen(String[] supplies) {
        decluttering("hands");
        sweepTheFloor("broom");
        mopfloor("mop");
        rearranging("hands");
    }

    public static void cleanOffice(String[] supplies) {
        decluttering("hands");
        sweepTheFloor("broom");
        mopfloor("mop");
        rearranging("hands");
    }

    public static void cleanBedroom(String[] supplies) {
        decluttering("hands");
        sweepTheFloor("broom");
        mopfloor("mop");
        rearranging("hands");
    }

    public static void cleanBathroom(String[] supplies) {
        decluttering("hands");
        sweepTheFloor("broom");
        mopfloor("mop");
        rearranging("hands");
    }

}



