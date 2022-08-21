@EndtoEndTest @us05
Feature:US005 Hastaların randevu oluşturabildigini test et

      #Kullanıcının herhangi bir karakter içeren "First Name" yazması gerekir ve boş bırakılamaz.
  @TC001 @US05
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
    And kayıt oluşturulup oluşturulmadıgını kontrol eder
    And sayfayi kapatir


    Examples:
    |firstName|lastName|ssn        |eMail           |phone       |appoitmentDateTime|
    |         |tasiyan |325-02-1234|memati@gmail.com|234-245-4455|11.09.2022        |

    @TC002 @US05
  Scenario Outline: ssn bos bırakılmaz
      #Kullanıcı SSN numarası girmeli (kayıtlı SSN) boş bırakılamaz.

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
    And kullanıcı ssn olmadan kayıt oluşturulamadıgını kontrol eder
    And sayfayi kapatir

    Examples:
      |firstName|lastName|ssn        |eMail           |phone       |appoitmentDateTime|
      |hakan    |tasiyan |           |memati@gmail.com|234-245-4455|11.09.2022        |


      @TC003 @US05
  Scenario Outline: lastName bos bırakılamaz

    #Kullanıcı, herhangi bir karakter içeren "Last Name" yazması gerekir, boş bırakılamaz.

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
    And kullanıcı lastName boş bırakilmadan kayıt oluşturulmadıgını kontrol eder
    And sayfayi kapatir

    Examples:
      |firstName|lastName|ssn        |eMail           |phone       |appoitmentDateTime|
      |hakan    |        |145-22-2255|memati@gmail.com|234-245-4455|11.09.2022        |

          #Kullanıcı, 3. ve 6. rakamdan sonra "-" olan 10 rakamlı telefon numarasını gireli, boş bırakılamaz.
  Scenario Outline: kullanıcı telefon numarasını bos bırakamaz

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
    And kullanıcı telNo boşken kayıt yapılamadıgnı kontrol eder
    And sayfayi kapatir

    Examples:
      |firstName|lastName|ssn        |eMail           |phone       |appoitmentDateTime|
      |hakan    | uzun   |145-22-2255|memati@gmail.com|            |11.09.2022        |

      #Kullanıcı randevu alıp kaydolduğunda, profillerini görebilir ve uygulamada oturum açabilir.
  Scenario Outline: kullanıcı kayıt oldugunda profillerini görebilir
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
    And kullanıcı myPagese tıklar
    And kullanıcı myAppoitmentse tıklar
    And kullanıcı hastanın olup olmadıgını kontrol eder
    And kullanıcı hastanın profili gözüktügünü kontrol eder
    And sayfayi kapatir



    Examples:
      |firstName|lastName|ssn        |eMail           |phone       |appoitmentDateTime|
      |hakan    | uzun   |145-22-2245|mematti@gmail.com|123-789-1245|11.09.2022        |



