package br.com.embraerfelpz.NarutoAPI;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Use this anottations for Controllers
@RequestMapping

public class NinjaController {

    @GetMapping("/bemvindo")
    public String boasVindas() {
        System.out.println("Log");
        return "Boas vindas";
    }
}
