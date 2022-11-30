public class Czlowiek {
    String imie;
    String nazwisko;
    int wiek;

    public Czlowiek(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return imie+" "+ nazwisko+" "+ wiek;
    }
}
