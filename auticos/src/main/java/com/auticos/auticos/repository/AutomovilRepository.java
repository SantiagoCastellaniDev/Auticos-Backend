
package com.auticos.auticos.repository;

import com.auticos.auticos.model.Automovil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomovilRepository extends JpaRepository <Automovil,Long>{    
}
