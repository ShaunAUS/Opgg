package com.example.opggProject.repository;

import com.example.opggProject.entity.AverageRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpggRepository extends JpaRepository<AverageRecord, Long> {


}
