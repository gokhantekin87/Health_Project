@E2E
Feature: US016 ROOM Admin Room sayfasini dogrular
  Background:
    Given kullanici medunna anasayfasinda
    And kullanici account menu tiklar
    And kullanici sign in tiklar
    And kullanici username olarak "us16Username" girer
    And kullanici password olarak "us16Password" girer
    And sign in butonuna tiklar
    And admin Rooms sayfasina gecis yapar

  #her sefer problemsiz calisir
  Scenario: US016 TC000 admin room sayfasini dogrular
    Then url nin "room" icerdigini dogrular
    Then basligin "Rooms" icerdigini dogrular
    And tablo da "ID" "Room Number" "Room Type" "Status" "Price" "Description" "Created Date" basliklarinin gorunur oldugunu dogrular
    And Create a new Room butonunun erisilebilir ve gorunur oldugunu dogrular
    And sayfayi kapatir

#Sayfa numaralari oda eklendikce degisecek
   Scenario: US016 TC001 Admin ayni tur odalari gorebilir
     And admin Room Type gore odalari siralar
     Then admin TWIN odalarin siralandigini dogrular
     And admin SUITE odalarin sirlandigini dogrular
     And kullanici username olarak "us16Username" girer
     And kullanici password olarak "us16Password" girer
     And sign in butonuna tiklar
     And admin SUITE odalarin sirlandigini dogrula
     And admin PREMIUM_DELUXE odalarin siralndigini dogrular
     And admin DELUXE odalarin siralandigini dogrular
     And admin DAYCARE odalarin siralandigini dogrular
     And sayfayi kapatir


#kendisi oda olusuturp siliyor o yuzden her sefer calisir
  Scenario: US016 TC004 Admin odayi silebilmeli
    And olusturdugu odaya gecis yapar
    And Delete butonuna tiklar
    And dogrulama sayfasinda Delete butonuna tiklar
    Then "A Room is deleted" yazisinin oldugunu dogrular
    Then silinen odanin id sinin olmadigini dogrular
    And sayfayi kapatir

  Scenario: US016 TC005 Room Number admin room number duzenler
    And Create a new Room butonuna tiklar
    Then Room Number basliginin gorunur oldugunu dogrular
    Then Room Number texbox in gorunur ve active oldugunu dogrular
    And Room Number bos birakildiginda kabul etmedigini dogrular
    And Room Number "aye" karakter girildiginde kabul etmedigini dogrular
    And Room Number "5940" sayi girildiginde kabul ettigini dogrular
    And sayfayi kapatir

  Scenario: US016 TC006 Room Type admin room type duzenler
    And Create a new Room butonuna tiklar
    Then Room Type basliginin gorunur oldugunu dogrular
    Then Room Type dropdown active oldugunu dogrular
    And Room Type "TWIN" secer
    Then "TWIN" secili oldugunu dogrular
    And Room Type "DELUXE" secer
    Then "DELUXE" secili oldugunu dogrular
    And Room Type "PREMIUM_DELUXE" secer
    Then "PREMIUM_DELUXE" secili oldugunu dogrular
    And Room Type "SUITE" secer
    Then "SUITE" secili oldugunu dogrular
    And Room Type "DAYCARE" secer
    Then "DAYCARE" secili oldugunu dogrular
    And sayfayi kapatir

  Scenario: US016 TC007 Status admin status ayarlar
    And Create a new Room butonuna tiklar
    Then Status basliginin gorunur oldugunu dogrular
    Then status checkbox gorunur ve active oldugunu dogrular
    And status checkbox click yapar
    Then status checkox secili oldugunu dogrular
    And status checkbox click yapar
    Then status checkboxsecili olmadigini dogrular
    And sayfayi kapatir

  Scenario: US016 TC008 Price admin price duzenler
    And Create a new Room butonuna tiklar
    Then Price basliginin gorunur oldugunu dogrular
    Then Price texbox in gorunur ve active oldugunu dogrular
    And Price bos birakildiginda kabul etmedigini dogrular
    And Price "aye" karakter girildiginde kabul etmedigini dogrular
    And Price "59" sayi girildiginde kabul ettigini dogrular
    And sayfayi kapatir

  Scenario: US016 TC009 Description admin description duzenler
    And Create a new Room butonuna tiklar
    Then Description basliginin gorunur oldugunu dogrular
    Then Description textbox gorunur ve active oldugunu dogrular
    And description bos birakildiginda kabul ettigini dogrular
    And description herhangi bir metin "team59 otomasyon testi" yazildiginda kabul ettigini dogrular
    And sayfayi kapatir




