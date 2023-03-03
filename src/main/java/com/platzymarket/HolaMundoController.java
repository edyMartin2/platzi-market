package com.platzymarket;

import com.platzymarket.persistence.Producto;
import com.platzymarket.persistence.controllers.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/saludar")

public class HolaMundoController {

    @Autowired
    private ProductoRepository productoRepository;
    @GetMapping("")
    public String HelloWord(){
        return "Hola mundo";
    }

    @GetMapping("/test")
    public List<Producto> prods (){
        //ProductoRepository p = new ProductoRepository();
        return productoRepository.gets();
    }
}
