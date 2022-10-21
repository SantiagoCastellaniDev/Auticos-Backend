
// Interface de SERVICIO

package com.auticos.auticos.service;

import java.util.List;

public interface IService <X> {
    
    // VER LISTA AUTOS (findAll)
    public List<X> ver() throws Exception;
    
    // BUSCAR POR ID  (findById)  
    public X buscar(Long id) throws Exception;
    
    // GUARDAR AUTO  (save)
    public void guardar(X entidad) throws Exception;
    
    // BORRAR AUTO  (deleteById)
    public void borrar(Long id) throws Exception;
    
    // ACTUALIZAR AUTO  (updateById)
    public void actualizar(Long id, X entidad) throws Exception; 
    
}

