package hw9Encapsulation;



public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Abu Shaim");
		employee.setAge(24);
		employee.setSex('M');
		employee.setUsCitizen(false);

		System.out.println("Employee Name:" + employee.getName() + ",\nAge: " + employee.getAge() + ", \nSex: "
				+ employee.getSex() + ", \nUsCitizen:" + employee.isUsCitizen());
	}

}
