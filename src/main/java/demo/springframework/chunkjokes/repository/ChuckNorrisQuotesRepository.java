package demo.springframework.chunkjokes.repository;

import org.springframework.stereotype.Repository;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Repository
public class ChuckNorrisQuotesRepository implements QuoteRepository {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisQuotesRepository(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public String name() {
        return "Chuck Norris";
    }

    public String getQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
