
 
import java.util.Comparator;
 

public class EmployeeSalaryComparator implements Comparator<Employee> {
 
    @Override
    public int compare(Employee emp2, Employee emp1) {
        return emp2.getSalary() - emp1.getSalary();
    }
}