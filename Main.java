public class Main {

    /*

    1 den 1000 e kadar asal olan sayıları ekrana yazdırın.
    Asal Sayı 1'ee ve kendinden başka hiç bir sayıya bölünmeyen sayı.
     */

    public static boolean asalmi(int sayi) {

        for (int i = 2; i<sayi ; i++) {

            if ( sayi % i == 0 ) {

                return false;
            }

        }
        return true;

    }

    public static void main (String[]args){

        for ( int i =2 ; i < 1000 ; i++) {

            if ( asalmi(i)) {

                System.out.println(i);
            }


        }


    }
}
