package web.services;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMW", 2020, "Black"));
        cars.add(new Car("Mercedes", 2021, "White"));
        cars.add(new Car("Tesla", 2022, "Black"));
        cars.add(new Car("Toyota", 2023, "Black"));
        cars.add(new Car("Lexus", 2024, "Black"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= cars.size() || count == 0) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}