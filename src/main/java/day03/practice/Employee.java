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

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }



    public static void main(String[] args) {
        Employee e1 = new Employee(1, "naresh");
        Employee e2 = new Employee(2, "suresh");

        System.out.println(e1); // Output: Employee [id=1, name=naresh]
        System.out.println(e2); // Output: Employee [id=2, name=suresh]
    }
}
