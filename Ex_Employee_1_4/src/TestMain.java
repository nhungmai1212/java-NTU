
public class TestMain {

	public static void main(String[] args) {
		Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1);

        e1.setSalary(999);
        System.out.println(e1);

        System.out.println("ID la: " + e1.getId());
        System.out.println("Ten la: " + e1.getFirstName());
        System.out.println("Ho la: " + e1.getLastName());
        System.out.println("Muc luong la: " + e1.getSalary());

        System.out.println("Ten la: " + e1.getName());
        System.out.println("Luong hang nam la: " + e1.getAnnualSalary());

        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);

	}

}
