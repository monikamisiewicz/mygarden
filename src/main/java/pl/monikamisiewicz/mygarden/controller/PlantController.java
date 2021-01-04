package pl.monikamisiewicz.mygarden.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.monikamisiewicz.mygarden.model.Category;
import pl.monikamisiewicz.mygarden.model.Plant;
import pl.monikamisiewicz.mygarden.model.Status;
import pl.monikamisiewicz.mygarden.service.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class PlantController {

    private final PlantService plantService;
    private final CategoryService categoryService;
    private final ExposureService exposureService;
    private final BloomTimeService bloomTimeService;
    private final StatusService statusService;

    @GetMapping("/add-plant")
    public String addPlant(Model model) {
        model.addAttribute("plant", new Plant());
        return "add-plant";
    }

    @GetMapping("/plants")
    public String getPlants(Model model) {
        List<Plant> plants = plantService.getPlants();
        model.addAttribute("plants",plants);
        return "plants";
    }

    @ModelAttribute("cateogories")
    public List<Category> categories() {
        return categoryService.getCategories();
    }

    @ModelAttribute("statuses")
    public List<Status> statuses() {
        return statusService.getStatuses();
    }

}
