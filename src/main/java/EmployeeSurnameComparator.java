
import java.util.Comparator;


public class EmployeeSurnameComparator implements Comparator<Employee> {

 
 
    
    public int compare(Employee emp1, Employee emp2) {
      
        return emp1.getSurname().compareTo(emp2.getSurname());
    }
}

