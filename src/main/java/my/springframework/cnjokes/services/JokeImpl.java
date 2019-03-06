package my.springframework.cnjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeImpl implements Joke {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
         return chuckNorrisQuotes.getRandomQuote();
    }
}
