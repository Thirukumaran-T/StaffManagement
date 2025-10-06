package com.example.StaffManagement.Controller;

import com.example.StaffManagement.Repository.Staff;
import com.example.StaffManagement.Service.StaffService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/staff")
public class StaffController {

    private final StaffService service;

    public StaffController(StaffService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public Staff addStaff(@RequestBody Staff staff) {
        return service.addStaff(staff);
    }

    @GetMapping("/list")
    public List<Staff> getAllStaff() {
        return service.getAllStaff();
    }

    @GetMapping("/{id}")
    public Optional<Staff> getStaff(@PathVariable Long id) {
        return service.getStaff(id);
    }

    @PutMapping("/update/{id}")
    public Staff updateStaff(@PathVariable Long id, @RequestBody Staff staff) {
        return service.updateStaff(id, staff);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStaff(@PathVariable Long id) {
        service.deleteStaff(id);
        return "Staff deleted";
    }
}
