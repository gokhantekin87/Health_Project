@EndtoEnd
Feature: Kullanici Database de hasta bilgilerinin oldugunu dogrular
  Scenario Outline: Kullanici Hasta bilgilerini dogrular
    Given kullanici database baglanir
    And kullanici hasta bilgilerini "*" "patient" tablosundan alir
    Then kullanici database de "<first_name>" firstname oldugunu dogrular
    Then kullanici database de "<last_name>" lastname  oldugunu dogrular
    Then kullanici database de "<email>" email oldugunu dogrular
    Then kullanici database de "<phone>" phone oldugunu dogrular
    And database baglantisini kapatir
    Examples:
    | first_name     | last_name      | email                | phone       |
    |Hasta           |Me              |hastame@gmail.com     |012-008-1957 |

  Scenario: kullanici id li hasta bilgilerini dogrular
    Given kullanici database baglanir
    And kullanici 162899 "ID" li hastanin bilgilerini "*" "patient" tablosundan alir
    Then kullanici hasta "first_name" i "Patient" oldugunu dogrular
    And database baglantisini kapatir


