package guru.framework.spring5jokesappv2.controllers;

import guru.framework.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String ShowJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }

}
