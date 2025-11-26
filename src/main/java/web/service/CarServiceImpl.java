package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = Arrays.asList(
            new Car("BMW", "Black", 2020),
            new Car("Audi", "White", 2018),
            new Car("Mercedes", "Silver", 2021),
            new Car("Toyota", "Blue", 2019),
            new Car("Honda", "Red", 2017)
    );

    @Override
    public List<Car> getCars(int count) {
        return count >= cars.size() ? cars : cars.subList(0, count);
    }
}
