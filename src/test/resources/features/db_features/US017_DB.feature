Feature: US017 Test Item

  Scenario: US017 TC001 kullanici id li test item bilgilerini dogrular
    Given kullanici database baglanir
    And kullanici 250218 "ID" li test ogesinin bilgilerini "*" "c_test_item" tablosundan alir
    Then kullanici test ogesinin "name"  "test item no:03" oldugunu dogrular
    Then kullanici test ogesinin "description" i "test item for api/db test validation" oldugunu dogrular
    Then kullanici test ogesinin "default_val_min" i "0" oldugunu dogrular
    Then kullanici test ogesinin "default_val_max" i "100" oldugunu dogrular
    Then kullanici test ogesinin "created_by" i "admin59" oldugunu dogrular
    And database baglantisini kapatir
