import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class OverwriteLine {
  public static void main(String[] args) throws IOException {

    String filePath = "C:\\Users\\anton\\IdeaProjects\\books\\CopyFileProject\\src\\source.csv";
    String fileContents = null;

    try(Scanner sc = new Scanner(new File(filePath))) {
      StringBuilder buffer = new StringBuilder();
      while (sc.hasNextLine())
        buffer.append(sc.nextLine()).append(System.lineSeparator());
      fileContents = buffer.toString();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    String oldLine = "F,0.99,4,3.00";
    String newLine = "F,2.00,8,9.00";

    assert fileContents != null;
    fileContents = fileContents.replaceAll(oldLine, newLine);

    FileWriter writer = new FileWriter(filePath);
    writer.append(fileContents);
    writer.flush();
  }
}