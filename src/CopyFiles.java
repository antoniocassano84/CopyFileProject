import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CopyFiles {

  private static void copyFile(String sourceFileName, String destinationFileName) {

    try  (BufferedReader br = new BufferedReader(new FileReader(sourceFileName));
          PrintWriter pw = new PrintWriter(new FileWriter(destinationFileName))) {
      String line;
      while ((line = br.readLine()) != null)
        pw.println(line);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    String destinationFileName = "C:\\Users\\anton\\IdeaProjects\\books\\CopyFileProject\\src\\destination.csv";
    String sourceFileName = "C:\\Users\\anton\\IdeaProjects\\books\\CopyFileProject\\src\\source.csv";
    copyFile(sourceFileName, destinationFileName);
  }

}