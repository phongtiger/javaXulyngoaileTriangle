import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        double a,b,c;
        Scanner scanner = new Scanner(System.in);
        CheckTriangle checkTriangle = new CheckTriangle();
            System.out.println("Enter a,b,c is canh cua Triangle");
            System.out.println("Enter a");
            a = scanner.nextDouble();
            System.out.println("Enter b");
            b = scanner.nextDouble();
            System.out.println("Enter c");
            c = scanner.nextDouble();
            try {
                checkTriangle.checkNegative(a,b,c);
                System.out.println("a,b,c is canh cua Triangle");
            } catch (ArithmeticException E) {
                System.out.println("a,b,c not a part of Triangle");
            }

    }
}

class CheckTriangle {
    public void checkNegative(double a, double b, double c){
        if (a + b < c || b + c < a || a + c < b || a < 0 || b < 0 || c < 0) {
            throw new ArithmeticException("a<0 error");
        }
    }
}
