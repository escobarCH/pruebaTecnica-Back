package com.example.backpruebaTecnica.repositorios;

import com.example.backpruebaTecnica.formulario.CampoFormulario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFormularioRepositorio extends JpaRepository<CampoFormulario,Integer> {
}

