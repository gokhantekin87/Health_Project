@SmokeTest
Feature: Kullanici basarili Registration yapabilmeli

  Scenario Outline: Kullanici basarili Registration yapabilir
    Given kullanıcı ana sayfaya gider
    And kullanici sağ üstteki profil simgesine tıklar
    And kullanici registration butonun tıklar
    And  kullanici "<SSN>" SSN box girer
    And kullanici"<firstname>" firstname box girer
    And kullanici "<lastname>" lastname box girer
    And kullanici"<username>" username box girer
    And kullanici"<email>" email box girer
    And kullanici "<password>" password box girer
    And kullanici aynı"<password>" password confirmation box girer
    And kullanici register button tıklar
    Then kullanici basarili Registration yaptigini dogrular
    And sayfayi kapatir
    Examples:
    | SSN       | firstname  | lastname | username      | email                 | password  |
    |133-95-7133|team8      |usera8     |usera8         |user8@gmail.com        |user       |