import java.util.Scanner;

public class zad2 {

    public static double Scan(){
        double num=0;
        Scanner input=new Scanner(System.in);
        num= input.nextDouble();
        return num;
    }

    public static void function2(){
        //Scanner input=new Scanner(System.in);
        int ileDot=0;
        int ileUje=0;
        double sumDot=0;
        double sumUje=0;
        double liczba=0;

        for (int i=0;i<10;i++){
            System.out.println("Podaj liczbe: ");
            liczba= Scan();
            if (liczba>0){
                ileDot++;
                sumDot+=liczba;
            }
            if (liczba<0){
                ileUje++;
                sumUje+=liczba;
            }
        }//for
        System.out.println("Liczba liczb dodatnich: "+ileDot);
        System.out.println("Suma liczb dodatnich: "+ sumDot);
        System.out.println("Liczba liczb ujemnych: "+ ileUje);
        System.out.println("Suma liczb ujemnych"+ sumUje);
    }



}
