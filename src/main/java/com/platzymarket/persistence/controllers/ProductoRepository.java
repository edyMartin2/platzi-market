package com.platzymarket.persistence.controllers;

import com.platzymarket.persistence.Producto;
import com.platzymarket.persistence.crud.ProductoCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ProductoRepository{
    @Autowired
    private ProductoCrudRepository productoCrudRepository ;

    public List<Producto> gets (){
        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
        return productos;
    }
}
