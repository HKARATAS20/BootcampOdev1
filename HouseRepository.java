import java.util.Arrays;
import java.util.List;

public class HouseRepository {

    public List<RegularHouse> getRegularHouses() {
        return Arrays.asList(
                new RegularHouse(500000, 120, 3, 1),
                new RegularHouse(600000, 130, 4, 1),
                new RegularHouse(700000, 140, 4, 2));
    }

    public List<Villa> getVillas() {
        return Arrays.asList(
                new Villa(1200000, 200, 5, 2),
                new Villa(1500000, 220, 6, 2),
                new Villa(1300000, 210, 5, 3));
    }

    public List<SummerHouse> getSummerHouses() {
        return Arrays.asList(
                new SummerHouse(900000, 180, 4, 1),
                new SummerHouse(950000, 175, 3, 2),
                new SummerHouse(980000, 190, 4, 2));
    }
}
