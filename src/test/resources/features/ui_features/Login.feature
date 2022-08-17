@SmokeTest
Feature: Kullanici Medunna sayfasinda basarili giris yapabilmeli

  Scenario Outline: kullanici medunna sayfasinda basarili giris yapar
    Given kullanici medunna anasayfasinda
    And kullinici "<rol>" girisi icin "<username>" "<password>" girerek giris yapar
    Then kullanici basarili giris yapdigini dogrular "<userName>"
    And sayfayi kapatir
    Examples:
    | rol           | username       | password         | userName      |
    |Admin          |team59medunna   |medunna2022.team59|team59 medunna |
    |Staff          |StaffMe         |staffme2022       |Staff Team59   |
    |Doctor         |DoktorMe        |doktorme2022      |Doctor Me      |
    |Patient        |hastame         |hasta2022         |Hasta Me       |
    |User           |UserMe          |userme2022        |User Me        |
