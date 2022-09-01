@E2E
Feature: US016 Room / Kullanici room icin DB validation yapar

  #calisiyor
  Scenario: US016 TC001 kullanici id li oda bilgilerini dogrular
    Given kullanici database baglanir
    And kullanici 228125 "ID" li odanin bilgilerini "*" "room" tablosundan alir
    Then kullanici oda "room_number" i 5910 oldugunu dogrular
    Then kullanici oda "room_type" i "DAYCARE" oldugunu dogrular
#    Then kullanici oda "status" "false" oldugunu dogrular
#    Then kullanici oda "price" i 59.00 oldugunu dogrular
    Then kullanici oda "description" i "team59 test data for db/api test" oldugunu dogrular
    Then kullanici oda "created_by" i "admin59" oldugunu dogrular
    And database baglantisini kapatir