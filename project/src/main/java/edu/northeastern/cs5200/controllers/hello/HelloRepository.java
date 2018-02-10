/**
 * 
 */
package edu.northeastern.cs5200.controllers.hello;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Abhishek Karan
 *
 */
@Repository
public interface HelloRepository extends JpaRepository<HelloObject, Integer> {

}
