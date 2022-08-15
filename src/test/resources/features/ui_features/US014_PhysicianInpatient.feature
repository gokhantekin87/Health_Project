@US014All
Feature: Physician Inpatient islemleri yapabilir
  Background: TC01 ve TC02

    Given Physician medunna anasayfasina gider
    When Physician Sign in sekmesine gecis yapar ve tıklar
    Then Physician giris yapar
    And Physician My Pages sekmesine gecis yapar ve tıklar
    And Physician Inpatients sayfasına gecis yapar ve tıklar

  @US014All @US014_TC01
  Scenario: TC01 Physician Inpatients bilgilerini gorebilir
    Then Physician edit butonuna tıklar
    And Physician Inpatients bilgilerini gorur

  @US014All @US014_TC02
  Scenario: TC02 Physician Status durumunu degistirebilir
    Then Physician unapproved edit butonuna tıklar
    And Physician status durumunu degistirebilir olduğunu dogrular

  @US014All @US014_TC03
  Scenario: TC03 Physician room bilgisini guncelleyebilir
    Then Physician staying edit butonuna tıklar
    And Physician room guncelleyebilir