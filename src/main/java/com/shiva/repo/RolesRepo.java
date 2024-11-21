package com.shiva.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shiva.entities.Roles;

@Repository
public interface RolesRepo extends JpaRepository<Roles, Integer> {

}
