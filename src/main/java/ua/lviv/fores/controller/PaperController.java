package ua.lviv.fores.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.lviv.fores.entity.Paper;
import ua.lviv.fores.services.PaperService;

import java.util.List;

/**
 * Created by Genabra on 29.08.2016.
 */
@Controller
public class PaperController {

    @Autowired
    private PaperService paperService;

    @RequestMapping(value = "/paper/all", method = RequestMethod.GET)
    private String getAllStattes(Model model) {
        List<Paper> paperList = paperService.findAll();
        model.addAttribute("papers", paperList);
        return "paperAll";
    }

    @RequestMapping(value = "/paper/new", method = RequestMethod.GET)
    public String addNewStatte(Model model) {
        model.addAttribute("paper", new Paper());
        return "paperNew";
    }

/*    @RequestMapping(value = "/author/create", method = RequestMethod.POST)
    public String createAuthor(@RequestParam("name")String name,@RequestParam("secondname")String secondname,@RequestParam("country")String country, @RequestParam("age")String age){
        authorService.add(name, secondname, country, Integer.parseInt(age));
        return "redirect:/author/all";
    }*/

    @RequestMapping(value = "/paper/create", method = RequestMethod.POST)
    public String createStatte(@ModelAttribute Paper paper) {
        paperService.add(paper);
        return "redirect:/paper/all";
    }

    @RequestMapping(value = "/paper/page/{id}", method = RequestMethod.GET)
    public String StattePage(@PathVariable String id, Model model) {
        Paper paper = paperService.findOne(Integer.parseInt(id));
        model.addAttribute("paper", paper);
        return "paperPage";
    }
}
