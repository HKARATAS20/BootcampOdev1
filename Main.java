public class Main {
    public static void main(String[] args) {
        HouseService service = new HouseService();

        System.out.println("Total price of regular houses: " + service.getTotalPriceOfRegularHouses());
        System.out.println("Total price of villas: " + service.getTotalPriceOfVillas());
        System.out.println("Total price of summer houses: " + service.getTotalPriceOfSummerHouses());
        System.out.println("Total price of all houses: " + service.getTotalPriceOfAllHouses());

        System.out.println("\nAverage sqm of regular houses: " + service.getAverageSquareMetersOfRegularHouses());
        System.out.println("Average sqm of villas: " + service.getAverageSquareMetersOfVillas());
        System.out.println("Average sqm of summer houses: " + service.getAverageSquareMetersOfSummerHouses());
        System.out.println("Average sqm of all houses: " + service.getAverageSquareMetersOfAllHouses());

        System.out.println("\nFiltered houses with 4 rooms and 2 living rooms:");
        for (House house : service.filterHousesByRoomAndLivingRoom(4, 2)) {
            System.out.println(house);
        }
    }
}
