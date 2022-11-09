package figury;

public class Prostokat {
    int a;
    int b;
    int pole;
    int obwod;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
        pole();
        obwod();
    }
    public void pole(){
        pole=a*b;
    }
    public void obwod(){
        obwod=2*(a+b);
    }
    public void display(){
        System.out.println("Nazwa: "+"Prostokat");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("Pole: "+pole);
        System.out.println("Obwod: "+ obwod);
    }

}
