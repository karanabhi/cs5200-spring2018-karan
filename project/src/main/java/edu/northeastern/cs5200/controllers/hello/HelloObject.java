/**
 * 
 */
package edu.northeastern.cs5200.controllers.hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Abhishek Karan
 *
 */
@Entity(name = "hello")
public class HelloObject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public HelloObject() {
	}

	public HelloObject(String message) {
		this.message = message;
	}

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
