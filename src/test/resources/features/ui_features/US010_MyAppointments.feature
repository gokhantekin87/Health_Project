@EndtoEndTest @US010_UI

Feature: US010 randevular


  Scenario:TC001 Kullanıcı, randevu listesini ve zaman dilimlerini "My Appointments" sekmesinden görebilmelidir.
    Given kullanici medunna anasayfasinda
    And kullanici "doktorusarname" ve "doktorpassword" girerek giris yapar
    And kullanici mypage butonuna tiklar
    And kullanici My Appointments butonuna tiklar
    Given kullanici "Appointments"'in gorunurr oldugunu dogrular
    Then kullanici Randevu listesinde randevularin gorundugunu dogrular
    And sayfayi kapatir

    Scenario: Kullanıcı "patient id, start date, end date, status" bilgilerini görebilmeli

      Given kullanici medunna anasayfasinda
      And kullanici "doktorusarname" ve "doktorpassword" girerek giris yapar
      And kullanici mypage butonuna tiklar
      And kullanici My Appointments butonuna tiklar
      Given kullanici "Appointments"'in gorunurr oldugunu dogrular
      Then Kullanici patient id, start date, end date, status bilgilerini gorebilmeli
      And sayfayi kapatir


