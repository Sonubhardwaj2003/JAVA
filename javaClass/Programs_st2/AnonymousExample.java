package javaClass.Programs_st2;
interface Employee {
	String getSalary();

	String getDesignation();
}

public class AnonymousExample{
	public static void main(String args[]) {
		Employee emp = new Employee() {
			public String getSalary() {
				return "100";
			}

			public String getDesignation() {
				return "Developer";
			}

		};
		System.out.println(emp.getSalary());
		System.out.println(emp.getDesignation());

	}
}
