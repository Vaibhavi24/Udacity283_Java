public class Main {

    public static void main(String []args)
    {
        Game game = new Game("movies.txt");

        while (!game.gameEnded())
        {
            System.out.println("You have guessed the Movie title as this: "+game.getHiddenMovieTitle()+" so far...");
            System.out.println("Make a new guess!");
            game.guessLetter();
        }

        if(game.isGameWon())
        {
            System.out.println("Congrats! You've correctly guessed the Movie Title: "+game.getMovieTitle());
        }
        else
        {
            System.out.println("You've lost all points!");
            System.out.println("The actual movie was: "+game.getMovieTitle());
        }
    }
}
