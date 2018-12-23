import java.util.Scanner;

public class Game
{
    private String movieToGuess;
    private int pointsLost;

    private String wrongLetters;
    private String rightLetters;
    private String space;
    private boolean gameWon;

    public Game(String pathname)
    {
        MovieList movieList = new MovieList(pathname);

        movieToGuess = movieList.getRandomMovie();
        pointsLost = 0;
        wrongLetters = "";
        rightLetters = " ";
        space = " ";
        gameWon = false;
    }

    public String getMovieTitle()
    {
        return movieToGuess;
    }

    public String getHiddenMovieTitle()
    {
        if(rightLetters.equals(" "))
        {
            return movieToGuess.replaceAll("[a-zA-Z]", "_");
        }
        else
        {
            return movieToGuess.replaceAll("[^ " + rightLetters + "]", "_");
        }
    }

    public String getWrongLetters()
    {
        return wrongLetters;
    }

    public boolean isGameWon()
    {
        return gameWon;
    }

    public boolean gameEnded()
    {
        if (pointsLost == 10)
            return true;

        if(getHiddenMovieTitle().equals(movieToGuess))
        {
            gameWon = true;
            return true;
        }

        return false;
    }

    private String inputLetter()
    {
        if(pointsLost == 10)
            return "#";

        System.out.println("Guess a letter!");

        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine().toLowerCase();

        if(!letter.matches("[a-z]"))
        {
            System.out.println("Invalid choice!");

            pointsLost++;
            return inputLetter();
        }
        else if(wrongLetters.contains(letter))
        {
            System.out.println("You've already got this letter wrong!");
            System.out.println(getHiddenMovieTitle());

            pointsLost++;
            return inputLetter();
        }
        else if(rightLetters.contains(letter))
        {
            System.out.println("You've already got this letter right!");
            System.out.println(getHiddenMovieTitle());

            return inputLetter();
        }
        else
        {
            return letter;
        }
    }

    public void guessLetter()
    {
        String guessedLetter = inputLetter();

        if(movieToGuess.contains(guessedLetter))
        {
            rightLetters += guessedLetter;
        }
        else
        {
            pointsLost++;
            wrongLetters += guessedLetter;
        }
    }
}







































//import java.util.ArrayList;
//
//public class Game {
//
//    private String answer;
//    private int pointsLost;
//    private boolean done;
//    private ArrayList<Boolean> guessed;
//    private ArrayList<Boolean> incorrectGuesses;
//
//    public Game()
//    {
//        MovieList movieList = new MovieList("movies.txt");
//
//        answer = movieList.getRandomMovie();
//        pointsLost = 0;
//        done = false;
//
//        ArrayList<Boolean> guessed = new ArrayList<>();
//
//        for (int i = 0; i < answer.length(); i++)
//            guessed.add(false);
//
//        ArrayList<Boolean> incorrectGuesses = new ArrayList<>();
//
//        for (int i=0; i < 26; i++)
//            incorrectGuesses.add(false);
//    }
//
//    public boolean guessLetter(char c)
//    {
//        int x = c - 'a';
//        if(incorrectGuesses.get(x))
//        {
//            return false;
//        }
//
//        boolean flag = false;
//        for (int i=0;i<answer.length();i++)
//        {
//            if(answer.charAt(i) == c)
//            {
//                flag = true;
//                guessed[x] = true;
//            }
//        }
//    }
//}
