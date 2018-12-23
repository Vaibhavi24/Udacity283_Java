import java.io.File;
import java.util.Scanner;

public class WordCount {

    public static void main(String []args) throws Exception
    {
        File file = new File("TaleofTwoCities.txt");

        Scanner scanner = new Scanner(file);

        int word = 0;
        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            System.out.println(line.split(" ").length);

            word += line.split(" ").length;
        }
        System.out.println("Total no of words in the File: "+ word);
    }
}
