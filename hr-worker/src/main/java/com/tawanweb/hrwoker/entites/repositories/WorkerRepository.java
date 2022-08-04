package com.tawanweb.hrwoker.entites.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tawanweb.hrwoker.entites.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
	
}
