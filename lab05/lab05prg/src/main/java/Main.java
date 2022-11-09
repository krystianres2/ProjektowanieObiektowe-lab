public class Main {
    public static void main(String[]args){
//zad1
        /*Prostokat p1=new Prostokat(2,4);
        p1.obliczObwod();
        p1.obliczPole();
        p1.obliczPrzekatna();*/
//zad2
       /* Budynek b1=new Budynek("Muzeum",1900,4);
        b1.display();
        b1.ileLat();*/

        //zad3
        Gatunek g=new Gatunek("kotowate","kot",28,10,"brak opisu");
        g.nazwa();
        g.haploidalnaLiczbaChromosomow();
        g.display();
        Gatunek g2=(Gatunek)g.clone();
        g2.nazwa();
        g2.haploidalnaLiczbaChromosomow();
        g.display();

    }
}
