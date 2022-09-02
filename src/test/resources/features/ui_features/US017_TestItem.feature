@E2E
Feature: US017 Test Item admin test item sayfasini dogrular

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


  Scenario: US017 TC004 Admin Name duzenleyebilir
    And Create a new test item butonuna tiklar
    Then Name basliginin gorunur oldugunu dogrular
    Then Name texbox in gorunur ve active oldugunu dogrular
    And Name bos birakildiginda kabul etmedigini dogrular
    And Name "Test Item no:1" unique name girildiginde kabul ettigini dogrular
    And Name "Urea" unique olamyan name girildiginde kabul etmedigini dogrular
    And sayfayi kapatir

  Scenario: US017 TC005 Admin Price duzenleyebilir
    And Create a new test item butonuna tiklar
    Then price basliginin gorunur oldugunu dogrular
    Then price texbox in gorunur ve active oldugunu dogrular
    And price bos birakildiginda kabul etmedigini dogrular
    And price "aye" karakter girildiginde kabul etmedigini dogrular
    And price "59" sayi girildiginde kabul ettigini dogrular
    And sayfayi kapatir