package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {

    private final List<Car> list = Arrays.asList(
            new Car("BMW", "Black", 2020),
            new Car("Audi", "White", 2018),
            new Car("Mercedes", "Silver", 2021),
            new Car("Toyota", "Blue", 2019),
            new Car("Honda", "Red", 2017)
    );

    @Override
    public List<Car> getCars(int count) {
        return list;
    }
}
