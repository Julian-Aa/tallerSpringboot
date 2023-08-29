package com.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eam.models.Categoria;

public interface IACategoriaRepository extends JpaRepository<Categoria, Long>{

}
