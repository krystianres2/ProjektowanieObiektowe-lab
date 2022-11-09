package figury;

public class Szescian {
    int a;
    int objetosc;
    int pole;

    public Szescian(int a) {
        this.a = a;
        objetosc();
        pole();
    }
    public void objetosc(){
        objetosc=a*a*a;
    }
    public void pole(){
        pole=6*(a^2);
    }
    public void display(){
        System.out.println("Nazwa: "+"Szescian");
        System.out.println("a: "+a);
        System.out.println("Pole: "+pole);
        System.out.println("Objetosc: "+ objetosc);
    }

}
