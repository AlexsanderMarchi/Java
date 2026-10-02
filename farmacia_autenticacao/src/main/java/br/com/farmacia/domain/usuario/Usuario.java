package br.com.farmacia.domain.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

//@Entity
//@Table(name="usuario")
public class Usuario {

    private Long id;
    private String email;
    private  String senha;
}
