/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.crud.model.Employee;

/**
 *
 * @author Fred
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
