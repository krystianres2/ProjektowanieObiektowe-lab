import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class Uczestnik {
    int ID;
    String imie;
    public int wiek;

    public int getID() {
        return ID;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public String toString() {
        return ID+" " + imie+" "+ wiek;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        else (!(obj instanceof Uczestnik)) return false;
        Uczestnik uczestnik=(Uczestnik) obj;
        return getID()== uczestnik.getID() && getWiek()==uczestnik.getWiek()&& Objects.equals(getImie(),uczestnik.getImie());
    }

    @Override
    public int hashCode() {
        return (ID + imie + wiek).hashCode();
    }

    public Uczestnik(int ID, String imie, int wiek) {
        this.ID = ID;
        this.imie = imie;
        this.wiek = wiek;
    }

    public static void show(Uczestnik a){
        System.out.println(a.toString());
    }

    public static void filtr(ArrayList<Uczestnik> list){
        for (Uczestnik e:list){
            if (e.getWiek()<18){
                System.out.println("Uczestnik o ID"+ e.getID()+" jest niepelnoletni");
            }
        }
    }//filtr

    public static void filtr(LinkedList<Uczestnik> list){
        for (Uczestnik e:list){
            if (e.getWiek()<18){
                System.out.println("Uczestnik o ID"+ e.getID()+" jest niepelnoletni");
            }
        }
    }//filtr

}
