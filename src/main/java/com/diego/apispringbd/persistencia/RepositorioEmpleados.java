package com.diego.apispringbd.persistencia;

import com.diego.apispringbd.dominio.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioEmpleados extends JpaRepository<Empleado, Long> {

}
