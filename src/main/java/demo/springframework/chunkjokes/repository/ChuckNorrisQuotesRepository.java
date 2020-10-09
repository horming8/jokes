package demo.springframework.chunkjokes.repository;

import org.springframework.stereotype.Repository;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Repository
public class ChuckNorrisQuotesRepository extends ChuckNorrisQuotes implements QuoteRepository {

    public String name() {
        return "Chuck Norris";
    }

    public String getQuote() {
        return getRandomQuote();
    }

}
