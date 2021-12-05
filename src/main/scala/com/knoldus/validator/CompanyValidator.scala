package com.knoldus.validator

import com.knoldus.models.Company
import com.knoldus.db.CompanyReadDto
import emailValidation.EmailValidation

class CompanyValidator (companyName:CompanyReadDto, validateEmail: EmailValidator) {

  def companyIsValid(company: Company): Boolean = {
    if (companyName.getCompanyByName(company.name).isEmpty && validateEmail.emailIdIsValid(company.emailId)) {
      true
    }
    else
      false
  }}