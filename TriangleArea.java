import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base (cm): ");
        double base = input.nextDouble();
        System.out.print("Enter height (cm): ");
        double height = input.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaInch = areaCm / (2.54 * 2.54); // 1 in² = 2.54*2.54 cm²
        System.out.println("The Area of the triangle in sq in is " + areaInch + " and sq cm is " + areaCm);
        input.close();
    }
}

