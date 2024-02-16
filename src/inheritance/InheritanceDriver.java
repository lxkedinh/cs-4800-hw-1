package inheritance;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class InheritanceDriver {
    public static void main(String[] args) {
        SalariedEmployee joe = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee mary = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommissionEmployee nicole = new CommissionEmployee("Nicole", "Dior", "444-44-4444", .15, 50000);
        SalariedEmployee renwa = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee mike = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommissionEmployee mahnaz = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", .22, 40000);
    }
}