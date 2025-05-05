import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HouseService {
    private HouseRepository repository = new HouseRepository();

    public int getTotalPriceOfRegularHouses() {
        return repository.getRegularHouses().stream().mapToInt(House::getPrice).sum();
    }

    public int getTotalPriceOfVillas() {
        return repository.getVillas().stream().mapToInt(House::getPrice).sum();
    }

    public int getTotalPriceOfSummerHouses() {
        return repository.getSummerHouses().stream().mapToInt(House::getPrice).sum();
    }

    public int getTotalPriceOfAllHouses() {
        return Stream.of(
                repository.getRegularHouses(),
                repository.getVillas(),
                repository.getSummerHouses())
                .flatMap(List::stream)
                .mapToInt(House::getPrice)
                .sum();
    }

    public double getAverageSquareMetersOfRegularHouses() {
        return repository.getRegularHouses().stream().mapToInt(House::getSquareMeters).average().orElse(0);
    }

    public double getAverageSquareMetersOfVillas() {
        return repository.getVillas().stream().mapToInt(House::getSquareMeters).average().orElse(0);
    }

    public double getAverageSquareMetersOfSummerHouses() {
        return repository.getSummerHouses().stream().mapToInt(House::getSquareMeters).average().orElse(0);
    }

    public double getAverageSquareMetersOfAllHouses() {
        return Stream.of(
                repository.getRegularHouses(),
                repository.getVillas(),
                repository.getSummerHouses())
                .flatMap(List::stream)
                .mapToInt(House::getSquareMeters)
                .average()
                .orElse(0);
    }

    public List<House> filterHousesByRoomAndLivingRoom(int rooms, int livingRooms) {
        return Stream.of(
                repository.getRegularHouses(),
                repository.getVillas(),
                repository.getSummerHouses())
                .flatMap(List::stream)
                .filter(h -> h.getNumberOfRooms() == rooms && h.getNumberOfLivingRooms() == livingRooms)
                .collect(Collectors.toList());
    }
}
