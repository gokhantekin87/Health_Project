Feature: US016 ROOM
  Scenario: US016 TC000 admin room sayfasini dogrular
    Given kullanici medunna anasayfasinda
    Then kullanici "us16Username" ve "us16Password" girerek giris yapar2
    And admin Rooms sayfasina gecis yapar
    Then url nin "room" icerdigini dogrular
    Then basligin "Rooms" icerdigini dogrular
    And tablo da "ID" "Room Number" "Room Type" "Status" "Price" "Description" "Created Date" basliklarinin gorunur oldugunu dogrular
    And Create a new Room butonunun erisilebilir ve gorunur oldugunu dogrular
    And sayfayi kapatir

  Scenario: US016 TC001 Admin ayni tur odalari gorebilir
    Given kullanici medunna anasayfasinda
    Then kullanici "us16Username" ve "us16Password" girerek giris yapar
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




