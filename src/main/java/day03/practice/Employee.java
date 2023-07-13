package day03.practice;
/*

id=1, name=naresh

id=2, name=suresh

*/


public class Employee {
	 
    private int id;
    private String name;
 
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getAccNo() {
		return id;
	}

	public void setAccNo(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
 
    	 
        public static void main(String[] args) {
            Employee e1 = new Employee(1, "naresh");
            Employee e2 = new Employee(2, "suresh");
        }
    
}