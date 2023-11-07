import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PostfixDriver {
    public static void main(String[] args) {
        try {
            Postfix p = new Postfix();
            Scanner s = new Scanner(new File("tests.txt"));
            String a = "" + p.calculate(s.nextLine());
            System.out.println(a);
            try {
                FileWriter myWriter = new FileWriter("log.txt");
                myWriter.write(a);
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        catch( FileNotFoundException e){
            System.out.println(e);
        }
    }
}
