package com.kodilla.hibernate.manytomany.service;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dto.CompanyDto;
import com.kodilla.hibernate.manytomany.exception.SearchNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SearchCompany {

    @Autowired
    CompanyDao companyDao;

    public List<CompanyDto> findCompanyWithLetters(String letters) throws SearchNotFound {
        List<Company> searchedCompanies = companyDao.retrieveCompanyByItsFragmOfName(letters);
        return searchedCompanies.stream()
                .map(company -> new CompanyDto(company.getId(), company.getName()))
                .collect(Collectors.toList());
    }
}
