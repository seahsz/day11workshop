package day11workshop.RandomMemecoinOfTheDay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller

@RequestMapping (path = {"index.html", "/"})
public class MemecoinOfTheDayController {

    private Random rand = new Random();
    private final String IMG_DIR = "images/";


    @GetMapping
    public String getMemeCoinOfTheDay(Model model) {

        model.addAttribute("imgFileName", "%s%s".formatted(IMG_DIR,getRandomImage()));

       return "memecoinOfTheDay"; 
    }

    public String getRandomImage() {

        int imgIdx = rand.nextInt(Constants.IMG_FILES.length);
        return(Constants.IMG_FILES[imgIdx]);
    }
    
}
