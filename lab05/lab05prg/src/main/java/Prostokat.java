public class Prostokat {
 double dlugosc=3;
 double szerokosc=5;

    public Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        check();
    }
    public void check(){
        if(dlugosc<=0||szerokosc<=0){
            System.out.println("Niepoprawne wartosci");
        }
    }

    public void obliczPole(){
     double pole;
     pole=dlugosc*szerokosc;
     System.out.println("Pole: "+pole );
 }
 public void obliczObwod(){
     double obwod;
     obwod=(2*dlugosc)+(2*szerokosc);
     System.out.println("Obwod: "+ obwod);
 }
 public void obliczPrzekatna(){
     double przekatna;
     double pom=0;
     pom=(dlugosc*dlugosc)+(szerokosc*szerokosc);
     przekatna=Math.sqrt(pom);
     System.out.println("Przekatna: "+przekatna);

 }


}
