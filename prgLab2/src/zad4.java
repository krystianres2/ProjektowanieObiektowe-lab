import java.util.Random;

public class zad4 extends zad2{

    public static void function4(){
        double n=0;
        int liczba=0;
        double sum=0;
        do {
            System.out.println("Podaj ile liczb w ciagu: ");
            n=zad2.Scan();
        }while (n<1);

        for (int i = 0; i < n; i++) {
            Random random=new Random();
            liczba= random.nextInt(45-(-10))+(-10);
            System.out.println("Liczba: "+ liczba);
            if (liczba%2==0){
                sum+=liczba;
            }
        }//for
        System.out.println("Suma parzystych: "+ sum);




    }
}
