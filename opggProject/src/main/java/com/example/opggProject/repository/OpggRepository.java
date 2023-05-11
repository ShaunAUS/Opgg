package com.example.opggProject.repository;

import com.example.opggProject.entity.YearRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpggRepository extends JpaRepository<YearRecord, Long> {


}
