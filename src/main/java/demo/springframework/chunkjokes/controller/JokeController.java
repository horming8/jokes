package demo.springframework.chunkjokes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import demo.springframework.chunkjokes.service.JokeService;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    
    @GetMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("name", jokeService.from());
        model.addAttribute("joke", jokeService.getQuote());

        String view = jokeService.from().toLowerCase().replaceAll("\\s", "");
        return "joke/" + view;
    }

}
