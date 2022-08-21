@SmokeTest
Feature: Kullanici giris yapmadan basarili randevu olusturabilmeli
  Scenario Outline: kullanici basarili randevu olusturur
    Given kullanici medunna anasayfasinda
    And Make an Appointment butonuna tiklar
    And kullanıcı firstName kutusuna "<firstName>" bilgi girer
    And kullanıcı lastName kutusuna "<lastName>" bilgi girer
    And kullanıcı ssn kutusuna "<ssn>" bilgi girer
    And kullanıcı eMail kutusuna "<eMail>" bilgi girer
    And kullanıcı phone kutusuna "<phone>" bilgi girer
    And kullanıcı appoitmentDateTime kutusuna "<appoitmentDateTime>" bilgi girer
    And kullannıcı Send an Appoitment Requeste tıklar
    Then kullanici basarili randevu olusturdugunu dogrular
    Examples: Tarih(ay/g/y) =>08/21/2022
    | firstName  | lastName   | ssn            | eMail              | phone        | appoitmentDateTime |
    |team59      |user        |123-45-9371     |useer12@gmail.com   |000-000-0000  |08222022            |