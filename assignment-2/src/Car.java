import java.io.FileWriter;
import java.io.IOException;
import java.time.Year;
import java.util.List;
import java.util.stream.Collectors;

public class Car {

    int id;
    String make;
    String model;
    int yearOfManufacture;
    String color;
    double price;
    String registrationNumber;


    public Car(int id, String make, String model, int yearOfManufacture, String color, double price, String registrationNumber) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car [id=" + id + ", make=" + make + ", model=" + model + ", yearOfManufacture=" + yearOfManufacture
                + ", color=" + color + ", price=" + price + ", registrationNumber=" + registrationNumber + "]";
    }



    public static void writeCarsToFile(List<Car> cars, String fileName) throws IOException {
        try (var writer = new FileWriter(fileName)) {
            for (Car car : cars) {
                writer.write(car.toString() + "\n");
            }
        }
    }

    public static void saveCarsByBrand(List<Car> cars, String brand, String fileName) throws IOException {
        var filteredCars = cars.stream()
                               .filter(car -> car.make.equalsIgnoreCase(brand))
                               .collect(Collectors.toList());
        writeCarsToFile(filteredCars, fileName);
    }

    public static void saveCarsByModelAndYears(List<Car> cars, String model, int years, String fileName)
            throws IOException {
        int currentYear = Year.now().getValue();
        var filteredCars = cars.stream()
                               .filter(car -> car.model.equalsIgnoreCase(model) && (currentYear - car.yearOfManufacture > years))
                               .collect(Collectors.toList());
        writeCarsToFile(filteredCars, fileName);
    }

    public static void saveCarsByYearAndPrice(List<Car> cars, int year, double price, String fileName)
            throws IOException {
        var filteredCars = cars.stream()
                               .filter(car -> car.yearOfManufacture == year && car.price > price)
                               .collect(Collectors.toList());
        writeCarsToFile(filteredCars, fileName);
    }

    // Main method
    public static void main(String[] args) {

        var cars = List.of(
            new Car(1, "Tesla", "Model 3", 2019, "Black", 45000, "TES123"),
            new Car(2, "BMW", "i3", 2020, "White", 38000, "BMW456"),
            new Car(3, "Audi", "e-tron", 2021, "Blue", 70000, "AUD789"),
            new Car(4, "Mercedes", "EQC", 2020, "Red", 67000, "MER321"),
            new Car(5, "Volkswagen", "ID.3", 2019, "Green", 34000, "VW987"),
            new Car(6, "Porsche", "Taycan", 2022, "Black", 150000, "POR456")
        );

        try {
            saveCarsByBrand(cars, "Tesla", "cars_by_brand.txt");
            saveCarsByModelAndYears(cars, "Model 3", 2, "cars_by_model_years.txt");
            saveCarsByYearAndPrice(cars, 2020, 35000, "cars_by_year_price.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
