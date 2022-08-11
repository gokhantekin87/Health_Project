  @PasswordStrnght
   Feature: Registration sayfasında güçlü şifre girilmeli ve "Password strength" seviyeleri görülebilmelidir

    Background:
      Given Medunna url'sine tiklar
      When User sağ üst köşedeki user ikonuna tiklar
      And User Register buttonuna tiklar

     @Smoke @US003_TC01_Negative_Test
      Scenario Outline: :Güçlü bir parola için şifre en az yedi karakter uzunluğunda olmalı
      And User yedi karakterden az "<Password>" girer
      And User password strenght seviyesinin zayıf olduğunu doğrular
      Examples:
      |Password|
      |ABCDEF|
      |123456|
      |*/%@+?|
      |AB5cd*|

    @US003_TC02_Positive_Test
       Scenario Outline: Daha güçlü şifre için en az bir adet küçük harf olmalı ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
        And User yedi karakter uzunluğunda en az bir adet küçük harf içeren ikili kombinasyonlu "<Password>" girer
        Then User şifre strength seviyesinin değiştiğini(ikinci levela geçtiğini) doğrular

       Examples:
       |Password|
       |abcdEFG|
       |987efkl|
       |dropp/*|


    @US003_TC03
    Scenario Outline: Şifre en az bir adet büyük harf içermeli ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
      And User yedi karakter uzunluğunda en az adet büyük harf içeren üçlü kombinasyonlu "<Password>" girer
      Then User şifre strength seviyesinin üçüncü ve dördüncü level'a geldiğini doğrular

      Examples:
        |Password|
        |efgHL45|
        |*/?//gG|
        |6999**K|

    @US003_TC04
    Scenario Outline: Şifre en az bir adet rakam içermeli ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
      And User yedi karakter uzunluğunda en az bir adet rakam içeren üçlü kombinasyonlu "<Password>" girer
      Then User şifre strength seviyesinin hala dördüncü level'da olduğnu doğrular

      Examples:
        |Password|
        |efgHL45|
        |12345/g|
        |6999**H|

    @US003_TC05
    Scenario Outline: Şifre en az bir adet özel karakter içermeli ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
      And User yedi karakter uzunluğunda en az bir özel karakter içeren ve tüm kombinasyonları barındıran "<Password>" girer
      Then User password strength seviyesinin en son level'da olduğunu doğrular

      Examples:
        |Password|
        |Gemş1*/|
        |ABC*/99|


    @US003_TC06
    Scenario Outline: Güçlü bir parola için şifre en az yedi ve yedi karakterden fazla olmalıdır.
      And User sekiz karakter uzunluğunda tüm kombinasyonları içeren(kücük büyük harf,rakam, özel karakter) "<Password>" girer
      Then User şifre strength seviyesinin hala en son levelda olduğunu doğrular

      Examples:
        |Password|
        |NESar69*?|





