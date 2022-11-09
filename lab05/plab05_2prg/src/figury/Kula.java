package figury;

public class Kula {
    int r;
    double objetosc;
    double pole;

    public Kula(int r){
        this.r = r;
        objetosc();
        pole();
    }
    public void objetosc(){
    objetosc=(4/3)*Math.PI*(r^3);
    }
    public void pole(){
        pole=4*Math.PI*(r^3);
    }
    public void display(){
        System.out.println("Nazwa: "+"Kula");
        System.out.println("R: "+r);
        System.out.println("Objetosc: "+objetosc);
        System.out.println("Pole: "+pole);
    }

}
