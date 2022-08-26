Feature: US017 Test Item
#her sefer calisir
  Scenario: US016 TC000 admin test item sayfasini dogrular
    Given kullanici medunna anasayfasinda
    Then kullanici "us16Username" ve "us16Password" girerek giris yapar
    And admin Test Items sayfasina gecis yapar
    Then url nin "test-item" icerdigini dogrular
    Then basligin "Test Items" icerdigini dogrular
    And tablo da "ID" "Name" "Description" "Price" "Default Min. Value" "Default Max. Value" "Created Date" basliklarinin gorunur oldugunu dogrular
    And Create a new Room butonunun erisilebilir ve gorunur oldugunu dogrular
    And sayfayi kapatir

  Scenario: US017 TC001 admin yeni test item olusturur ve dogrular
    Given kullanici medunna anasayfasinda
    Then kullanici "us16Username" ve "us16Password" girerek giris yapar
    And admin Test Items sayfasina gecis yapar
    And Create a new test item butonuna tiklar
    Then Create or edit test item sayfasinin acildigini dogrular
    And Name "test item no:1" girer
    And description "team59 otomasyon testi" girer
    And price "59" girer
    And Default Min. "0" girer
    And Default Max. "59" girer
    And created Date "01092022" girer
    And Save butonuna tiklar