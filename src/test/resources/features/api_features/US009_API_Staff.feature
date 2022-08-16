@EndtoEndTest
Feature: Kullanici tum hasta bilgilerini dogrular

  Scenario: kullanici get request ile hasta bilgilerini alir
    Given kullanici hasta bilgileri icin get request yapar
    And kullanici gelen hasta datayi deserialize eder


 #   Scenario: kullanici post request ile yeni hasta olusturur
 #     Given kullanici hasta icin post request yapar
 #     Then kullanici post request validation yapar

Scenario Outline: kullanici id hasta bilgilerini get request ile alir ve dogrular
    Given kullanici id ile hasta bilgileri icin get request yapar
    Then kullanici hasta bilgilerini dogrular "<firstname>" "<lastname>" "<email>" "<gender>" "<phone>" "<adress>"
  Examples:
    | firstname | lastname | email            |gender |phone        |adress      |
    |Hasta      |Team59    |dokunma@gmail.com |FEMALE |123-123-1234 |team59 hause|



