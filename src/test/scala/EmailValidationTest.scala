import org.scalatest.funsuite.AnyFunSuite
import emailValidation.EmailValidation
class EmailValidationTest extends AnyFunSuite {
  var emailobj = new EmailValidation

  test("Without name of Recipient.."){
    assert(!emailobj.emailIsValid("@gmail.com"))
  }

  /*test("Recipient Name..(lower case"){
    assert(emailobj.emailIsValid(emailId = "rashmi.garg@gmail.com"))
  }

  test("Recipient Name..(Upper Case"){
    assert(emailobj.emailIsValid(emailId = "RASHMI.GARG@gmail.com"))
  }*/

  test("Without @ in the email.."){
    assert(!emailobj.emailIsValid("rashmi.garg.gmail.com"))
  }

  /*test("With @ in the email.."){
    assert(emailobj.emailIsValid("rashmi.garg@gmail.com"))
  }*/


  test("Without domain name.."){
    assert(!emailobj.emailIsValid("rashmi.garg@"))
  }

  test("Other domain name than .com|.net|.org .. "){
    assert(!emailobj.emailIsValid("rashmi.garg@yahoo.in"))
  }

  test("Correct one uppercase.."){
    assert(emailobj.emailIsValid("RASHMI.GARG@YAHOO.COM"))
  }

  test("Correct one lowercase"){
    assert(emailobj.emailIsValid("rashmi.garg@yahoo.com"))
  }

}
