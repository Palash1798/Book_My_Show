package com.palash.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.repository.cdi.Eager;

import java.awt.print.Book;
import java.util.List;

@Getter
@Setter

@Entity
public class User extends BaseModel{
    private  String name;
    private String email;
    private String phoneNumber;

    @OneToMany
    private List<Booking> bookings;

    private  String password;
}
