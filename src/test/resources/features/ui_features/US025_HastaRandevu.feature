Feature: Hastalarin randevu oluşturabilmesi ve görebilmesi
  Scenario Outline: Hastalar hastaneden randevu oluşturabilmelidir
    Given kullanici medunna anasayfasinda
    And kullanici "patientUserNamed" ve "patientPasswordd" girerek giris yapar
    And kullanıcı myPagese tıklar
    Then kullanıcı makeAnAppoitmente tıklar
    And kullanıcı firstName kutusuna "<firstName>" bilgi girer
    And kullanıcı lastName kutusuna "<lastName>" bilgi girer
    And kullanıcı ssn kutusuna "<ssn>" bilgi girer
    And kullanıcı eMail kutusuna "<eMail>" bilgi girer
    And kullanıcı phone kutusuna "<phone>" bilgi girer
    And kullanıcı appoitmentDateTime kutusuna "<appoitmentDateTime>" bilgi girer
    And kullannıcı Send an Appoitment Requeste tıklar
    And kullanici 1 saniye bekler
    And sayfayi kapatir


    Examples:
      |firstName|lastName|ssn        |eMail           |phone       |appoitmentDateTime|
      |hakan   |tasiyan |325-02-1234|mesma@gmail.com   |234-245-4455|11.09.2022        |