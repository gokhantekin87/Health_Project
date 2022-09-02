@E2E
Feature: US028 Ulke ve sehir bilgilerini DB ile okuma
  Scenario: US028 TC001 Kullanici ulke ve sehir datalarini okur
    Given kullanici database e baglanir
    And kullanici bilgileri "*"  "country" tabledan alir
    And kullanici "country"  "name"  "Turkiye" goruntuler
    And kullanici bilgileri "*"  "c_state" table dan alir
    And kullanici sehir "c_state"  "name"  "Kutahya"  goruntuler
    Then kullanici database baglantisini kapatir
