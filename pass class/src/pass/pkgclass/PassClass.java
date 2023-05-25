
package pass.pkgclass;
import java.util.Scanner;
public class PassClass {

    public static void main(String[] args) {

             Scanner scan = new Scanner(System.in);
        int math, physic, chemistry, turkısh, history, music;
        double grade;

        //It receives the student's grades and calculates the grade average by summing 
        //all the grades and dividing by the total number of grades.
        System.out.print("Please enter your math grade:");
        math = scan.nextInt();

        System.out.print("Please enter your physic grade:");
        physic = scan.nextInt();

        System.out.print("Please enter your chemistry grade:");
        chemistry = scan.nextInt();

        System.out.print("Please enter your turkısh grade:");
        turkısh = scan.nextInt();

        System.out.print("Please enter your history grade:");
        history = scan.nextInt();

        System.out.print("Please enter your music grade:");
        music = scan.nextInt();
        double avarage;
        avarage = (math + physic + chemistry + turkısh + history + music) / 6;
        if (avarage > 55) {
            System.out.println(avarage + " student pass class.");
        } else {
            System.out.println(avarage + " student don't pass class.");

        }

    }
    
}
