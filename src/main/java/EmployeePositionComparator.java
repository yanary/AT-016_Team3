import java.util.Comparator;
 


public class EmployeePositionComparator implements Comparator<Employee> {
 
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getPosition().compareTo(emp2.getPosition());
    }
}