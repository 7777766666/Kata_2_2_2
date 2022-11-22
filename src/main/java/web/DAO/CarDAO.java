package web.DAO;

import org.springframework.stereotype.Component;
import web.Model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO {
    private static int CAR_COUNT;
    private List<Car> carsList;

    {
        carsList = new ArrayList<>();
        carsList.add(new Car(++CAR_COUNT, "Audi", 66));
        carsList.add(new Car(++CAR_COUNT, "BMW", 76));
        carsList.add(new Car(++CAR_COUNT, "Lada", 7));
        carsList.add(new Car(++CAR_COUNT, "Kamaz", 105));
        carsList.add(new Car(++CAR_COUNT, "Tesla", 98));
    }

    public List<Car> allCarDAO(int count) {
        if (count < 1 || count > 5) {
            return carsList;
        }
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}

