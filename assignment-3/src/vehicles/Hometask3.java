package vehicles;

public class Hometask3 {
    public static void main(String[] args) {
        // Create Manufacture instances
        Manufacture tesla = new Manufacture("Tesla", "USA");
        Manufacture bmw = new Manufacture("BMW", "Germany");
        Manufacture toyota = new Manufacture("Toyota", "Japan");

        // Create Vehicle objects
        Vehicle[] vehicles = new Vehicle[] {
            new ICEV(new CombustionEngine(), bmw),
            new BEV(new ElectricEngine(), tesla),
            new HybridV(new HybridEngine(), toyota)
        };

        // Display characteristics of each vehicle
        for (Vehicle vehicle : vehicles) {
            vehicle.ShowCharacteristics();
            System.out.println();
        }
    }
}
