public class main {
    public static void main(String[] args) {
        Arac arac1 = new Arac("Toyota", "Corolla", 1500, false);
        Arac arac2 = new Arac("Renault", "Clio", 1200, false);
        Arac arac3 = new Arac("BMW", "320i", 3000, true);

        System.out.println("=== ARAÇ KİRALAMA SİSTEMİ ===");
        arac1.bilgileriGoster();
        arac2.bilgileriGoster();
        arac3.bilgileriGoster();

        arac1.kirala();
        arac1.kirala();

        double kiraBedeli = arac2.kiraBedeliHesapla(5);
        System.out.println("5 Günlük Kiralama Bedeli: " + kiraBedeli + " TL");

        arac3.teslimEt();

        System.out.println();
        System.out.println("=== GÜNCEL ARAÇ DURUMLARI ===");
        arac1.bilgileriGoster();
        arac2.bilgileriGoster();
        arac3.bilgileriGoster();
    }
}
