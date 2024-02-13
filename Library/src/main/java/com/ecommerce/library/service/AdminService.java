package com.ecommerce.library.service;

import com.ecommerce.library.dto.AdminDto;
import com.ecommerce.library.model.Admin;
import com.ecommerce.library.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface AdminService {


    Admin findByUsername(String username);

    Admin save(AdminDto adminDto);
}
