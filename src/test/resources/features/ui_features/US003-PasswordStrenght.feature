

  Feature: Registration sayfasında güçlü şifre girilmeli ve "Password strength" seviyeleri görülebilmelidir

    Background:
      Given User "medunnaUrl"ine gider
      When User sağ üst köşedeki user iconuna tıklar
      And User register butonuna tıklar


    @Smoke
    @US003_TC01_Negative_Test
      Scenario Outline :Güçlü bir parola için şifre en az 7 karakter uzunluğunda olmalı
      And User 7 karakterden az <Password> girer
      And User password strenght seviyesinin zayıf olduğunu doğrular
      Examples:
      | Password |
      | ABCDEF   |
      | 123456   |
      | */%@+?   |
      | AB5cd*   |

    @US003_TC02_Positive_Test
       Scenario Outline: Daha güçlü şifre için en az 1 küçük harf olmalı ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
        And User 7 karakter uzunluğunda en az 1 küçük harf içeren ikili kombinasyonlu "<Password>" girer
        Then User şifre strength seviyesinin değiştiğini(artış gösterdiğini) doğrular

       Examples:
       | Password |
       | ABCDEF   |
       | 123456   |
       | */%@+?   |
       | AB5cd*   |





