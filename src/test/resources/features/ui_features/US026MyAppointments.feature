

Feature: İletişim Mesajı (Contact messages)


  Scenario:Herhangi bir kullanici bilgi almak icin "Contact portal" üzerinden istek gonderebilmeli.
  Kullanici "Name, Email, Subject, Message" bolumlerine data girebilmeli ve mesajini gonderebilmeli.

    Given kullanici medunna anasayfasinda
    Then kullanici contact butonuna tiklar
    And kullanici "contactname","contactemail","contactsubject", "message" bolumlerini doldurur
    And kullanici Send butonuna tıklar
    And your massage has been received yazisinin ciktigini dogrular
    And sayfayi kapatir
