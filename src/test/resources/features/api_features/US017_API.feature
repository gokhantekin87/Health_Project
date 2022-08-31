Feature: US017 Test Item
#calisiyor
  Scenario: kullanici get request ile test item bilgilerini alir
    Given kullanici test item bilgileri icin get request yapar
    And kullanici gelen test item datayi deserialize eder
#calisiyor
  Scenario: kullanici test item bilgilerini get request ile alir ve dogrular
    Given kullanici id ile test item bilgileri icin get request yapar
    Then kullanici "test item no:03" name dogrular
    Then kullanici "test item for api/db test validation" description dogrular
    Then kullanici test item 59 price dogrular
    Then kullanici test item "0" defaultMinValue dogrular
    Then kullanici test item "100" defaultMaxValue dogrular

#calisiyor / her calistirildiginda name sonundaki sayi bir artirilacak/ ayni name ile 2 post yapilirsa hata verir
  Scenario: kullanici post request ile yeni test item olusturur
    Given kullanici test item icin post request yapar name "test item no:04" girer
    Then kullanici olusturulan test item bilgilerini dogrular

#  Scenario: kullanici put request ile test item bilgilerini gunceller
#    Given kullanici test item icin put request yapar
#    Then kullanici test item put request validation yapar


#calisiyor / her sefer id numara degisekecek
  #silmek icin id : 33002 / 33008 / 33008
  Scenario: delete test item
    Given kullanici test 33001 item icin delete request yapar
    Then kullanici test item delete request validation yapar