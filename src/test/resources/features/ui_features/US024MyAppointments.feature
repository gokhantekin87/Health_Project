



Feature: My Appointments (Randevular) (Patient)

  Scenario: Hasta hesabina girdiginde test sonuclarini gorebilmelidir. Test sonuclarinda " id, name for test,
  default max ve min value, test date and description" bolumleri gorulmelidir.

    Given kullanici medunna anasayfasinda
    Then kullanici "hastausarname" ve "hastapassword" girerek giris yapar
    And kullanici mypagepatient butonuna tiklar
    And kullanici My Appointments butonuna tiklar
    Then Kullanici sayfadaki ShowTests kismina tiklar
    And hasta test sonuclarinin goruldugunu dogrular
    And id, name for test,default max ve min value, test date and description bolumleri gorulur.
    And sayfayi kapatir

    Scenario: Hasta faturasunuda görebilmelidir. (Show Invoice)
      Given kullanici medunna anasayfasinda
      Then kullanici "hastausarname" ve "hastapassword" girerek giris yapar
      And kullanici mypagepatient butonuna tiklar
      And kullanici My Appointments butonuna tiklar
      Then kullanici showinvoice butonuna tiklar
      And fatura bilgilerinin oldugunu test eder
      And sayfayi kapatir

