package be.avivaCode.springSecurityDemoMach2.repository;

import be.avivaCode.springSecurityDemoMach2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
