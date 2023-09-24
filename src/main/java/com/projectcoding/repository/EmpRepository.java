package com.projectcoding.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectcoding.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer>  {

}
