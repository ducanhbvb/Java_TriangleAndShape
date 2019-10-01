import java.util.Scanner;

public class Main {
    public static boolean checkTriangle(double a, double b, double c) {
        if (a > b + c) {
            return false;
        }
        if (b > (a + c)) {
            return false;
        }
        if (c > (a + b)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();
        System.out.println(shape);

        Triangle triangle = new Triangle();
        System.out.println(triangle);
        triangle = new Triangle("blu", 3.0, 4.0, 5.0);
        System.out.println(triangle);

        System.out.println("Triangle side1 side2 side3 :");
        System.out.println("input color :");
        String color = sc.nextLine();
        System.out.println("input Side 1");
        double side1 = sc.nextDouble();
        System.out.println("input Side 2");
        double side2 = sc.nextDouble();
        System.out.println("input Side 3");
        double side3 = sc.nextDouble();
        if (checkTriangle(side1, side2, side3)) {
            triangle = new Triangle(color,side1, side2, side3);
            System.out.println(triangle);
        } else {
            System.out.println("The three sides entered are not edges of a triangle");
        }
    }
}
