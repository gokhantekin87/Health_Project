@US018All
Feature: Admin physician olusturabilir,guncelleyebilir,goruntuleyebilir,silebilir

 Background:
    Given admin medunna url'e gider
    When "admin" Sign in sekmesine gecis yapar ve tıklar
    Then "admin" giris yapar
    And "admin" items&titles sekmesine gecis yapar ve tıklar
    And "admin" physicians sekmesine gecis yapar ve tıklar


  @US018All @TC01
    Scenario: TC01 Admin SSN ile kayitli bir physician arar
    And "admin" "Create a new Physician" butonuna tıklar
    And "admin" "use search" kutusuna tıklar
    And "admin" kayitli bir "149-79-1478" icin arama yapar
    And sayfayi kapatir

  @US018All @TC02
    Scenario:TC02 kisilerin "firstname,lastname vs bilgileri doldurulabilmeli
    And "admin" "Create a new Physician" butonuna tıklar
    And "admin" "use search" kutusuna tıklar
    And "admin" kayitli bir "Physician SSN" icin arama yapar
    When admin physician'ın "firstname,lastname vs" bilgilerini doldurur
    When admin tarih "01.01.2000" bilgisini girer
    When admin telefon "222-222-2222" bilgisini girer
    When admin adress "mumdan gemi" bilgisini girer
    #When admin cinsiyet icin "female" secer
    When admin speciality icin "Pediatrics" secer
    #When admin blood group icin "A+" secer
    When admin description icin "sehname" bilgisini girer
    And admin fotograf yukler
    And admin "400" ucret bilgisi girer
    And admin "France" country bilgisi girer
   Then admin save butonuna tıklar ve dogrulama mesajinin gorundugunu test eder
    And sayfayi kapatir

  @US018All @TC03
  Scenario: TC03 Admin tum doktorlarin bilgilerini gorebilmelidir
    Then admin doktorlarin bilgilerini gorebilir
    And sayfayi kapatir

  @US018All @TC04
  Scenario: TC04 Admin doktorlarin bilgilerini duzenleyebilir
    And admin 21 sayfaya gecer
    And admin firstname "leylamecnun2" olan doktorun idisini alir
    #And admin firstname "leylamecnun2" olan doktorun edit butona tiklar
    When admin tarih "01.01.2003" bilgisini girer
    When admin telefon "222-222-2223" bilgisini girer
    When admin adress "mumdan gemi3" bilgisini girer
    When admin cinsiyet icin "FEMALE" secer
    When admin speciality icin "Pathology" secer
    #When admin blood group icin "A+" secer
    When admin description icin "sehname3" bilgisini girer
    And admin fotograf yukler
    And admin "300" ucret bilgisi girer
    And admin "Germany" country bilgisi girer
    Then admin save butonuna tıklar ve dogrulama mesajinin gorundugunu test eder
    And sayfayi kapatir

    # BUG--> Doktor silinemiyor-->
  @US018All @TC05
  Scenario: TC05 Admin mevcut doktorlari silebilir
    Then admin mevcut doktorun delete butonuna tiklar
    And admin doktorun silindigini dogrular
    And sayfayi kapatir

     # BUG--> Doktor secilemiyor-->
  @US018All @TC06
  Scenario: TC06 Admin mevcut doktoru secebilir
    Given admin doktoru secebilir
    Then admin physician secilebilir oldugunu dogrular
    And sayfayi kapatir

