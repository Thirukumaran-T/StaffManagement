package com.example.StaffManagement.Service;

import com.example.StaffManagement.Repository.Staff;
import com.example.StaffManagement.Repository.StaffRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffService {

    private final StaffRepository repository;

    public StaffService(StaffRepository repository) {
        this.repository = repository;
    }

    public Staff addStaff(Staff staff) { return repository.save(staff); }

    public List<Staff> getAllStaff() { return repository.findAll(); }

    public Optional<Staff> getStaff(Long id) { return repository.findById(id); }

    public Staff updateStaff(Long id, Staff staff) {
        staff.setId(id);
        return repository.save(staff);
    }

    public void deleteStaff(Long id) { repository.deleteById(id); }
}
