package com.portfolio.lorenab.Security.Service;

import com.portfolio.lorenab.Security.Entity.Rol;
import com.portfolio.lorenab.Security.Enums.RolNombre;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.lorenab.Security.Repository.IRolRepository;

/**
 *
 * @author Lorena Borrego
 */

@Service
@Transactional
public class RolService {
    @Autowired
   IRolRepository irolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save (Rol rol) {
        irolRepository.save(rol);
    }
}  