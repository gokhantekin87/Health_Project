Feature: US016 Room

  Scenario: kullanici get request ile oda bilgilerini alir
    Given kullanici oda bilgileri icin get request yapar
    And kullanici gelen oda datayi deserialize eder

    Scenario: kullanici post request ile yeni oda olusturur
      Given kullanici oda icin post request yapar
      Then kullanici olusturulan oda bilgilerini dogrular

 Scenario: kullanici oda bilgilerini get request ile alir ve dogrular
    Given kullanici id ile oda bilgileri icin get request yapar
    Then kullanici 5910 roomNumber dogrular
    Then kullanici "DAYCARE" roomType dogrular
    Then kullanici 59 price dogrular

  Scenario: kullanici put request ile oda bilgilerini gunceller
    Given kullanici roomlar icin put request yapar
    Then kullanici put request validation yapar

  Scenario: delete rooms
    Given kullanici delete request eder
    Then delete validation

