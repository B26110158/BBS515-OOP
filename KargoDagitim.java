public class KargoDagitim {
    public static void main(String[] args) {

        // Teslimat numarasının tanımlanması
        int teslimatNo = 1;

        // Teslimat ücretinin tanımlaması
        double ucret;

        // Teslimatlardaki toplam gelirin tanımlanması
        double toplamGelir = 0;

        // 10 teslimatı işleyecek loop
        for (teslimatNo = 1;teslimatNo <= 10; teslimatNo++ ) {

            // Teslimatın uzaklığı
            int mesafe = teslimatNo * 5;

            // MEsafeye göre teslimat ücretinin hesaplanması
            if (mesafe <= 10) {
                ucret = 50;
            }
            else if (mesafe <= 30) {
                ucret = 80;
            }
            else  {
                ucret = 120;
            }

            // Teslimat no 3'ün katıysa 20 TL ücret eklenmesi
            if (teslimatNo % 3 == 0) {
                ucret += 20;
            }

            // 40 KM ve üstü mesafeye %10 indirim uygulanması
            if (mesafe >= 40){
                ucret *= 0.9;
            }

            // Teslimat, mesafe ve ücret'in ekrana yazdırılması
            System.out.println(teslimatNo + ". Teslimat - Mesafe: " + mesafe +" km - Ücret: " + ucret + " TL");

            // Looptaki ücret çıktılarının toplam gelire eklenmesi
            toplamGelir += ucret;
        }

        // Bir satır boşluk bırakarak toplam gelirin yazdırılması
        System.out.println();
        System.out.println("Toplam Gelir: " + toplamGelir + " TL");
        }
    }

