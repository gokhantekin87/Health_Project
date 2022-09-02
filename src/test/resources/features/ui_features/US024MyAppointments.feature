@E2E



Feature:US24  My Appointments (Randevular) (Patient)

  Scenario:US24 TC01 Hasta hesabina girdiginde test sonuclarini gorebilmelidir. Test sonuclarinda " id, name for test,
  default max ve min value, test date and description" bolumleri gorulmelidir.
    Given kullanici medunna anasayfasinda
    And kullanici account menu tiklar
    And kullanici sign in tiklar
    And kullanici username olarak "hastausarname" girer
    And kullanici password olarak "hastapassword" girer
    And sign in butonuna tiklar
    And kullanici mypagepatient butonuna tiklar
    And kullanici My Appointments butonuna tiklar
    Then Doktor  baslangic tarihi girer
    Then Doktor bitis tarihi girer
    Then Kullanici sayfadaki ShowTests kismina tiklar
    And hasta test sonuclarinin goruldugunu dogrular
    And id, name for test,default max ve min value, test date and description bolumleri gorulur.
    And sayfayi kapatir

    Scenario:US24 TC02 Hasta faturasunuda gorebilmelidir.
      Given kullanici medunna anasayfasinda
      And kullanici account menu tiklar
      And kullanici sign in tiklar
      And kullanici username olarak "hastausarname" girer
      And kullanici password olarak "hastapassword" girer
      And sign in butonuna tiklar
      And kullanici mypagepatient butonuna tiklar
      And kullanici My Appointments butonuna tiklar
      Then Doktor  baslangic tarihi girer
      Then Doktor bitis tarihi girer
      Then kullanici showinvoice butonuna tiklar
      And fatura bilgilerinin oldugunu test eder
      And sayfayi kapatir

