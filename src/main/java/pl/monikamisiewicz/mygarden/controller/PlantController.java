package pl.monikamisiewicz.mygarden.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.monikamisiewicz.mygarden.model.*;
import pl.monikamisiewicz.mygarden.service.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class PlantController {

    private final PlantService plantService;
    private final CategoryService categoryService;
    private final ExposureService exposureService;
    private final BloomTimeService bloomTimeService;
    private final StatusService statusService;

    @GetMapping("/plants")
    public String addPlant(Model model) {
        model.addAttribute("plant", new Plant());
        return "add-plant";
    }

    @PostMapping("/plants")
    public String savePlant(@Valid Plant plant, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "add-plant";
        }
        plantService.save(plant);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String getPlants(Model model) {
        List<Plant> plants = plantService.getPlants();
        model.addAttribute("plants",plants);
        return "plantlist";
    }



    @ModelAttribute("categories")
    public List<Category> categories() {
        return categoryService.getCategories();
    }

    @ModelAttribute("statuses")
    public List<Status> statuses() {
        return statusService.getStatuses();
    }

    @ModelAttribute("exposures")
    public List<Exposure> exposures() {
        return exposureService.getExposures();
    }

    @ModelAttribute("bloomTimes")
    public List<BloomTime> bloomTimes() {
        return bloomTimeService.getBloomTimes();
    }


}
