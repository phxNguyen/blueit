package com.nhuphuoc.blueit.controller;

import com.nhuphuoc.blueit.entity.Link;
import com.nhuphuoc.blueit.repository.LinkRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/links")
public class LinkController {

    private final LinkRepository linkRepository;

    public LinkController(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    @GetMapping("/")
    public List<Link> list(){

        return linkRepository.findAll();

    }

    @GetMapping("/foo")
    public String foo(Model model){
        model.addAttribute("pageTitle","this is page Foo");
        return "foo";
    }


    // Create a new link
    @PostMapping("/create")
    public Link create(@ModelAttribute Link link){


        return linkRepository.save(link);

    }

    @GetMapping("/{id}")
    public Optional<Link> read(@PathVariable Long id){
        return linkRepository.findById(id);
    }

    @PutMapping("/{id}")
    public Link update(@PathVariable Long id, @ModelAttribute Link link){
        return linkRepository.save(link);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        linkRepository.deleteById(id);

    }



}
