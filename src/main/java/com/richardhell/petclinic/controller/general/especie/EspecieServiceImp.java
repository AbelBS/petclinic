
package com.richardhell.petclinic.controller.general.especie;

import com.richardhell.petclinic.dao.EspecieDAO;
import com.richardhell.petclinic.model.Especie;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EspecieServiceImp implements EspecieService{
    @Autowired
    EspecieDAO especieDAO;
    
    @Override
    public List<Especie> allEspecie(){
        return especieDAO.all();
    }
    
    @Override
    public Especie findEspecie(Long id){
        return especieDAO.find(new Especie(id));
    }
    
    @Override
    public void save(Especie especie){
        if(especie.getId()==null){
            especieDAO.saveDAO(especie);
        }else{
            especieDAO.updateDAO(especie);
        }
    }
    
    @Override
    public void delete(Especie especie){
        especieDAO.deleteDAO(especie);
    }
}
