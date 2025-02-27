public class Lawyer extends Employee {
    public String getVacationForm() {
        return "pink";
    }

    public int getVacationDays() {
        return 15;
    }

    public void sue() {
        System.out.println("I'll see you in court!");
    }

    public Lawyer(int years) {
        super(years);   
    }
}
