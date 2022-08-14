
@UIHepsi
Feature: US_002: Registration e-posta ve kullanıcı adı kullanılarak başarılı olmalı


  @UIAyhan
  Scenario Outline:  TC00201 Kullanıcı sağ üstteki profil simgesini görebilir ve tıklayabilir ve kayıt kutularını doldurabilir

    Given kullanici ana sayafaya gider
    And kullanici sag üst karaktere tiklar
    And kullanici Register buttonuna tiklar
    Then kullanici "<username>" kutusuna gider
    Then kullanici "<email>" kutusuna gider
    Then kullanici Register buttonuna tiklar

    Examples:
     | email|  username|
     |notilus@gmail.com |hastanotilus |
    @UIAyhan2
    Scenario Outline:TC00202 Verilen kullanıcı adı karakter içermeli ve boş bırakılamaz. Negatif Test: Kullanıcı, kullanıcı adı kutusunu boş bıraktı

      Given kullanici ana sayafaya gider
      And kullanici sag üst karaktere tiklar
      And kullanici Register buttonuna tiklar
      Then kullanıcı username kusutusuna giriş yapamaz
      Then kullanici "<email>" kutusuna gider
      Then kullanici Register buttonuna tiklar
      And kullanıcı username kusutusuna giriş yapamaz
      Examples:
        | email|
       |notilus@gmail.com|

  @UIAyhan3
  Scenario Outline: TC00203 Kullanıcı Adı E-posta Kimliği "@" işareti ve ".com" uzantısı ile oluşturulmalıdır ve boş bırakılamaz. Negatif test: Kullanıcı e-postayı "@" ve ".com" olmadan girer

    Given kullanici ana sayafaya gider
    And kullanici sag üst karaktere tiklar
    And kullanici Register buttonuna tiklar
    Then kullanici "<username>" kutusuna gider
    Then kullanıci email kutusuna gecersiz email girer
    Then kullanici Register buttonuna tiklar
    And kullanici bu alanın geçersiz olduğunu dogrular
    Examples:

     |  username|
     |user00gmailcom |

  @UIAyhan4
  Scenario Outline: TC00204 Kullanıcı E-posta kutusunu boş bırakamaz. Negatif test: Kullanıcı E-posta kutusunu boş bırakır.

    Given kullanici ana sayafaya gider
    And kullanici sag üst karaktere tiklar
    And kullanici Register buttonuna tiklar
    Then kullanici "<username>" kutusuna gider
    Then kullanici email kutusunu boş bırakır
    And kullanici email mesajınının gerekli olduğunu görüntüler
    Examples:

      | username|
     |user100 |


