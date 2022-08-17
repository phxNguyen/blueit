package com.nhuphuoc.blueit.controller;

import com.nhuphuoc.blueit.entity.Link;
import com.nhuphuoc.blueit.repository.LinkRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/")
public class LinkController {

    private final LinkRepository linkRepository;

    public LinkController(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    @GetMapping("/")
    public String list(Model model){

        model.addAttribute("links", linkRepository.findAll());

        return "link/list";

    }



    @GetMapping("/link/{id}")
    public String read(@PathVariable Long id, Model model){
        Optional<Link> link = linkRepository.findById(id);
        if(link.isPresent()){
            model.addAttribute("link", link.get());
            return "link/view";
        }else{
            return "redirect:/";
        }

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
