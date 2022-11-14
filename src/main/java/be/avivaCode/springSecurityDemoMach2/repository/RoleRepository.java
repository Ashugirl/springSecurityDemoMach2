package be.avivaCode.springSecurityDemoMach2.repository;

import be.avivaCode.springSecurityDemoMach2.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
