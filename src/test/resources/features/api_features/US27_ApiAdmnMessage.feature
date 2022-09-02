@E2E
  Feature: US027 API validation / Messages by Admin Validate with API

    Scenario: US027 TC001 Kullanıcı, API kullanarak ileti oluşturmayı doğrulamalıdır
     Given Admin mesajlar icin set the path params yapar
     And Admin mesajlar için post request yapar ve  yanıt alır
     Then Admin API ile kayıtlı tüm mesaj bilgilerini doğrular

    Scenario: US027 TC002 Admin, API kullanarak ileti okumayı doğrulamalıdır
      Given Admin mesajlar icin set the path params yapar
      When Admin mesajlar icin get request yapar ve yanıt alır
      And Admin get yaptığı mesaj bilgilerinin tümünü API ile kaydeter
      Then Admin API ile Assertion yapar








