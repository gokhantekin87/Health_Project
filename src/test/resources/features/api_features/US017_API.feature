@E2E
Feature: US017 API validation / Test Item
#calisiyor
  Scenario: US017 TC001 kullanici get request ile test item bilgilerini alir
    Given kullanici test item bilgileri icin get request yapar
    And kullanici gelen test item datayi deserialize eder
#calisiyor
  Scenario:US016 TC002  kullanici test item bilgilerini get request ile alir ve dogrular
    Given kullanici id ile test item bilgileri icin get request yapar
    Then kullanici "test item no:03" name dogrular
    Then kullanici "test item for api/db test validation" description dogrular
    Then kullanici test item 59 price dogrular
    Then kullanici test item "0" defaultMinValue dogrular
    Then kullanici test item "100" defaultMaxValue dogrular

#calisiyor / her calistirildiginda name sonundaki sayi bir artirilacak/ ayni name ile 2 post yapilirsa hata verir
  Scenario: US016 TC003 kullanici post request ile yeni test item olusturur
    Given kullanici test item icin post request yapar name "test item no:0011" girer
    Then kullanici olusturulan test item bilgilerini dogrular

#  Scenario: kullanici put request ile test item bilgilerini gunceller
#    Given kullanici test item icin put request yapar
#    Then kullanici test item put request validation yapar


#calisiyor / her sefer id numara degisekecek
  #silmek icin id : 33002 /
  Scenario: US016 TC004 delete test item
    Given kullanici test 265132 item icin delete request yapar
    Then kullanici test item delete request validation yapar