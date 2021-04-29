package pl.kacpergski.joke;

import io.chucknorris.client.ChuckNorrisClient;
import io.chucknorris.client.Joke;

public class ChuckJoke {

    public static void main(String[] args) {
        // create the chuck norris client
        ChuckNorrisClient client = new ChuckNorrisClient();

        // get a random joke and print it
        // Joke joke = new Joke();

        Joke joke = client.getRandomJoke();

        System.out.println("Random joke: " + joke.getValue());

    }

}
