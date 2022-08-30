@US028ApiUlke
Feature: API ile ulke okuma/olusturma/duzenleme/silme
  Scenario: Ulke bilgilerini okuma
    Given kullanici ulke bilgilerini API olarak okur "https://medunna.com/api/countries"
  @Tc01
  Scenario Outline: Ulke olusturma
    Given kulanici API ile ulke olusturur "https://medunna.com/api/countries" "<idJson>" "<nameJson>"
    Examples:
      |idJson||nameJson|
      |name||Turkiye|
  @TC02
  Scenario Outline: Ulke duzenleme
    Given kullanici ulke ismini duzenler "<endpoint>" "<id>" "<name>"
    Examples:
      |endpoint||id||name|
      |https://medunna.com/api/countries||210630||Turkiye|
  @Tc03
  Scenario Outline: Ulke silme
    Given kullanici ulke ismini siler "<endpoint>" "<id>"
    Examples:
      |endpoint||id|
      |https://medunna.com/api/countries/||227841|


