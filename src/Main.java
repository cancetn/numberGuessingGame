import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.

        /*
        Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı
        kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.
         */




        int sayi, tahmin;

        sayi = (int)(Math.random()*100);

        int sayac=0;

        boolean isWin = false;
        boolean isWrong = false;

        int[] yanlislar = new int[5];

        while(sayac<5) {

            Scanner inp = new Scanner(System.in);

            System.out.println("Lutfen tahmininizi giriniz : ");

            tahmin = inp.nextInt();

            if (tahmin < 0 || tahmin > 99) {

                System.out.println("Lutfen 0-100 arasinde bir sayi gririnz.");
                if (isWrong) {
                    sayac++;
                    System.out.println("Hatali giris yaptiniz kalan hak : " + (5 - sayac));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatali girisinizde hakkinizdan dusecektir.");
                }
                continue;
            }

            if(sayi == tahmin){
                System.out.println("Tebrikler dogru tahmin ! Dogru tahmin edilen sayi : "+sayi);
                isWin = true;
                break;
            }
            else{
                System.out.println("Yanlis tahmin ");
                if(tahmin > sayi){
                    System.out.println(tahmin + " sayisi gizli sayidan buyuk");

                }else{
                    System.out.println(tahmin + " sayisi gizli sayidan kucuk");
                }

                yanlislar[sayac++] = tahmin;
                System.out.println("Gelen hak sayisi : "+ (5-sayac));

            }





        }

        if(!isWin){
            System.out.println("Kaybettiniz !");
            if(!isWrong){
                System.out.println("Tahminleriniz : "+ Arrays.toString(yanlislar));
                System.out.println("Dogru sayi : "+sayi);
            }
        }


    }
}
