@US_013All
Feature: Physician Test Result islemleri yapabilir
  Background: TC01 ve TC02

    Given Physician medunna anasayfasina gider
    When Physician Sign in sekmesine gecis yapar ve tıklar
    Then Physician giris yapar
    And Physician My Pages sekmesine gecis yapar ve tıklar
    And Physician My Appointments sekmesine gecis yapar ve tıklar
    And Physician Edit sekmesine gecis yapar ve tıklar



  @US_013All @US13_TC01
  Scenario: TC01 Physician Test Result islemleri yapabilir
    And Physician Show Test Result sekmesine gecis yapar ve tıklar
    And Physician View Result sekmesine gecis yapar ve tıklar
    And Physician Test Result tablosunu gorebilir


  @US_013All @US13_TC02
  Scenario:Physician Request Inpatient isteğinde bulunabilmeli
    And Physician Request Inpatient butonuna tıklar.
















