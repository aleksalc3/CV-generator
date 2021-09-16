package fon.silab.cv.generator.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fon.silab.cv.generator.entity.User;



@Repository
public interface UserJpaRepository extends JpaRepository<User, String>{
	Optional<User> findByUsername(String username);
}
