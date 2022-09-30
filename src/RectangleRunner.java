import java.util.Scanner;

public class RectangleRunner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter rectangle 1 length: ");
        int rect1Length = myScanner.nextInt();
        System.out.print("Enter rectangle 1 width: ");
        int rect1Width = myScanner.nextInt();
        System.out.print("Enter rectangle 1 height: ");
        double rect1Height = myScanner.nextDouble();
        System.out.print("Enter rectangle 2 length: ");
        int rect2Length = myScanner.nextInt();
        System.out.print("Enter rectangle 2 width: ");
        int rect2Width = myScanner.nextInt();
        System.out.print("Enter rectangle 2 height: ");
        double rect2Height = myScanner.nextDouble();

        // write the rest of your program below
        int rect1Area = rect1Length * rect1Width;
        double rect1Vol = rect1Area * rect1Height;

        int rect2Area = rect2Length * rect2Width;
        double rect2Vol = rect2Area * rect2Height;

        System.out.println("Rectangle 1's Area: " + rect1Area + ", Box Volume: " + rect1Vol);
        System.out.println("Rectangle 2's Area: " + rect2Area + ", Box Volume: " + rect2Vol);
    }
}
