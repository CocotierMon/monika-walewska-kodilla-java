package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.dto.CompanyDto;
import com.kodilla.hibernate.manytomany.dto.EmployeeDto;
import com.kodilla.hibernate.manytomany.exception.SearchNotFound;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyToManyFacadeTestSuite {

    @Autowired
    ManyToManyFacade manyToManyFacade;

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void searchForCompany() throws SearchNotFound {
        //Given
        Company company = new Company("Społem");
        Company company1 = new Company("Empik");
        Company company2 = new Company("Rossmann");
        Company company3 = new Company("Pikolo");

        String letters = "oss";
        String letters1 = "pik";
        String letters2 = "ołe";

        //When
        companyDao.save(company);
        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);
        List<CompanyDto> searchCompanies = manyToManyFacade.retrieveCompany(letters);
        List<CompanyDto> searchCompanies1 = manyToManyFacade.retrieveCompany(letters1);
        List<CompanyDto> searchCompanies2 = manyToManyFacade.retrieveCompany(letters2);

        //Then
        Assert.assertNotNull(searchCompanies);
        Assert.assertNotNull(searchCompanies1);
        Assert.assertEquals(1, searchCompanies2.size());
        System.out.println(searchCompanies);
        System.out.println(searchCompanies1);
        System.out.println(searchCompanies2);

        //CleanUp
        companyDao.deleteAll();
    }

    @Test
    public void searchForEmployee() throws SearchNotFound {
        //Given
        Employee employee = new Employee("Anna", "Kowalska");
        Employee employee1 = new Employee("Robert", "Nowak");

        String letters = "wal";
        String letters1 = "owa";

        //When
        employeeDao.save(employee);
        employeeDao.save(employee1);
        List<EmployeeDto> searchEmployees = manyToManyFacade.retrieveEmployee(letters);
        List<EmployeeDto> searchEmployees1 = manyToManyFacade.retrieveEmployee(letters1);

        //Then
        Assert.assertEquals(1, searchEmployees.size());
        Assert.assertEquals(2, searchEmployees1.size());
        System.out.println(searchEmployees);
        System.out.println(searchEmployees1);

        //CleanUp
        employeeDao.delete(employee);
        employeeDao.delete(employee1);
    }
}