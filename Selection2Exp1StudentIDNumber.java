import java.util.Scanner;
public class Selection2Exp1StudentIDNumber {
    public static void main(String[] args) {
        Scanner inputStudentIDNumber = new Scanner(System.in);
        System.out.print("Input year: ");
        int year = inputStudentIDNumber.nextInt();
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("leap year");
            } else {
                if (year % 400 == 0) {
                    System.out.println("leap year");
                } else {
                    System.out.println("Not a leap year");
                }
            }
        } else {
            System.out.println("Not a leap year");
        }
    }
}