import java.util.Scanner;

public class zad5 {
    public static void function5() {
        boolean znizka;
        boolean podwyzka;
        String a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Czy jest znizka na samochod: ");
        a = input.nextLine();
        System.out.println("Czy otrzymales podwyzke: ");
        b = input.nextLine();
        if (a.equals("tak")) {
            znizka = true;
        } else {
            znizka = false;
        }//if

        if (b.equals("tak")) {
            podwyzka = true;
        } else {
            podwyzka = false;
        }//if

        if (znizka!=true||podwyzka==true){
            System.out.println("Mozesz kupic samochod !"+", "+ "Znizki na samochod nie ma");
        }
        if (znizka!=true||podwyzka!=true){
            System.out.println("Zakup samochod trzeba odlozyc na pozniej..."+", "+"Znizki na samochod nie ma");
        }
        if (znizka==true||podwyzka==true){
            System.out.println("Mozesz kupic samochod!");
        }
    }
}
