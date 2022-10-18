public class zad3 extends zad2 {

    public static void function3(){
        double n=0;
        double liczba=0;
        double sum=0;
        do {
            System.out.println("Podaj ile liczb w ciagu: ");
            n=zad2.Scan();
        }while (n<1);

        for (int i = 0; i < n; i++) {
            System.out.println("Podaj liczbe: ");
            liczba=zad2.Scan();
            if (liczba%2==0){
                sum+=liczba;
            }
        }//for
        System.out.println("Suma parzystych: "+ sum);
    }




}
