
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparator implements Comparator<Employee> {

    public int compare(Employee emp1, Employee emp2) {

        int value1 = emp1.getName().compareTo(emp2.getName());

        if (value1 == 0) {
            int value2 = emp1.getSurname().compareTo(emp2.getSurname());
            if (value2 == 0) {
                int value3 = emp1.getPosition().compareTo(emp2.getPosition());
                if (value3 == 0) {
                    return emp1.getSalary() - emp2.getSalary();
                } else {
                    return value3;
                }

            } else {
                return value2;
            }

        }
        return value1;
    }

}
