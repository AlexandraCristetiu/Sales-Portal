package com.example.demoSpring.data.repositories;

import com.example.demoSpring.data.DAO.Company;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository  extends CrudRepository <Company, Integer> {
}

