
import java.util.Scanner;

public class OgrenciNotAnalizSistemi {

    // Notları alma
    public static void notlariAl(int[] notlar) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < notlar.length; i++) {
            int not;

            do {
                System.out.print((i + 1) + ". Öğrencinin notu: ");
                not = scanner.nextInt();

                if (not < 0 || not > 100) {
                    System.out.println("Hata! Not 0 ile 100 arasında olmalıdır.");
                }

            } while (not < 0 || not > 100);

            notlar[i] = not;
        }
    }

    // Ortalamayı hesaplama
    public static double ortalamaHesapla(int[] notlar) {
        double toplamNot = 0;

        for (int i = 0; i < notlar.length; i++) {
            toplamNot = toplamNot + notlar[i];
        }

        double ortalama = toplamNot / notlar.length;
        return ortalama;
    }

    // En yüksek notu bulma
    public static int enYuksekNot(int[] notlar) {
        int enYuksek = notlar[0];

        for (int i = 1; i < notlar.length; i++) {
            if (notlar[i] > enYuksek) {
                enYuksek = notlar[i];
            }
        }

        return enYuksek;
    }

    // Başarılı öğrenci sayısını hesaplama
    public static int basariliSayisi(int[] notlar) {
        int sayac = 0;

        for (int i = 0; i < notlar.length; i++) {
            if (notlar[i] >= 50) {
                sayac++;
            }
        }

        return sayac;
    }

    // Sonuçları ekrana yazdırma
    public static void sonuclariYazdir(double ortalama, int enYuksek, int basarili) {
        System.out.println("\n===== ANALIZ SONUCLARI =====");
        System.out.println("Sınıf Ortalaması: " + ortalama);
        System.out.println("En Yüksek Not: " + enYuksek);
        System.out.println("Başarılı Öğrenci Sayısı: " + basarili);
    }


    // metodların main içerisinde çalıştırılması
    public static void main(String[] args) {

        int[] notlar = new int[5];

        System.out.println("===== OGRENCI NOT ANALIZ SISTEMI =====");

        notlariAl(notlar);

        double ortalama = ortalamaHesapla(notlar);
        int enYuksek = enYuksekNot(notlar);
        int basarili = basariliSayisi(notlar);

        sonuclariYazdir(ortalama, enYuksek, basarili);
    }
}
