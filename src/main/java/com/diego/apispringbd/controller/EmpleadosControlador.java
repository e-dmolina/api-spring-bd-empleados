package com.diego.apispringbd.controller;

import com.diego.apispringbd.dominio.Empleado;
import com.diego.apispringbd.persistencia.RepositorioEmpleados;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmpleadosControlador {

    private final RepositorioEmpleados repositorioEmpleados;

    public EmpleadosControlador(RepositorioEmpleados repositorioEmpleados) {
        this.repositorioEmpleados = repositorioEmpleados;
    }

    @GetMapping("/empleados")
    public List<Empleado> obtenerTodos(){
        return repositorioEmpleados.findAll();
    }

    @PostMapping("/empleados")
    public Empleado grabarEmpleado(@RequestBody Empleado empleado){
        return repositorioEmpleados.save(empleado); //guarda y me retorna el empleado
    }

    @GetMapping("/empleados/{id}")
    public Empleado obtenerEmpleado(@PathVariable Long id){
        return repositorioEmpleados.findById(id)
                .orElseThrow(() -> new EmpleadoNoEncontradoException(id));
    }

    @PutMapping("/empleados/{id}")
    public Empleado actualizarEmpleado(@RequestBody Empleado empleado, @PathVariable Long id){
        if (repositorioEmpleados.findById(id).isPresent()){
            repositorioEmpleados.findById(id).
        }else{
            repositorioEmpleados.save(empleado);
        }
    }

    @DeleteMapping("/empleados/{id}")
    public void borrarEmpleado(@PathVariable Long id){

        if (repositorioEmpleados.findById(id).isPresent()) {
            repositorioEmpleados.deleteById(id);
        }else throw new EmpleadoNoEncontradoException(id);
    }
}
