package Carvajal.Listadeseos.controller;


import Carvajal.Listadeseos.model.producto;
import Carvajal.Listadeseos.service.productoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/productos/")
public class productoRest {

    @Autowired
    private productoService productoService;

    @GetMapping("/All")
    private ResponseEntity<List<producto>> getAllproducts()
    {
        return ResponseEntity.ok(productoService.findAll());
    }

    @GetMapping("/AllByClient")
    private ResponseEntity<List<producto>> getAllproductsbyClient(@RequestParam String id)
    {
        return ResponseEntity.ok(productoService.findALlByClient(id));
    }

    @PostMapping("/Save")
    private ResponseEntity<producto> saveproduct (@RequestBody producto producto)
    {

        try
        {
            producto productoguardado = productoService.save(producto);
            return ResponseEntity.created(new URI("/productos/" + productoguardado.getId())).body(productoguardado);

        }
        catch (Exception e)
        {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

}
