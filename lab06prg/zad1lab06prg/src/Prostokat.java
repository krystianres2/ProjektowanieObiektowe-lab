

public class Prostokat extends Figura {
    double x,y;
    public double wys=0, szer=0;
    String kolor="";

    public Prostokat(double wys, double szer){
        this.wys = wys;
        this.szer = szer;
    }
    public Prostokat(float wys, float szer, String kolor){
        this.wys = wys;
        this.szer = szer;
        this.kolor=kolor;
        Figura f=new Figura();
    }
    public void przesun(float x, float y){
        this.x=x;
        this.y=y;
    }


    double getPowierzchnia() {
        return (szer * wys);
    }
}
