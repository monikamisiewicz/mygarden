package pl.monikamisiewicz.mygarden;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {

    @GetMapping("/")
    public String goHome() {
        return "index";
    }


}
