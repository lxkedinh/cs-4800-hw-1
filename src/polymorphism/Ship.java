package polymorphism;

public class Ship {
    protected String name;
    protected String year;

    public Ship(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void print() {
        System.out.println("Ship name: " + name + "\n" +
                "Made in year: " + year);
    }
}
