import java.util.Scanner;

public class inputStudentIDNumber {
    public static void main(String[] args) {
        
        Scanner inputAbsen = new Scanner(System.in);
        int angle1, angle2, angle3, totalAngle;
        System.out.print("Input angle 1: ");
        angle1 = inputAbsen.nextInt();
        System.out.print("Input angle 2: ");
        angle2 = inputAbsen.nextInt();
        System.out.print("Input angle 3: ");
        angle3 = inputAbsen.nextInt();
        totalAngle = angle1 + angle2 + angle3;
        if (totalAngle == 180) {
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("Right triangle");
            } else if (angle1 == angle2 && angle2 == angle3) {
                System.out.println("Equilateral triangle");
            } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                System.out.println("Isosceles triangle");
            } else {
                System.out.println("Scalene triangle");
            }
        } else {
            System.out.println("Not a triangle");
        }
    }
}