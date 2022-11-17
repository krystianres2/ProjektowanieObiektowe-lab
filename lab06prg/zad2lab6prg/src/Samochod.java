import java.util.Scanner;

public class Samochod {

    String Marka;
    String Model;
    String Nadwozie;
    String Kolor;
    int RokProdukcji;
    int przebieg;

    public void dane(){
        Scanner input=new Scanner(System.in);
        System.out.println("Podaj marke: ");
        Marka = input.nextLine();
        System.out.println("Podaj model: ");
        Model=input.nextLine();
        System.out.println("Podaj nadwozie: ");
        Nadwozie=input.nextLine();
        System.out.println("Podaj kolor: ");
        Kolor=input.nextLine();
        Scanner input2=new Scanner(System.in);
        System.out.println("Podaj rok produkcji: ");
        RokProdukcji=input2.nextInt();
        do {
            System.out.println("Podaj przebieg: ");
            przebieg = input2.nextInt();
        }while (przebieg<0);
    }

    public Samochod() {
        dane();
    }

    public Samochod(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg) {

        Marka = marka;
        Model = model;
        Nadwozie = nadwozie;
        Kolor = kolor;
        RokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }
    public void opis(){
        System.out.println("Marka:"+ Marka);
        System.out.println("Model:"+ Model);
        System.out.println("Nadwozie:"+ Nadwozie);
        System.out.println("Kolor:"+ Kolor);
        System.out.println("RokProdukcji:"+ RokProdukcji);
        System.out.println("przebieg:"+ przebieg);
    }

}
