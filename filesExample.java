package javaAssignment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class filesExample {

	public static void main(String[] args) throws IOException {
		
		//Reading a file
		Path pathofFiletoRead = Paths
				.get("C:/Users/ranjitha.patil/eclipse-workspace/JavaAssignment/src/javaAssignment/Resources/data.txt");
		Files.lines(pathofFiletoRead).forEach(System.out::println);
		
		//Writing to file
		Path pathofFileToWrite=Paths.get("C:/Users/ranjitha.patil/eclipse-workspace/JavaAssignment/src/javaAssignment/Resources/File-Write.txt");
		List<String> list = List.of("man", "cat", "ugf");
		Files.write(pathofFileToWrite, list);
		Files.lines(pathofFileToWrite).forEach(System.out::println);

		// Deleting a file
		File file = new File(
				"C:/Users/ranjitha.patil/eclipse-workspace/JavaAssignment/src/javaAssignment/Resources/File-Write.txt");

		if (file.delete()) {
			System.out.println("File deleted");
		} else {
			System.out.println("unable to delete the file");
		}
	}

}
