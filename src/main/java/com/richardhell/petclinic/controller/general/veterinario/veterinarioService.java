
package com.richardhell.petclinic.controller.general.veterinario;

import com.richardhell.petclinic.model.Persona;
import com.richardhell.petclinic.model.Veterinario;
import java.util.List;


public interface veterinarioService {
    

    List<Veterinario> allVeterinario();
    Veterinario findVeterinario(Long id);
    void save (Veterinario veterinario);
    void delete(Veterinario veterinario);
    List<Persona> allPersona(); 
    
}


    

