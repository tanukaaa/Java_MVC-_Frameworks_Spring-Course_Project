package org.tushinov.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tushinov.auth.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
    Role findOneByName(String name);
}
