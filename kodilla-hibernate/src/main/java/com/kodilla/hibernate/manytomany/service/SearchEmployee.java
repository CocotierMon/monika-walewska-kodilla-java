package com.kodilla.hibernate.manytomany.service;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.dto.EmployeeDto;
import com.kodilla.hibernate.manytomany.exception.SearchNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SearchEmployee {

    @Autowired
    private EmployeeDao employeeDao;

    public List<EmployeeDto> findEmployeeWithLetters(String letters) throws SearchNotFound {
        List<Employee> searchEmployees = employeeDao.retrieveEmployeeByFragmOfName(letters);
        return searchEmployees.stream()
                .map(employee -> new EmployeeDto(employee.getId(), employee.getFirstname(), employee.getLastname()))
                .collect(Collectors.toList());
    }
}
