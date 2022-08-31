@API_US27
  Feature: Messages by Admin Validate with API
     @ap
    Scenario: Kullanıcı, API kullanarak ileti oluşturmayı doğrulamalıdır
     Given Admin mesajlar için set the path params yapar
     When Admin mesajlar için beklenen dataları girer
     And Admin mesajlar için post request yapar ve  yanıt alır
     And Admin mesaj bilgilerinin tümünü API ile kaydeter
     Then Admin API ile kayıtlı tüm mesaj bilgilerini doğrular

    Scenario: Admin, API kullanarak ileti okumayı doğrulamalıdır
      Given Admin mesajlar için set the path params yapar
      When Admin mesajlar icin get request yapar ve yanıt alır
      And Admin get yaptığı mesaj bilgilerinin tümünü API ile kaydeter
      Then Admin API ile Assertion yapar








