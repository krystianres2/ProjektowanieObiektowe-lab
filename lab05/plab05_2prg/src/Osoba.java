public class Osoba {
    //zad1
    String imie;
    String nazwisko;
    int wiek;

    Osoba(){}
    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }
    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
    public void pokazDane(){
        System.out.println("Imie: "+imie);
        System.out.println("Nazwisko: "+nazwisko);
        System.out.println("Wiek: "+ wiek);
    }
}
