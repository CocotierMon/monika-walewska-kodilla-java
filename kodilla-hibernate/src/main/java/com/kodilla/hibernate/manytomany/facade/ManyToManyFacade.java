package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dto.CompanyDto;
import com.kodilla.hibernate.manytomany.dto.EmployeeDto;
import com.kodilla.hibernate.manytomany.exception.SearchNotFound;
import com.kodilla.hibernate.manytomany.service.SearchCompany;
import com.kodilla.hibernate.manytomany.service.SearchEmployee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManyToManyFacade {

    @Autowired
    private SearchCompany searchCompany;

    @Autowired
    private SearchEmployee searchEmployee;

    private static final Logger LOGGER = LoggerFactory.getLogger(ManyToManyFacade.class);

    public List<CompanyDto> retrieveCompany(String letters) throws SearchNotFound {
        List<CompanyDto> companies = searchCompany.findCompanyWithLetters(letters);
        if (!companies.isEmpty()) {
            for (CompanyDto companyDto : companies) {
                LOGGER.info("Firmy, które zawierają w nazwie podan znaki to: " + companyDto.getName());
            }
            return companies;
        } else {
            LOGGER.error("Wystąpił błąd podczas szukania podanych znaków");
            throw new SearchNotFound("Nie znaleziono firmy");
        }
    }

    public List<EmployeeDto> retrieveEmployee(String letters) throws SearchNotFound{
        List<EmployeeDto> employees = searchEmployee.findEmployeeWithLetters(letters);
        if (!employees.isEmpty()) {
            for (EmployeeDto employeeDto : employees) {
                LOGGER.info("Na podstwie podanych znaków znaleziono pracowników: " + employeeDto.getFirstname() +" " + employeeDto.getLastname());
            }
            return employees;
        } else {
            LOGGER.error("Błąd w wyszukiwaniu pracownika");
            throw new SearchNotFound("Nie znaleziono pracownika");
        }
    }
}
