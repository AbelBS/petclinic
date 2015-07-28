package com.richardhell.petclinic.controller.general.veterinario;

import com.richardhell.petclinic.model.Persona;
import com.richardhell.petclinic.model.Veterinario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("gen/veterinario")
public class VeterinarioController {
    @Autowired
    veterinarioService service;

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("veterinarios", service.allVeterinario());
        model.addAttribute("personas", service.allPersona());
        model.addAttribute("veterinario", new Veterinario());
        //model.addAttribute("persona", new Persona());
        return "general/veterinario";
    }
    
     @RequestMapping("update/{id}")
    public String update(@PathVariable("id") Long id, Model model) {
        model.addAttribute("veterinarios", service.allVeterinario());
        model.addAttribute("personas", service.allPersona());
        model.addAttribute("veterinario", service.findVeterinario(id));
        return "general/veterinario";
    }
    
     @RequestMapping("save")
    public String save(Veterinario veterinario) {
        service.save(veterinario);
        return "redirect:/gen/veterinario";
    }
    
    @RequestMapping("delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        service.delete(new Veterinario(id));
        return "redirect:/gen/veterinario";
    }
    
}




