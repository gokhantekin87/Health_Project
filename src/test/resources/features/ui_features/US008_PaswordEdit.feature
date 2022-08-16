@EndtoEndTest @US08
Feature: US008_Password_duzenleme
  Background: Password Sayfasina Girilir
  Scenario: US008_password_duzenleme
    Given kullanici Url ye gider
    And kullanici Account menuye tiklar
    And kullanici Sign in butonuna tiklar
    And kullanici username "bergin" passworde "ABCDEF" girer
    And Kullanici Sign in butonuna tiklar
    Then Kullanici account page sayfasinda account menuye tiklar
    Then Kullanici Password butonuna tıklar
  @US08_TC01
  Scenario Outline:Yeni Password Onaylanabilmelidir
    And Kullanici gecerli sifresini "<currentPassword>" gecerli sifre alanına girer
    And Kullanici yeni sifresini "<newPassword>" yeni sifre alanina girer
    And kullanici yeni sifresini "<confirmationPassword>" alanina tekrar girer
    And Kullanici save butonuna tiklar
    Then Kullanici toast container box ta basarili mesajini gorur
    Examples:
      |currentPassword|newPassword|confirmationPassword|
      |ABCDEF         |ABCDEF     |ABCDEF              |
  @US08_TC02
  Scenario Outline: Daha guclu password icin bir kucuk harf eklenir
    And kullanici yeni password kismini temizler
    And Kullanici yeni sifresini "<newpassword>" yeni sifre alanina girer
    And Strenght bar bir cizgi olarak gorunur
    And Kullanici yeni password alanina "<addcharacter>" bir karakter ekler
    Then Strenght bar iki cizgi olarak gorunur
    Examples:
      |newpassword |addcharacter|
      |123456      |a            |
  @US08_TC03
  Scenario Outline:Daha guclu password icin bir buyuk harf eklenir
    And kullanici yeni password kismini temizler
    And Kullanici yeni sifresini "<newpassword>" yeni sifre alanina girer
    Then Strenght bar iki cizgi olarak gorunur
    And Kullanici yeni password alanina "<addcharacter>" bir karakter ekler
    Then Strenght bar dort cizgi olarak gorunur
    Examples:
      |newpassword  |addcharacter|
      |123456a      |A           |
  @US08_TC04
  Scenario Outline:Daha guclu password icin bir rakam harf eklenir
    And kullanici yeni password kismini temizler
    And Kullanici yeni sifresini "<newpassword>" yeni sifre alanina girer
    Then Strenght bar iki cizgi olarak gorunur
    And Kullanici yeni password alanina "<addcharacter>" bir karakter ekler
    Then Strenght bar dort cizgi olarak gorunur
    Examples:
      |newpassword  |addcharacter|
      |ABCDEFa      |1           |
  @US08_TC05
  Scenario Outline:Daha guclu password icin bir ozel karakter eklenir
    And kullanici yeni password kismini temizler
    And Kullanici yeni sifresini "<newpassword>" yeni sifre alanina girer
    Then Strenght bar iki cizgi olarak gorunur
    And Kullanici yeni password alanina "<addcharacter>" bir karakter ekler
    Then Strenght bar bes cizgi olarak gorunur
    Examples:
      |newpassword  |addcharacter|
      |ABCDEFa1      |?           |
  @US08_TC06
  Scenario Outline:Guclu bir sifre en az yedi karakterden olusmalidir
    And kullanici yeni password kismini temizler
    And Kullanici yeni sifresini "<newpassword>" yeni sifre alanina girer
    Then Strenght bar bir cizgi olarak gorunur
    And Kullanici yeni password alanina "<addcharacter>" bir karakter ekler
    Then Strenght bar iki cizgi olarak gorunur
    Examples:
      |newpassword  |addcharacter|
      |ABCDEF      |?           |
  @US08_TC07
  Scenario Outline:Eski sifre kullanilmamalidir
    When kullanici gecerli password kismini temizler
    And kullanici yeni password kismini temizler
    And Kullanici confirmation password kismini temizler
    And Kullanici gecerli sifresini "<currentPassword>" gecerli sifre alanına girer
    And Kullanici yeni sifresini "<newpassword>" yeni sifre alanina girer
    And kullanici yeni sifresini "<confirmationPassword>" alanina tekrar girer
    And Kullanici save butonuna tiklar
    Then Kullanici toast container box ta basarili mesajini BUG olarak gorur
    Then Kullanici driveri kapatir
    Examples:
      |currentPassword|newpassword  |confirmationPassword|
      |ABCDEF        |ABCDEF       |ABCDEF     |





