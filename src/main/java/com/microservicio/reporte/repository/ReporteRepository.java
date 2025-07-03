package com.microservicio.reporte.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservicio.reporte.model.entity.ReporteEntity;

@Repository
public interface ReporteRepository extends JpaRepository<ReporteEntity, Integer>{
    
    ReporteEntity findByDescripcion(String descripcion);
    Boolean existsByDescripcion(String descripcion);
    Boolean existsById(int id);
    void deleteByDescripcion(String descripcion);
    ReporteEntity findByIdReporte(int id);
}