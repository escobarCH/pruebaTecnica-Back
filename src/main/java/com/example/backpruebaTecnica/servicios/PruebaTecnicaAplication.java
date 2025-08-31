package com.example.backpruebaTecnica.servicios;

import com.example.backpruebaTecnica.formulario.CampoFormulario;
import com.example.backpruebaTecnica.repositorios.IFormularioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

public class PruebaTecnicaAplication {
    @Autowired
    IFormularioRepositorio repositorio;


    public boolean guardarFormulario(CampoFormulario datosFormulario) throws Exception {
        try {
            repositorio.save(datosFormulario);
            return true;
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
