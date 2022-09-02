@E2E
Feature: US028 API ile ulke okuma/olusturma/duzenleme/silme
  Scenario: US28 TC02 Ulke bilgilerini okuma
    Given kullanici ulke bilgilerini API olarak okur "https://medunna.com/api/countries"

  Scenario Outline: US28 TC03 Ulke olusturma
    Given kulanici API ile ulke olusturur "https://medunna.com/api/countries" "<idJson>" "<nameJson>"
    Examples:
      |idJson||nameJson|
      |name||Turkiye|

  Scenario Outline:US28 TC04  Ulke duzenleme
    Given kullanici ulke ismini duzenler "<endpoint>" "<id>" "<name>"
    Examples:
      |endpoint||id||name|
      |https://medunna.com/api/countries||210630||Turkiye|

  Scenario Outline:US28 TC05 Ulke silme
    Given kullanici ulke ismini siler "<endpoint>" "<id>"
    Examples:
      |endpoint||id|
      |https://medunna.com/api/countries/||227841|


