package com.example.controllers;

import com.example.form.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class Home {

    /*@Autowired
    private EntityRepository entityRepository;*/

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String index(Post post, Model model) {
        model.addAttribute("name", post.getName());
        model.addAttribute("animal_type", post.getAnimal_type());
        return "index1";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addNewUser(@Valid Post post, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "index";
        }
        //entityRepository.save(new User(post.getName(), post.getAnimal_type()));
        model.addAttribute("name", post.getName());
        model.addAttribute("animal_type", post.getAnimal_type());
        return "trueForm";
    }
}