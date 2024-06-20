package com.ApiUni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApiUni.model.Premio;

public interface IPremioRepository extends JpaRepository<Premio, Long> {

	List<Premio> findByFechaYear(int year);
}
