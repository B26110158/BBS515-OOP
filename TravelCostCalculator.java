public class TravelCostCalculator {
    public static void main(String[] args) {
    // Kullanılacak ana veriler
        int distance = 450;
        double consumptionPer100km = 7.5;
        double fuelPrice = 52;
        double highwayFee = 250;
        int numberOfPeople = 3;

    // Yolculuk boyunca tüketilecek yakıt miktarı
        double totalFuelConsumption = (distance / 100.0) * consumptionPer100km;

    // Toplam Yakıt Maliyeti
        double fuelCost = totalFuelConsumption * fuelPrice;

    // Toplam Yolculuk Maliyeti
        double totalTravelCost = fuelCost + highwayFee;

    // Kişi Başı Yolculuk Maliyeti
        double costPerPerson = totalTravelCost / numberOfPeople;

    // Ekrana yazdırılacak sonuçlar:
    // Toplam Yakıt Tüketimi
        System.out.println("Total Fuel Consumption: " + totalFuelConsumption + " liters");
    // Toplam Yakıt Maliyeti
        System.out.println("Fuel Cost: " + fuelCost + " TL");
    // Toplam Yolculuk Maliyeti
        System.out.println("Total Travel Cost: " + totalTravelCost + " TL");
    // Kişi Başı Yolculuk Maliyeti
        System.out.println("Cost Per Person: " + costPerPerson + " TL");
    }
}
