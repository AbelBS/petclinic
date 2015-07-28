
package com.richardhell.petclinic.controller.general.veterinario;

import com.richardhell.petclinic.dao.PersonaDAO;
import com.richardhell.petclinic.dao.VeterinarioDAO;
import com.richardhell.petclinic.model.Persona;
import com.richardhell.petclinic.model.Veterinario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VeterinarioServiceImp implements veterinarioService{
    @Autowired 
    VeterinarioDAO veterinarioDAO; 
    
    @Autowired
    PersonaDAO personaDAO;
    
    @Override
    public List<Veterinario> allVeterinario(){
        return veterinarioDAO.all();
     }
    
    
    @Override
    public Veterinario findVeterinario(Long id) {
        return veterinarioDAO.find(new Veterinario(id));
    }
  
    @Override
    public void save(Veterinario veterinario) {
        if(veterinario.getId()==null){
            veterinarioDAO.saveDAO(veterinario);
        }else{
            veterinarioDAO.updateDAO(veterinario);
        }
    }

  
    @Override
    public void delete(Veterinario veterinario) {
        veterinarioDAO.deleteDAO(veterinario);
    }

      
   
    @Override
     public List<Persona> allPersona() {
        return personaDAO.all();
    }
    
    
}
