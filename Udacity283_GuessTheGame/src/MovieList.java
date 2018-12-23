import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class MovieList {

    private ArrayList <String> movies;

    public MovieList(String pathname)
    {
        movies = new ArrayList();

        File file = new File(pathname);

        try
        {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine())
            {
                String movie = scanner.nextLine();
                movies.add(movie);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!");
        }
    }

    public String getRandomMovie()
    {
        int len = movies.size();
        System.out.println(len);
        int i = (int)( Math.random()*len);

        return movies.get(i);
    }
}
