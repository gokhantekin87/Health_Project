Feature:


  # 1 fail olacak step var, tek basina senaryo calistirldiginda her test den once
# ya yeni odanin datalarini degistirmeli yada ayni datali odayi silmeli
  Scenario: US016 TC002 Admin yeni oda olusturabilir
    Given kullanici medunna anasayfasinda
    And kullanici account menu tiklar
    And kullanici sign in tiklar
    And kullanici username olarak "us16Username" girer
    And kullanici password olarak "us16Password" girer
    And sign in butonuna tiklar
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
    And admin Rooms sayfasina gecis yapar
    And "11552" id li odanin Edit butonuna tiklar
    And Room Type "DAYCARE" secer
    And Price "11" girer
    And Description "team59 otomasyon testi EDIT" girer
    And Created Date "27082022" girer
    And Save butonuna tiklar
    Then "A Room is updated with identifier 11552" yazisinin oldugunu dogrular
    And "11552" id li odanin View butonuna tiklar
    Then yeni odanin bilgilerinin "DAYCARE" "11" "team59 otomasyon testi EDIT" oldugunu dogrular
    #FAILED STEP
    Then created date "27/08/22" oldugunu dogrular
    And sayfayi kapatir


    #gg/mm/yyyy
  Scenario: US016 TC010 Created Date
    And admin Rooms sayfasina gecis yapar
    And Create a new Room butonuna tiklar
    Then Created Date basliginin gorunur oldugunu dogrular
    Then Created Date box gorunur ve active oldugunu dogrular
    And Created Date gecersiz tarih "00000" girildiginde kabul etmedigini dogrular
    And Created Date gecersiz tarih "02312022" girildiginde kabul etmedigini dogrular
    #Failed Step
    And Created Date gecmis tarih "12301999" girildiginde kabul etmedigini dogrular
    And close driver


    Scenario:
      And close driver