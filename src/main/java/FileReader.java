import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Pavlo Fita
 *
 */
public class FileReader {

	/**
	 * Extract ArrayList from file
	 * 
	 * @param fileToRead
	 * @return ArrayList
	 * @throws FileNotFoundException
	 */
	public static ArrayList<String> readFileToArrayList(String fileToRead) throws FileNotFoundException {
		File file = new File(fileToRead);
		ArrayList<String> names = new ArrayList<String>();
		Scanner in = new Scanner(file);
		while (in.hasNextLine()) {
			names.add(in.nextLine());
		}
		in.close();

		return names;
	}

}
