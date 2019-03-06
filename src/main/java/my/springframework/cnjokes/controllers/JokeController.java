package my.springframework.cnjokes.controllers;

import my.springframework.cnjokes.services.Joke;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private Joke joke;

    public JokeController(Joke joker) {
        this.joke = joker;
    }

    @RequestMapping({"","/joke"})
    public String getJoke(Model model) {

        model.addAttribute("joke", joke.getJoke());

        return "chucknorris";
    }
}
