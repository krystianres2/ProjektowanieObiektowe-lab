import java.time.Year;

public class Budynek {
    int obecnyRok= Year.now().getValue();
    String nazwa;
    int rokBudwowy;
    int liczbaPieter;

    public Budynek(String nazwa, int rokBudwowy, int liczbaPieter) {
        this.nazwa = nazwa;
        this.rokBudwowy = rokBudwowy;
        this.liczbaPieter = liczbaPieter;
    }
    public void display(){
        System.out.println("Nazwa budynku: "+ nazwa);
        System.out.println("Rok budowy: "+ rokBudwowy);
        System.out.println("Liczba pieter: "+liczbaPieter);
    }
    public void ileLat(){
    int pom=obecnyRok-rokBudwowy;
        System.out.println("Budynek ma "+pom+" lat");
    }


}
