package com.example.StaffManagement.Repository;

import jakarta.persistence.*;

@Entity
@Table(name = "staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private StaffRole role; // CHEF, WAITER, MANAGER

    private String phone;

    private String email;

    @Enumerated(EnumType.STRING)
    private Shift shift; // MORNING, EVENING, NIGHT

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public StaffRole getRole() { return role; }
    public void setRole(StaffRole role) { this.role = role; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Shift getShift() { return shift; }
    public void setShift(Shift shift) { this.shift = shift; }
}
