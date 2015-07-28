package com.richardhell.petclinic.controller.general.especie;

import com.richardhell.petclinic.model.Especie;
import java.util.List;

public interface EspecieService {

    List<Especie> allEspecie();
    Especie findEspecie(Long id);
    void save(Especie especie);
    void delete(Especie especie);
}
