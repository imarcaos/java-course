package app;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student st = new Student();

        System.out.print("Student Name: ");
        st.name = sc.nextLine();
        System.out.print("Note 1: ");
        st.test1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Note 2: ");
        st.test2 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Note 3: ");
        st.test3 = sc.nextDouble();
        sc.nextLine();

        System.out.println();

        System.out.printf("FINAL GRADE: %.2f%n", st.grade());
        if(st.grade() > 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", st.missingNote());
        }
        System.out.println();

        sc.close();
    }
}
