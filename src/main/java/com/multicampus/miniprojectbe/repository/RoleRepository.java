package com.multicampus.miniprojectbe.repository;


import com.multicampus.miniprojectbe.model.ERole;
import com.multicampus.miniprojectbe.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
