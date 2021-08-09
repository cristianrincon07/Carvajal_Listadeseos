package Carvajal.Listadeseos.controller;

import Carvajal.Listadeseos.model.cliente;
import Carvajal.Listadeseos.model.producto;
import Carvajal.Listadeseos.service.clienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes/")
public class clienteRest {

    @Autowired
    private clienteService clienteService;

    @GetMapping
    private ResponseEntity<List<cliente>> getAllclients()
    {
        return ResponseEntity.ok(clienteService.findAll());
    }

}
