import java.util.Scanner;

public class SamochodOsobowy extends Samochod{
    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg, double waga, double pojemnoscSilnika, int iloscOsob) {
        super(marka, model, nadwozie, kolor, rokProdukcji, przebieg);
        this.waga = waga;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.iloscOsob = iloscOsob;
    }

    double waga;
    double pojemnoscSilnika;
    int iloscOsob;

    public SamochodOsobowy() {
        dane();
    }

    @Override
    public void dane() {
        super.dane();
        Scanner input=new Scanner(System.in);
        do {
            System.out.println("Podaj wage(w tonach): ");
            waga = input.nextDouble();
        }while (waga<2||waga>4.5);
        do {
            System.out.println("Podaj pojemnosc silnika: ");
            pojemnoscSilnika = input.nextDouble();
        }while (pojemnoscSilnika<0.8||pojemnoscSilnika>3);
        System.out.println("Podaj ilosc osob: ");
        iloscOsob= input.nextInt();
    }

    @Override
    public void opis() {
        super.opis();
        System.out.println("Waga: "+waga);
        System.out.println("Pojemnosc silnika: "+pojemnoscSilnika);
        System.out.println("Ilosc osob: "+iloscOsob);
    }
}
