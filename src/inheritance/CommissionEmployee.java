package inheritance;

public class CommissionEmployee extends Employee {
    private double commissionRate;
    private int grossSales;

    public CommissionEmployee(String firstName, String lastName, String ssn, double commissionRate, int grossSales) {
        super(firstName, lastName, ssn);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public int getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }
}
