@E2E
Feature: US018 Kullanici Database de hasta bilgilerinin oldugunu dogrular


  Scenario Outline: US018 TC001  Kullanici Physician bilgilerini dogrular
      Given kullanici database baglanir
      And kullanici physician bilgilerini "*" "physician" tablosundan alir
      #Then kullanici tabloda firstname "<firstname>" oldugunu dogrular
      Then kullanici tabloda lastname "<lastname>" oldugunu dogrular
      Then kullanici tabloda phone "<phone>" oldugunu dogrular
      Then kullanici tabloda gender "<gender>" oldugunu dogrular
      Then kullanici tabloda adress "<adress>" oldugunu dogrular
      And database kapatilir

      Examples:
      | firstname | lastname | phone | gender | adress |
      |leylamecnun2| fuzuli   | 222-222-2222 |MALE |mumdan gemi|

