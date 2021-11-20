//program to implement Clonable Interface
public class Employee implements Cloneable {
  
    private String name;
  
    public Employee(String name) {
        this.name = name;
    }
  
    public String getName() {
        return name;
    }
  
    public Object clone()throws CloneNotSupportedException{  
        return (Employee)super.clone();  
    }
     
    public static void main(String[] args) {
        Employee emp = new Employee("Abhi");
        try {
            Employee emp2 = (Employee) emp.clone();
            System.out.println(emp2.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}