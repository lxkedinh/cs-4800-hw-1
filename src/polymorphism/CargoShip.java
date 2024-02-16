package polymorphism;

public class CargoShip extends Ship {
    private int capacityTons;

    public CargoShip(String name, String year, int capacity) {
        super(name, year);
        this.capacityTons = capacity;
    }

    public int getCapacityTons() {
        return capacityTons;
    }

    public void setCapacityTons(int capacityTons) {
        this.capacityTons = capacityTons;
    }

    @Override
    public void print() {
        System.out.println("Ship name: " + name + "\n" +
                "Capacity (tons): " + capacityTons);
    }
}
