/**
 * 
 */
package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.User;

/**
 * @author HP Cognizant
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findById(Integer id);
	Optional<User> findByEmail(String username);

}
