package com.example.api.repository;

import com.example.api.entity.DataItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataItemRepository extends JpaRepository<DataItem, Long> {

    // crea un metodo che cerca per 'name'

    // crea un metodo che cerca per id > x e name che contiene y utilizzando @Query

    // crea un metodo che fa un update massivo
}