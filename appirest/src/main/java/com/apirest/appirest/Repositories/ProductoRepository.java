package com.apirest.appirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.appirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
