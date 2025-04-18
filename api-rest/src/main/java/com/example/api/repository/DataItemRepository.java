package com.example.api.repository;

import com.example.api.entity.DataItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataItemRepository extends JpaRepository<DataItem, Long> {
}