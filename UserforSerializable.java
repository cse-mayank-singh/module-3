/**
 * 
 */
package com.capgenimi.java_development.module_3_class_object;

/**
 * 
 */
import java.io.Serializable;

public class UserforSerializable implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String email;

    // No-arg constructor (important for frameworks)
    public UserforSerializable() {
    }

    // Parameterized constructor
    public UserforSerializable(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Optional but common
    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', email='" + email + "'}";
    }
}

