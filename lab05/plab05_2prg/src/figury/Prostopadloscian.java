package figury;

public class Prostopadloscian {
    int a;
    int b;
    int c;
    int objetosc;
    int pole;

    public Prostopadloscian(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        objetosc();
        pole();
    }
    public void objetosc(){
        objetosc=a*b*c;
    }
    public void pole(){
        pole=2*((a*b)+(a*c)+(b*c));
    }
    public void display(){
        System.out.println("Nazwa: "+ "Prostopadloscian");
        System.out.println("A: "+a);
        System.out.println("B: "+b);
        System.out.println("C: "+c);
        System.out.println("Objetosc: "+objetosc);
        System.out.println("Pole: "+pole);
    }

}
