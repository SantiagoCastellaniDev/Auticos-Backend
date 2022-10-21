
package com.auticos.auticos.service;

import com.auticos.auticos.model.Automovil;
import com.auticos.auticos.repository.AutomovilRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AutomovilService implements IService<Automovil>{
    
    @Autowired
    private AutomovilRepository autoRepo;

    // LISTAR AUTOS
    @Override
    public List<Automovil> ver() throws Exception {
        List<Automovil> listaEducacion = autoRepo.findAll();
        return listaEducacion;    
    }
    
    // BUSCAR POR ID
    @Override
    public Automovil buscar(Long id) throws Exception {
        Automovil automovil = autoRepo.findById(id).orElse(null);
        return automovil;    
    }

    // GUARDAR AUTO
    @Override
    public void guardar(Automovil automovil) throws Exception {
        autoRepo.save(automovil);    
    }
    
    // BORRAR POR ID
    @Override
    public void borrar(Long id) throws Exception {
        autoRepo.deleteById(id);    
    }

    // ACTUALIZAR AUTO
    @Override
    public void actualizar(Long id, Automovil automovil) throws Exception {
        autoRepo.save(automovil);    
    }   
    
    
}

    