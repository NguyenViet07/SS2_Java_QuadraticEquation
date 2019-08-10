import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao a, b, c");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation= new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant()>=0){
            System.out.println("phương trình có hai nghiệm là : " +quadraticEquation.getRoot1()+" và "+quadraticEquation.getRoot2());
        }else {System.out.print("phương trình vô nghiệm!");}
    }
}
