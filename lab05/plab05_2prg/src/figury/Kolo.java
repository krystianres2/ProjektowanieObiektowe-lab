package figury;

public class Kolo {
    int r;
    double pole;
    double obwod;

    public Kolo(int r) {
        this.r = r;
        pole();
        obwod();
    }
    public void pole(){
        pole=Math.PI*r*r;
    }
    public void obwod(){
        obwod=2*Math.PI*r;
    }
    public void display(){
        System.out.println("Nazwa: "+"Kolo");
        System.out.println("R: "+r);
        System.out.println("Pole: "+pole);
        System.out.println("Obwod: "+ obwod);
    }

}
