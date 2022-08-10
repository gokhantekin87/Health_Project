  @all
   Feature: Registration sayfasında güçlü şifre girilmeli ve "Password strength" seviyeleri görülebilmelidir

    Background:
      Given User "medunnaUrl" ine gider
      When User sağ üst köşedeki user ikonuna tiklar
      And User Register buttonuna tiklar

     @Smoke @US003_TC01_Negative_Test
      Scenario Outline: :Güçlü bir parola için şifre en az 7 karakter uzunluğunda olmalı
      And User 7 karakterden az "<Password>" girer
      And User password strenght seviyesinin zayıf olduğunu doğrular
      Examples:
      |Password|
      |ABCDEF|
      |123456|
      |*/%@+?|
      |AB5cd*|

    @US003_TC02_Positive_Test
       Scenario Outline: Daha güçlü şifre için en az 1 küçük harf olmalı ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
        And User 7 karakter uzunluğunda en az 1 küçük harf içeren ikili kombinasyonlu "<Password>" girer
        Then User şifre strength seviyesinin değiştiğini(artış gösterdiğini) doğrular

       Examples:
       |Password|
       |ABCDEF|
       |123456|
       |*/%@+?|
       |AB5cd*|

    @US003_TC03
    Scenario Outline: Şifre en az 1 büyük harf içermeli ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
      And User 7 karakter uzunluğunda en az 1 büyük harf içeren üçlü kombinasyonlu "<Password>" girer
      Then User şifre strength seviyesinin değiştiğini(artış gösterdiğini) doğrular

      Examples:
        |Password|
        |efgGHL45|
        |12345/gG|
        |6999**1|
        |AB5cd*|

    @US003_TC04
    Scenario Outline: Şifre en az 1 rakam içermeli ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
      And User 7 karakter uzunluğunda en az 1 büyük harf içeren üçlü kombinasyonlu "<Password>" girer
      Then User şifre strength seviyesinin değiştiğini(artış gösterdiğini) doğrular

      Examples:
        |Password|
        |efgGHL45|
        |12345/gG|
        |6999**1|
        |AB5cd*|

    @US003_TC05
    Scenario Outline: Şifre en az 1 özel karakter içermeli ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
      And User 7 karakter uzunluğunda en az 1 büyük harf içeren ve tüm kombinasyonları barındıran "<Password>" girer
      Then User şifre strength seviyesinin değiştiğini(en son levelda olduğunu) doğrular

      Examples:
        |Password |
        |Gemş11*/ |

    @US003_TC06
    Scenario Outline: Şifre en az 1 özel karakter içermeli ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
      And User 8 karakter uzunluğunda tüm kombinasyonları içeren(kücük büyük harf,rakam, özel karakter) "<Password>" girer
      Then User şifre strength seviyesinin en son levelda olduğunu doğrular

      Examples:
        |Password|
        |NESar69*?|





