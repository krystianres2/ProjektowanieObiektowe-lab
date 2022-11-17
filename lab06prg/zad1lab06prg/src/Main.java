

public class Main {
    public static void main(String[]args) {

        Punkt pkt1 = new Punkt(1, 2);
        Punkt pkt2 = new Punkt(2, 2);
        Punkt pkt3 = new Punkt(3, 2);
        pkt1.zeruj();
        pkt1.opis();
        pkt2.przesun(3,3);
        pkt2.opis();
        pkt3.opis();

        Prostokat p1=new Prostokat(3,4);
        Trojkat t1=new Trojkat(5,4);
        Figura f1=new Figura();

        p1.przesun(3,5);
    }
}
