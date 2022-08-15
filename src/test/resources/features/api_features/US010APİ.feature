
@US010_API

Feature: US10 Appoinments bilgileri test edilebilmeli

  Scenario: TC03 Appointments bilgileri API ile test edilebilmeli
    Given Physician URLe alma istegi gonderir
    And Physician Status Code 200 oldugunu dogrular
    Then Physician Appointmentsleri kontrol eder