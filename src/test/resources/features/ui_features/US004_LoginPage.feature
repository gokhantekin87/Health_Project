
  Feature: Giriş sayfası yalnızca geçerli kimlik bilgileriyle erişilebilir olmalıdır.

    Background:
      Given Medunna url'sine tiklar
      When User sağ üst köşedeki user ikonuna tiklar
      And User SingIn'e tiklar

      @Smoke
      Scenario Outline: Giriş yapmak için başarı mesajını doğrulayan, geçerli bir kullanıcı adı ve şifre olmalıdır.(Positive Scenario)
        And User geçerli username olarak "<valid username>" girer
        And User geçerli password olarak "<valid password>" girer
        And User SıgnIn buttonuna tıklar
        Then Giriş işleminin başarılı olduğunu doğrular
        And Sayfayı kapatır

        Examples:
        |valid username|valid password|
        |doktorverda   |MneCrn4*      |

      Scenario Outline: Giriş yapmak için  kullanıcı adı ve şifre geçersiz  olmamalıdır. (Negative Scenario)
        And User geçersiz username olarak "<invalid username>" girer
        And User geçersiz password olarak "<invalid password>" girer
        And User SıgnIn buttonuna tıklar
        Then Sayfaya giriş yapılamadığını doğrular
        And Sayfayı kapatır

        Examples:
        |invalid username|invalid password|
        |gamzekul39      |GmzKL3699       |

      Scenario: Kullanıcının mevcut kimlik bilgilerini her zaman kullanabileceği bir beni hatırla seçeneği olmalıdır.
        Then User "Did you forget your password?" seçeneğinin görüntülendiğini doğrular

       Scenario: Eğer şifre unutulursa diye "Did you forget your password?" seçeneği olmalı
        Then User, "Did you forget your password?" seçeneğinin görüntülendiğini doğrular

      Scenario: "You don't have an account yet? Register a new account" seçeneği olmalı
        Then User, "You don't have an account yet? Register a new account" seçeneğinin görüntülendiğini doğrular

      Scenario:"Cancel" seçeneği olmalı
        Then User, "Cancel" seçeneğini görüntülendiğini doğrular
        And Sayfayı kapatır




