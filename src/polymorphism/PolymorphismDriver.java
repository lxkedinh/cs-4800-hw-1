package polymorphism;

public class PolymorphismDriver {
    private static Ship[] ships = new Ship[3];
    public static void main(String[] args) {
        ships[0] = new Ship("SS Anne", "1942");
        ships[1] = new CruiseShip("Titanic", "1935", 20000);
        ships[2] = new CargoShip("SS John", "2011", 100);

        for (Ship ship : ships) {
            ship.print();
            // extra line of space between printing ships
            System.out.println();
        }
    }
}
