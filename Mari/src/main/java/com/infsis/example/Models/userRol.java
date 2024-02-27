package com.infsis.example.Models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.List;

public class userRol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private boolean active;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "userRol")
    private List<User> rol;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @CreatedDate
    private LocalDateTime createdAt;
}
