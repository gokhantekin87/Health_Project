Feature: US009

  Scenario: US009 TC001
    Given kullanici medunna anasayfasinda
    Then kullanici "staffUsername" ve "staffPassword" girerek giris yapar
    And My Pages sekmesinden Search Patient tiklar
