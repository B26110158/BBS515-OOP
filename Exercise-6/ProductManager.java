public class ProductManager {

    public void urunBilgileriniGoster(Product product) {
        System.out.println("Ürün: " + product.getName());
        System.out.println("Fiyat: " + product.getPrice());
        System.out.println("Stok: " + product.getStock());
        System.out.println("------------------------");
    }

    public void satisYap(Product product, int adet) {
        int mevcutStok = product.getStock();

        if (adet <= 0) {
            System.out.println("Satış adedi 0'dan büyük olmalıdır.");
        } else if (adet > mevcutStok) {
            System.out.println("Yetersiz stok!");
        } else {
            product.setStock(mevcutStok - adet);
            System.out.println(adet + " adet " + product.getName() + " satıldı.");
        }
    }

    public void stokEkle(Product product, int adet) {
        if (adet <= 0) {
            System.out.println("Eklenecek adet 0'dan büyük olmalıdır");
        } else {
            int yeniStok = product.getStock() + adet;
            product.setStock(yeniStok);
            System.out.println(adet + " adet " + product.getName() + " stoka eklendi.");
        }
    }
}