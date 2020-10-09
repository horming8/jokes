package demo.springframework.chunkjokes.service;

import org.springframework.stereotype.Service;

import demo.springframework.chunkjokes.repository.QuoteRepository;

@Service
public class JokeServiceImpl implements JokeService {

    private final QuoteRepository quoteRepository;

    public JokeServiceImpl(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    @Override
    public String getQuote() {
        return quoteRepository.getQuote();
    }

    @Override
    public String from() {
        return quoteRepository.name();
    }
}
