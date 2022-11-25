public class Adres {
    String miasto;
    String ulica;
    int numerDomu;
    String kodPocztowy;

    public Adres(String miasto, String ulica, int numerDomu, String kodPocztowy) {
        try {
            if (miasto == null) {
                throw new NieprawidlowyAdresException("Miasto nie moze byc nullem");
            }
            if (ulica == null) {
                throw new NieprawidlowyAdresException("Ulica nie moze byc nullem");
            }
            if (numerDomu <=0) {
                throw new NieprawidlowyAdresException("Numer domu musi byc dodatni");
            }
            if (kodPocztowy == null) {
                throw new NieprawidlowyAdresException("Kod pocztowy nie moze byc nullem");
            }
            this.miasto = miasto;
            this.ulica = ulica;
            this.numerDomu = numerDomu;
            this.kodPocztowy = kodPocztowy;
        }catch (NieprawidlowyAdresException e){
            e.printStackTrace();
        }
    }
}
