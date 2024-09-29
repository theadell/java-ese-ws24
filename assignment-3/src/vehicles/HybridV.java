package vehicles;

public class HybridV extends Vehicle {
    public HybridV(HybridEngine engine, Manufacture manufacture) {
        super(engine, manufacture);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Vehicle Type: Hybrid Vehicle");
        System.out.println("Engine Type: " + engine.getEngineType());
        System.out.println(manufacture);
    }
}