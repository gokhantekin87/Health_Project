
Feature:  US002 : Registration e-posta ve kullanıcı adı kullanılarak başarılı olmalıdır

  @UIayhan
  Scenario Outline: TC00201 Kullanıcı sağ üstteki profil simgesini görebilir ve tıklayabilir ve kaydı doldurabilmelidir

    Given kullanıcı ana sayfaya gider
    And kullanici sağ üstteki profil simgesine tıklar
    And kullanici registration butonun tıklar
    And  kullanici "<SSN>" SSN box girer
    And kullanici"<firstname>" firstname box girer
    Then kullanici "<lastname>" lastname box girer
    Then kullanici"<username>" username box girer
    Then kullanici"<email>" email box girer
    And kullanici "<password>" password box girer
    And kullanici aynı"<password>" password confirmation box girer
    Then kullanici register button tıklar
    Examples:
      |SSN|          firstname|  lastname| email|  username|  password|
      |571-57-5715|  ayhan66 |  ayhan    |notilus@gmail.com |medunna59 |medunna59 |

  @UIayhan2
  Scenario Outline: TC00202 Verilen kullanıcı adı karakter içermeli ve boş bırakılamaz. Negatif Test: Kullanıcı, kullanıcı adı kutusunu boş bırakır

    Given kullanıcı ana sayfaya gider
    And kullanici sağ üstteki profil simgesine tıklar
    And kullanici registration butonun tıklar
    And  kullanici "<SSN>" SSN box girer
    And kullanici"<firstname>" firstname box girer
    Then kullanici "<lastname>" lastname box girer
    Then kullanici username box kutusuna username girmez
    Then kullanici"<email>" email box girer
    And kullanici "<password>" password box girer
    And kullanici aynı"<password>" password confirmation box girer
    Then kullanici register button tıklar
    And kullanici Kullanıcı adınız gerekli görünüyor uyarı mesajı alır
    Examples:
      |SSN|          firstname|  lastname| email|   password|
      |571-57-5715|  ayhan66  |  ayhan     |notilus@gmail.com| medunna59|

  @UIayhan3
  Scenario Outline: TC00203 Kullanıcı adı eposta kimliği "@" karakteri ve ".com" uzantısı ile oluşturulmalıdır ve boş bırakılamaz. Negatif test: Kullanıcı e-postayı "@" ve ".com" olmadan girer

    Given kullanıcı ana sayfaya gider
    And kullanici sağ üstteki profil simgesine tıklar
    And kullanici registration butonun tıklar
    And  kullanici "<SSN>" SSN box girer
    And kullanici"<firstname>" firstname box girer
    Then kullanici "<lastname>" lastname box girer
    Then kullanici"<username>" username box girer
    Then kullanici email box kutusuna geçersiz email girer
    And kullanici "<password>" password box girer
    And kullanici aynı"<password>" password confirmation box girer
    Then kullanici register button tıklar
    And kullanici uyarı mesajını doğrulayın bu alan geçersiz mesajı alır
    Examples:
      |SSN |   firstname|  lastname| email|  username|  password|
      |571-57-5715|  ayhan66  |  ayhan    |notilusgmailcom |medunna59 |medunna59|

  @UIayhan4
  Scenario Outline: TC00204 Kullanıcı eposta kutusunu boş bırakamaz. Negatif test: Kullanıcı E-posta kutusunu boş bırakır

    Given kullanıcı ana sayfaya gider
    And kullanici sağ üstteki profil simgesine tıklar
    And kullanici registration butonun tıklar
    And  kullanici "<SSN>" SSN box girer
    And kullanici"<firstname>" firstname box girer
    Then kullanici "<lastname>" lastname box girer
    Then kullanici"<username>" username box girer
    Then kullanici email box kutusunu boş bırakır
    And kullanici "<password>" password box girer
    And kullanici aynı"<password>" password confirmation box girer
    And kullanici epostanız gerekli mesajı görüntülendiğini doğrular
    Examples:

      |SSN|firstname|  lastname|  username|  password|
      |571-57-5715|ayhan66   |  farketmez  |medunna59 |medunna59|



