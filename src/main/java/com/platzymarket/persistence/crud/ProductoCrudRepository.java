package com.platzymarket.persistence.crud;

import com.platzymarket.persistence.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
}
