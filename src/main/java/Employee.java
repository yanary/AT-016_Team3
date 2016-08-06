import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;;

/**
 * 
 * @author Pavlo Fita
 *
 */
public class Employee {
	private String name;
	private String surname;
	private String position;
	private int salary;

	/**
	 * unformattedString is odd to have this format:
	 * "Name Surname(string)-position(string)-salary(int)" 
	 * Example: 
	 * Quentin Tarantino-creative director-8000 
	 * Mike Tyson-security-5000
	 * 
	 * @param unformattedString
	 * @throws InputMismatchException
	 */
	public Employee(String unformattedString) throws InputMismatchException {
		if (checkInput(unformattedString)) {
			String name, surname, position;
			int salary;
			String[] temp = unformattedString.split("-");
			String[] nameSurname = temp[0].split(" ");
			name = nameSurname[0];
			surname = nameSurname[1];
			position = temp[1];
			salary = Integer.parseInt(temp[2]);
			setName(name);
			setSurname(surname);
			setPosition(position);
			setSalary(salary);
		} else {
			throw new InputMismatchException("Incorrect input! Skipping the incorrect line");
		}
	}

	private static boolean checkInput(String unformattedString) {
		String regex = "^[A-Z][a-z]*\\s[A-Z][a-z]*-[a-zA-Z]+(\\s*[a-zA-Z]*)*-[1-9][0-9]+$";
		String input = unformattedString;
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();

	}

	@Override
	public String toString() {
		return (name != null ? name + " " : "") + (surname != null ? surname + ": " : "")
				+ (position != null ? "position=" + position + ", " : "") + "salary=" + salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
