Feature: US017 Test Item

  Background:
    Given kullanici medunna anasayfasinda
    And kullanici account menu tiklar
    And kullanici sign in tiklar
    And kullanici username olarak "us16Username" girer
    And kullanici password olarak "us16Password" girer
    And sign in butonuna tiklar
    And admin Test Items sayfasina gecis yapar

#her sefer calisir
  Scenario: US016 TC000 admin test item sayfasini dogrular
    Then url nin "test-item" icerdigini dogrular
    Then basligin "Test Items" icerdigini dogrular
    And tablo da "ID" "Name" "Description" "Price" "Default Min. Value" "Default Max. Value" "Created Date" basliklarinin gorunur oldugunu dogrular
    And Create a new Room butonunun erisilebilir ve gorunur oldugunu dogrular
    And sayfayi kapatir

    #calisiyor
  Scenario: US017 TC003 admin test item silebilir
    And olusturdugu test ogesine gecis yapar
    And Delete butona tiklar
    And dogrulama sayfasinda Delete butona tiklar
    Then "A Test Item is deleted" yazisi oldugunu dogrular
    Then silinen test ogesinin id sinin olmadigini dogrular
    And sayfayi kapatir


  Scenario: US017 TC004
