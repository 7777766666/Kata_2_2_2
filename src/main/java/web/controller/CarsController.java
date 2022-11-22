package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDAO;

@Controller
@RequestMapping   ("/")
public class CarsController {

    private final CarDAO carDAO;

    @Autowired
    public CarsController(CarDAO carDAO) {
       this.carDAO = carDAO;
    }

    @GetMapping (value = "/cars")
    public String allCars(@RequestParam(defaultValue = "5" ) int count, Model model){
        model.addAttribute("all", carDAO.allCarDAO(count));
        return "cars";
    }
}
