import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 * @author Pavlo Fita
 */
public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		String filename = "src/main/resources/list.txt";
		ArrayList<String> file = FileReader.readFileToArrayList(filename); // parsing file
		ArrayList<Employee> employees = new ArrayList<Employee>();
		for (String input : file) { // filling ArrayList
			try {
				employees.add(new Employee(input));
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.err.println("Incorrect input: " + input);
				continue;
			}
		}
	}
}
