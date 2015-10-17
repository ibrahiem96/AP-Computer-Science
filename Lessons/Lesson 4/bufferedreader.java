
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
  public static void main(String[] args) throws Exception {
    File file = new File("test.txt");
    StringBuffer contents = new StringBuffer();
    BufferedReader reader = null;

    reader = new BufferedReader(new FileReader(file));
    String text = null;

    // repeat until all lines is read
    while ((text = reader.readLine()) != null) {
      contents.append(text).append(System.getProperty("line.separator"));
    }
    reader.close();
    System.out.println(contents.toString());
  }
}