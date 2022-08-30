Feature: US017 Test Item

  Scenario: kullanici get request ile test item bilgilerini alir
    Given kullanici test item bilgileri icin get request yapar
    And kullanici gelen test item datayi deserialize eder

  Scenario: kullanici test item bilgilerini get request ile alir ve dogrular
    Given kullanici id ile test item bilgileri icin get request yapar
    Then kullanici "test item no:03" name dogrular
    Then kullanici "test item for api/db test validation" description dogrular
    Then kullanici test item 59 price dogrular
    Then kullanici test item "0" defaultMinValue dogrular

  Scenario: kullanici post request ile yeni test item olusturur
    Given kullanici test item icin post request yapar
    Then kullanici olusturulan test item bilgilerini dogrular

  Scenario: kullanici put request ile test item bilgilerini gunceller
    Given kullanici test item icin put request yapar
    Then kullanici test item put request validation yapar

  Scenario: delete test item
    Given kullanici test item icin delete request yapar
    Then kullanici test item delete request validation yapar