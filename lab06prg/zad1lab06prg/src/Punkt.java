public class Punkt {
    int x;
    int y;

    public Punkt() {
        x=5;
        y=2;
    }

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void zeruj(){
        x=0;
        y=0;
    }
    public void opis(){
        System.out.println("X= "+x);
        System.out.println("Y= "+y);
    }
    public void przesun(int x, int y){
        this.x=x;
        this.y=y;
    }

}
