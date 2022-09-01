@E2E
Feature: US016 API validation / Room
#calisiyor
  Scenario: US016 TC001 kullanici get request ile oda bilgilerini alir
    Given kullanici oda bilgileri icin get request yapar
    And kullanici gelen oda datayi deserialize eder

  Scenario: US016 TC002 kullanici oda bilgilerini get request ile alir ve dogrular
    Given kullanici id ile oda bilgileri icin get request yapar
    Then kullanici 5910 roomNumber dogrular
    Then kullanici "DAYCARE" roomType dogrular
  #  Then kullanici 59 price dogrular


#calisiyor / roomNumber son sayi 1 artirilacak
  Scenario: US016 TC003 kullanici post request ile yeni oda olusturur
      Given kullanici oda icin post request yapar roomNumber 590001 girer
      Then kullanici olusturulan oda bilgilerini dogrular

  Scenario: US016 TC003 kullanici put request ile oda bilgilerini gunceller
    Given kullanici roomlar icin put request yapar
    Then kullanici put request validation yapar

    #calisiyor
    # delete id :253885
  Scenario: US016 TC004 delete rooms
    Given kullanici 265329 delete request eder
    Then delete validation

