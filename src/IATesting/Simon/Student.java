package IATesting.Simon;

import java.util.Date;
/*
 * Encapsulation: public, protected, private
 */

public class Student {
    /*
     * Attributes
     */
    private String name;

    private String surname;

    private Date dob;

    private String year;


     /*
      * Constructor
      */
      public Student(Date dob, String name, String surname, String year) {
        this.dob = dob;
        this.name = name;
        this.surname = surname;
        this.year = year;

      }
      

      /*
       * Behaviour
       */
}
