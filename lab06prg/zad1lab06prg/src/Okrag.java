public class Okrag extends Figura{
   public Punkt p=new Punkt(1,2);
    double r;

    public double getPowierzchnia(){
        return Math.PI*r*r;
    }
    public double getSrednica(){
        return 2*r;
    }

    public double getR() {
        return r;
    }

    public void setR(double p) {
        this.r = p;
    }
    /*public  boolean wSrodku(Punkt p){
        double pom;
        pom=(p.x-)
        if()
    }*/

    public Okrag(Punkt p, double r) {
        this.p = p;
        this.r = r;
    }
}
