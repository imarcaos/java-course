package entities;

public class Student {

    public String name;
    public double test1, test2, test3;

    public double grade() {
        return test1 + test2 + test3;
    }

    public double missingNote() {
       if ( grade() < 60) {
           return 60 - grade();
       } else {
           return grade();
       }

    }
}
