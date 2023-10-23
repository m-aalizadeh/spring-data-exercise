package com.maryam.aalizadeh.jpadatasample.employee.model;

import jakarta.persistence.*;

@Entity
public class EmbeddedEmployee {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;

    @Embedded
    private EmbeddedAddress embeddedAddress;

    public EmbeddedEmployee() {
    }

    public EmbeddedEmployee(String firstName, String lastName, EmbeddedAddress address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.embeddedAddress = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public EmbeddedAddress getAddress() {
        return embeddedAddress;
    }

    public void setAddress(EmbeddedAddress address) {
        this.embeddedAddress = address;
    }

    @Override
    public String toString() {
        return "EmbeddedEmployee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + embeddedAddress +
                '}';
    }
}
