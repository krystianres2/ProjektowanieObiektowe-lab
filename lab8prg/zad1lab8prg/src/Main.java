import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
     int a;
        Scanner input=new Scanner(System.in);
        try {
            System.out.println("Podaj liczbe: ");
            a = input.nextInt();
            if (a < 0) {
                throw new java.lang.IllegalArgumentException();
            }
            System.out.println("Pierwiastek liczby: " + Math.sqrt(a));
        }catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println("Musi byc liczba");
        }catch(IllegalArgumentException e){
            e.printStackTrace();
            System.out.println("Liczba musi byc dodatnia");
        }

    }
}
