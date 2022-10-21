
// AUTOMOVIL contoller

package com.auticos.auticos.controller;

import com.auticos.auticos.model.Automovil;
import com.auticos.auticos.service.IService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class AutomovilController {
    
    @Autowired
    private IService<Automovil> iAutomovilService;
    
    // LISTAR AUTOS
    @GetMapping ("/autos/ver")
    public List<Automovil> ver() throws Exception{
        return iAutomovilService.ver();
    }    
    
    // GUARDAR AUTO
    @PostMapping ("/autos/guardar")
    public void guardarEducacion(@RequestBody Automovil automovil) throws Exception{
        iAutomovilService.guardar(automovil);
    }
    
    // BORRAR AUTO
    @DeleteMapping ("/autos/borrar/{id}")
    public void borrarAutomovil(@PathVariable Long id) throws Exception{
        iAutomovilService.borrar(id);
    }
        
    // EDITAR AUTO
    @PutMapping ("/autos/editar/{id}")
    public ResponseEntity<Automovil> actualizarAuto 
                            (@PathVariable Long id,
                             @RequestBody Automovil nuevoAuto) throws Exception {
        
        Automovil automovil = this.iAutomovilService.buscar(id);
        
        automovil.setModelo(nuevoAuto.getModelo());
        automovil.setMarca(nuevoAuto.getMarca());
        automovil.setColor(nuevoAuto.getColor());
        automovil.setMotor(nuevoAuto.getMotor());
        automovil.setPatente(nuevoAuto.getPatente());
        automovil.setCantPuertas(nuevoAuto.getCantPuertas());
        
        //Agrego imagen
        automovil.setImagen(nuevoAuto.getImagen());
        
        //Nueva AUTO       
        iAutomovilService.guardar(automovil);
              
        return ResponseEntity.ok(automovil);
    }
    
}




    
    
    