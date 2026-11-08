public class Main {
    public static void main(String[] args) {
        // 1. Ürün nesnelerini oluşturma
        Product product1 = new Product("Laptop", 25000, 10);
        Product product2 = new Product("Mouse", 500, 20);

        // 2. Yönetici nesnesini oluşturma
        ProductManager manager = new ProductManager();

        // 3. Başlangıç bilgilerini gösterme
        System.out.println("=== BAŞLANGIÇ BİLGİLERİ ===");
        manager.urunBilgileriniGoster(product1);
        manager.urunBilgileriniGoster(product2);

        // 4. Laptop ürününden 3 adet satma
        manager.satisYap(product1, 3);

        // 5. Mouse ürününden 25 adet satmayı deneme
        manager.satisYap(product2, 25);

        // 6. Mouse ürününe 10 adet stok ekleme
        manager.stokEkle(product2, 10);

        // 7. Laptop fiyatını -500 yapmayı deneme
        product1.setPrice(-500);

        // 8. Güncel ürün bilgilerini gösterme
        System.out.println("\n=== GÜNCEL BİLGİLER ===");
        manager.urunBilgileriniGoster(product1);
        manager.urunBilgileriniGoster(product2);
    }
}