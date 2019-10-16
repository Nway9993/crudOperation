package com.springboot.thymeleaf.crudoperation.repository;

import com.springboot.thymeleaf.crudoperation.model.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository
        extends CrudRepository<EmployeeEntity, Long> {

}

