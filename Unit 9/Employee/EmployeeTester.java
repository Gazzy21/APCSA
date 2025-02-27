public class EmployeeTester {

	public static void main(String[] args) {
		System.out.print("Employee: ");
		Employee sally = new Employee(5);
		System.out.print(sally.getHours() + ", ");
		System.out.printf("$%.2f, ", sally.getSalary());
		System.out.print(sally.getVacationDays() + ", ");
		System.out.println(sally.getVacationForm());
		
		System.out.print("Secretary: ");
		Secretary pat = new Secretary();
		System.out.print(pat.getHours() + ", ");
		System.out.printf("$%.2f, ", pat.getSalary());
		System.out.print(pat.getVacationDays() + ", ");
		System.out.println(pat.getVacationForm());
		pat.takeDictation("hello");

		System.out.print("Lawyer: ");
		Lawyer PhoenixWright = new Lawyer(5);
		System.out.print(PhoenixWright.getHours() + ", ");
		System.out.printf("$%.2f, ", PhoenixWright.getSalary());
		System.out.print(PhoenixWright.getVacationDays() + ", ");
		System.out.println(PhoenixWright.getVacationForm());
		PhoenixWright.sue();

		System.out.print("Marketer: ");
		Marketer PeterGriffin = new Marketer(5);
		System.out.print(PeterGriffin.getHours() + ", ");
		System.out.printf("$%.2f, ", PeterGriffin.getSalary());
		System.out.print(PeterGriffin.getVacationDays() + ", ");
		System.out.println(PeterGriffin.getVacationForm());
		PeterGriffin.advertise();

		System.out.print("Legal Secretary: ");
		LegalSecretary SpongeBob = new LegalSecretary();
		System.out.print(SpongeBob.getHours() + ", ");
		System.out.printf("$%.2f, ", SpongeBob.getSalary());
		System.out.print(SpongeBob.getVacationDays() + ", ");
		System.out.println(SpongeBob.getVacationForm());
		SpongeBob.fileLegalBriefs();
	}

}