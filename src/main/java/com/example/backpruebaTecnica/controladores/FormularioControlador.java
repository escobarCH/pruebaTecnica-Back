package com.example.backpruebaTecnica.controladores;


import com.example.backpruebaTecnica.formulario.CampoFormulario;
import com.example.backpruebaTecnica.servicios.PruebaTecnicaAplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class FormularioControlador {


    @RestController
    @RequestMapping("/formulario")
    public class FormularioControlad {

        @Autowired
        PruebaTecnicaAplication servicio;

        @PostMapping
        public ResponseEntity<?> responderAlGuardar(@RequestBody CampoFormulario datosAlFront){

            try{
                return ResponseEntity
                        .status(HttpStatus.OK)
                        .body(servicio.guardarFormulario(datosAlFront));
            }catch(Exception error){
                return ResponseEntity
                        .status(HttpStatus.BAD_REQUEST)
                        .body(error.getMessage());
            }
        }

    }
}
