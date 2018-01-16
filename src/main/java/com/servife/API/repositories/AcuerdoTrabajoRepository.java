
package com.servife.API.repositories;

import com.servife.API.model.AcuerdoTrabajo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AcuerdoTrabajoRepository extends CrudRepository<AcuerdoTrabajo, Long> {
    List<AcuerdoTrabajo> findByCliente_IdUsuario(Long id);
}
