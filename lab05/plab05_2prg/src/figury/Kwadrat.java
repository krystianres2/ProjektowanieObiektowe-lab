package figury;

public class Kwadrat {
    int a;
    int pole;
    int obwod;

    public Kwadrat(int a) {
        this.a = a;
        pole();
        obwod();
    }
    public void pole(){
        pole=a*a;
    }
    public void obwod(){
        obwod=4*a;
    }
    public void display(){
        System.out.println("Nazwa: "+"Kwadrat");
        System.out.println("a: "+a);
        System.out.println("Pole: "+pole);
        System.out.println("Obwod: "+ obwod);
    }

}
