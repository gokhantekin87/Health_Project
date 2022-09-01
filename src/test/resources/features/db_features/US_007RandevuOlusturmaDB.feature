
@DBappointmentTest @Db
Feature: US007 DB Hastalar randevu tarihi oluşturabilmelidir.

  @Db @gokhan @US007DB
  Scenario Outline: US007 TC_006 DB Olusan randevu Id ile dogrulama

    Given  DB ile connection olusturulur
    When Query olusturularak randevular databaseden alinir
    Then Randevu "<id>" databasede mevcut mu kontrol edilir




Examples: TestData
    |id     |
    |184275 |

