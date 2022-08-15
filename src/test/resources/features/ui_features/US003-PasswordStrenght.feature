<<<<<<< Updated upstream
  @PasswordStrnght
   Feature: Registration sayfasında güçlü şifre girilmeli ve "Password strength" seviyeleri görülebilmelidir

    Background:
      Given Medunna url'sine tiklar
=======
  @all
   Feature: Registration sayfasında güçlü şifre girilmeli ve "Password strength" seviyeleri görülebilmelidir

    Background:
      Given User "medunnaUrl" ine gider
>>>>>>> Stashed changes
      When User sağ üst köşedeki user ikonuna tiklar
      And User Register buttonuna tiklar

     @Smoke @US003_TC01_Negative_Test
<<<<<<< Updated upstream
      Scenario Outline: :Güçlü bir parola için şifre en az yedi karakter uzunluğunda olmalı
      And User yedi karakterden az "<Password>" girer
=======
      Scenario Outline: :Güçlü bir parola için şifre en az 7 karakter uzunluğunda olmalı
      And User 7 karakterden az "<Password>" girer
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
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
=======
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
>>>>>>> Stashed changes

      Examples:
        |Password|
        |NESar69*?|





