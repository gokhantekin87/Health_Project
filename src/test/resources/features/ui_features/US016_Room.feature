Feature: US016 ROOM
  #her sefer problemsiz calisir
  Scenario: US016 TC000 admin room sayfasini dogrular
    Given kullanici medunna anasayfasinda
    Then kullanici "us16Username" ve "us16Password" girerek giris yapar2
    And admin Rooms sayfasina gecis yapar
    Then url nin "room" icerdigini dogrular
    Then basligin "Rooms" icerdigini dogrular
    And tablo da "ID" "Room Number" "Room Type" "Status" "Price" "Description" "Created Date" basliklarinin gorunur oldugunu dogrular
    And Create a new Room butonunun erisilebilir ve gorunur oldugunu dogrular
    And sayfayi kapatir

#Sayfa numaralari oda eklendikce degisecek
  Scenario: US016 TC001 Admin ayni tur odalari gorebilir
    Given kullanici medunna anasayfasinda
    Then kullanici "us16Username" ve "us16Password" girerek giris yapar2
    And admin Rooms sayfasina gecis yapar
    And admin Room Type gore odalari siralar
    Then admin TWIN odalarin siralandigini dogrular
    And admin SUITE odalarin sirlandigini dogrular
    And admin PREMIUM_DELUXE odalarin siralndigini dogrular
    And admin DELUXE odalarin siralandigini dogrular
    And admin DAYCARE odalarin siralandigini dogrular
    And sayfayi kapatir

# 1 fail olacak step var, tek basina senaryo calistirldiginda her test den once
# ya yeni odanin datalarini degistirmeli yada ayni datali odayi silmeli
  Scenario: US016 TC002 Admin yeni oda olusturabilir
    Given kullanici medunna anasayfasinda
    Then kullanici "us16Username" ve "us16Password" girerek giris yapar
    And admin Rooms sayfasina gecis yapar
    And Create a new Room butonuna tiklar
    Then Create or Edit sayfasinin acildigini dogrular
    And Room Number "59000" girer
    And Room Type "DAYCARE" secer
    And Price "10" girer
    And Description "team59 otomasyon testi" girer
    And Created Date "25082022" girer
    And Save butonuna tiklar
    Then "A new Room is created" yazisinin gorunur oldugunu dogrular
    And yeni olusturulan odanin sayfasina navigate eder
    Then yeni odanin id sinin gorunur oldugunu dogrular
    And view butonuna tiklar
    Then yeni odanin bilgilerinin "59000" "DAYCARE" "10" "team59 otomasyon testi" oldugunu dogrular
    #FAILED STEP
    Then created date "25/08/22" oldugunu dogrular
    And sayfayi kapatir

#1 failed step var
  Scenario: US016 TC003 Admin odalari guncelleyebilmeli
    Given kullanici medunna anasayfasinda
    Then kullanici "us16Username" ve "us16Password" girerek giris yapar
    And admin Rooms sayfasina gecis yapar
    And "11552" id li odanin Edit butonuna tiklar
    And Room Number "5910" girer
    And Room Type "DAYCARE" secer
    And Price "11" girer
    And Description "team59 otomasyon testi EDIT" girer
    And Created Date "27082022" girer
    And Save butonuna tiklar
    Then "A Room is updated with identifier 11552" yazisinin oldugunu dogrular
    And "11552" id li odanin View butonuna tiklar
    Then yeni odanin bilgilerinin "5910" "DAYCARE" "11" "team59 otomasyon testi EDIT" oldugunu dogrular
    #FAILED STEP
    Then created date "27/08/22" oldugunu dogrular
    And sayfayi kapatir

#kendisi oda olusuturp siliyor o yuzden her sefer calisir
  Scenario: US016 TC004 Admin odayi silebilmeli
    Given kullanici medunna anasayfasinda
    Then kullanici "us16Username" ve "us16Password" girerek giris yapar
    And admin Rooms sayfasina gecis yapar
    And olusturdugu odaya gecis yapar
    And Delete butonuna tiklar
    And dogrulama sayfasinda Delete butonuna tiklar
    Then "A Room is deleted" yazisinin oldugunu dogrular
    Then silinen odanin id sinin olmadigini dogrular
    And sayfayi kapatir

  Scenario: US016 TC005 Room Number
    Given kullanici medunna anasayfasinda
    Then kullanici "us16Username" ve "us16Password" girerek giris yapar
    And admin Rooms sayfasina gecis yapar
    And Create a new Room butonuna tiklar
    Then Room Number basliginin gorunur oldugunu dogrular
    Then Room Number texbox in gorunur ve active oldugunu dogrular
    And Room Number bos birakildiginda kabul etmedigini dogrular
    And Room Number "aye" karakter girildiginde kabul etmedigini dogrular
    And Room Number "5940" sayi girildiginde kabul ettigini dogrular
    And sayfayi kapatir

  Scenario: US016 TC006 Room Type
    Given kullanici medunna anasayfasinda
    Then kullanici "us16Username" ve "us16Password" girerek giris yapar
    And admin Rooms sayfasina gecis yapar
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

  Scenario: US016 TC007 Status
    Given kullanici medunna anasayfasinda
    Then kullanici "us16Username" ve "us16Password" girerek giris yapar
    And admin Rooms sayfasina gecis yapar
    And Create a new Room butonuna tiklar
    Then Status basliginin gorunur oldugunu dogrular
    Then status checkbox gorunur ve active oldugunu dogrular
    And status checkbox click yapar
    Then status checkox secili oldugunu dogrular
    And status checkbox click yapar
    Then status checkboxsecili olmadigini dogrular
    And sayfayi kapatir

  Scenario: US016 TC008 Price
    Given kullanici medunna anasayfasinda
    Then kullanici "us16Username" ve "us16Password" girerek giris yapar
    And admin Rooms sayfasina gecis yapar
    And Create a new Room butonuna tiklar
    Then Price basliginin gorunur oldugunu dogrular
    Then Price texbox in gorunur ve active oldugunu dogrular
    And Price bos birakildiginda kabul etmedigini dogrular
    And Price "aye" karakter girildiginde kabul etmedigini dogrular
    And Price "59" sayi girildiginde kabul ettigini dogrular
    And sayfayi kapatir

  Scenario: US016 TC009 Description
    Given kullanici medunna anasayfasinda
    Then kullanici "us16Username" ve "us16Password" girerek giris yapar
    And admin Rooms sayfasina gecis yapar
    And Create a new Room butonuna tiklar
    Then Description basliginin gorunur oldugunu dogrular
    Then Description textbox gorunur ve active oldugunu dogrular
    And description bos birakildiginda kabul ettigini dogrular
    And description herhangi bir metin "team59 otomasyon testi" yazildiginda kabul ettigini dogrular
    And sayfayi kapatir

#gg/mm/yyyy
  Scenario: US016 TC010 Created Date
    Given kullanici medunna anasayfasinda
    Then kullanici "us16Username" ve "us16Password" girerek giris yapar
    And admin Rooms sayfasina gecis yapar
    And Create a new Room butonuna tiklar
    Then Created Date basliginin gorunur oldugunu dogrular
    Then Created Date box gorunur ve active oldugunu dogrular
    And Created Date gecersiz tarih "00000" girildiginde kabul etmedigini dogrular
    And Created Date gecersiz tarih "02312022" girildiginde kabul etmedigini dogrular
    #Failed Step
    And Created Date gecmis tarih "12301999" girildiginde kabul etmedigini dogrular
    And sayfayi kapatir

