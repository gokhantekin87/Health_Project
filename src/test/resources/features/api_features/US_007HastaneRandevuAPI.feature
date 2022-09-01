Feature: US_007 API Hastalar randevu tarihi olusturabilmelidir




  @us007api @gokhan
  Scenario: US_007 TC_005 API Kayitsiz kullanici randevu olusturabilmelidir.

    Given Kayitsiz kullanici olarak set path params girilir
    When Kayitsiz kullanici olarak  firstName, LastName, SSN, Email,Phone, Appointment DateTime kayit bilgilerini girilir
    Then Respond alinarak kaydin server uzerinde yapildigi kontrol edilir
    And Expected Data ile Actual Data verileri ayni olmasi gerekmektedir

