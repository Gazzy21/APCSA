public class Marketer extends Employee{
    public double getSalary() {
        return 50000.0;
    }

    public void advertise() {
        System.out.println("Buy now and get one free! Only for a limited time!");
    }

    public Marketer(int years) {
        super(years);
    }
}
