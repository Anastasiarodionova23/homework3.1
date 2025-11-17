public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println("Цена билета: " + price + " Начислено миль: " + miles);

        int [] testPrices = {25_000, 5_000, 1_000};
        for (int testPrice : testPrices) {
            int testMiles = service.calculate(price);
            System.out.println("Цена билета: " + testPrice + " Начислено миль: " + testMiles);
        }
    }
}
