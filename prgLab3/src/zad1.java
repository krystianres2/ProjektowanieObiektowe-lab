import java.util.Scanner;

public class zad1 {
    public static double ScanDouble(){
        double a=0;
        Scanner input = new Scanner(System.in);
        a= input.nextDouble();
        return a;
    }

    public static void function1(){
        double a=0;
        double b=0;
        double c=0;
        double delta=0;
        double deltaSqrt=0;
        double x1=0;
        double x2=0;
        double x=0;

        System.out.println("Podaj a: ");
        a=ScanDouble();
        System.out.println("Podaj b: ");
        b=ScanDouble();
        System.out.println("Podaj c: ");
        c=ScanDouble();

        delta=(b*b)-4*(a*c);
        //System.out.println(delta);
        deltaSqrt=Math.sqrt(delta);
        if (delta>0){
            x1=(-b-deltaSqrt)/2*a;
            x2=(-b+deltaSqrt)/2*a;
            System.out.println("x1= "+ x1);
            System.out.println("x2= "+ x2);}
        if (delta==0){
            x=(-b)/2*a;
            System.out.println("x= "+ x);
        }
        if (delta<0){
            System.out.println("Nie ma miejsc zerowych");
        }

    }
}
