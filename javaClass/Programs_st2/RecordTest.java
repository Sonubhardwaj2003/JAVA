package javaClass.Programs_st2;
record TestEmployee(String name, int id) {};
public class RecordTest {
	public static void main(String args[]) {
		
		TestEmployee t1= new TestEmployee("Arjun",231);
		
		System.out.println(t1.name());
		System.out.println(t1.id());
		}

}


/*import java.util.Objects;

class TestEmployee{
	private String name;
	private int id;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestEmployee other = (TestEmployee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	
	
}
public class RecordTest {
	public static void main(String args[]) {
		TestEmployee t1= new TestEmployee();
		TestEmployee t2= new TestEmployee();
		t1.setName("Arjun");
		t2.setName("Arjun");
		System.out.println(t1.getName());
		
		if(t1.equals(t2))
			System.out.println("equals");
		else
			System.out.println("Not equals");
		t1.setId(231);
		System.out.println(t1.getId());
	}

}
*/