package com.radha.krishna.REpository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.radha.krishna.Entities.Cource;

@Repository
public interface CourceRepo extends JpaRepository<Cource,Integer>{

}
