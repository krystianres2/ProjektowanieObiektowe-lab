package figury;

public class Stozek {
    int r;
    int h;
    double l=Math.sqrt((r*r)+(h*h));
    double objetosc;
    double pole;

    public Stozek(int r, int h) {
        this.r = r;
        this.h = h;
        objetosc();
        pole();
    }
    public void objetosc(){
        objetosc=(Math.PI*(r*r)*h)/3;
    }
    public void pole(){
        pole=(Math.PI*(r*r))+(Math.PI*r*l);
    }
    public void display(){
        System.out.println("Nazwa: "+"Stozek");
        System.out.println("R: "+r );
        System.out.println("H: "+h);
        System.out.println("L: "+l);
        System.out.println("Objetosc: "+objetosc);
        System.out.println("Pole: "+pole);

    }

}
