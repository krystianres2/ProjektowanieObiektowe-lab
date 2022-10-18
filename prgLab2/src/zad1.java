import java.util.Scanner;

public class zad1 {

    public static void function1(){
        int ileStudentow=0;
        double suma=0;
        double sr=0;
        int i=0;
        do {
            System.out.println("Ile studentow: ");
            Scanner input = new Scanner(System.in);
            ileStudentow = input.nextInt();
        }while (ileStudentow<1);
        while (i<ileStudentow){
            Scanner input2=new Scanner(System.in);
            double ile=0;
            System.out.println("Ile punktow");
            ile= input2.nextDouble();
            suma+=ile;
            i++;
        }//while
        sr=suma/ileStudentow;
        System.out.println("Srednia: "+ sr);


    }




}
