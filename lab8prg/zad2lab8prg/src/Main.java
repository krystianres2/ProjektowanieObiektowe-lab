public class Main {
    public static void main(String[]args){
silnia(6);



    }
    public static void silnia(int a) {
        try {
            if (a < 0) {
                throw new BlednaWartoscDlaSilniException("Ujemna liczba");
            }
            int b, pom = 1;
            for (int i = 1; i < a; i++) {
                pom = pom * i;
            }
            System.out.println(pom);
        }catch (BlednaWartoscDlaSilniException e){
            e.printStackTrace();
        }
    }
}
