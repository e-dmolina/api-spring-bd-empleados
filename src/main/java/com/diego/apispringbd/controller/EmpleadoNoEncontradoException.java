package com.diego.apispringbd.controller;

public class EmpleadoNoEncontradoException extends RuntimeException {

    public EmpleadoNoEncontradoException(Long id)
    {
        super("Empledo con id "+id+" no existe.");
    }
}
