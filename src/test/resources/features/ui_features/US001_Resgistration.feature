@SmokeTest
Feature:US01 Kayıt olmak için SSN, Firstname ve Lastname bilgileri girililebilmelidir.
  Background: Kullanici_register_sayfasina_gider
    Given Kullanici "medunnaUrl" adresine gider
    Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    Then Kullanici Register butonuna tiklar


  @TC001 @SmokeTest
  Scenario Outline: Gecerli bir SSN uc ve besinci rakamdan sonra - icermeli ve dokuz rakamdan olusmalıdır.
    #* Kullanici ssn kutucuguna tiklar
    * Kullanici dokuz haneli "<ssn>" girer
    * Kullanici bos alana tiklar
    * Kullanici Your SSN is required yazisinin gorunmedigini test eder
    #And Kullanici sayfayi kapatir
    Examples:
      |ssn|
      |123-56-1235|






  @TC002 @SmokeTest
  Scenario: SSN bos birakilamaz
    *  Kullanici ssn kutucuguna tiklar
    *  Kullanici firstname kutucuguna tiklar
    *  Kullanici Your SSN is required yazisinin goruntulendigini dogrular
    And Kullanici sayfayi kapatir
  @TC003 @SmokeTest
  Scenario Outline: Herhangi bir karakter içeren ve boş bırakılamayan geçerli bir FirstName  olmalıdır
    * Kullanici firstname kutucuguna tiklar
    * Kullanici firstname kutucuguna karakter iceren "<isim>" girer
    * Kullanici hata metni goruldugunu dogrular
    And Kullanici sayfayi kapatir
    Examples:|isim|
    |ali*|
  @TC003_1 @SmokeTest
  Scenario:firstname kutucugunun bos olup olmadigini dogrular
    * Kullanici firstname kutucuguna tiklar
    * Kullanici bos alana tiklar
    * Kullanici firstname kutucugunun bos olup olmadigini dogrular
    And Kullanici sayfayi kapatir
  @TC004 @SmokeTest
  Scenario Outline: Herhangi bir karakter içeren ve boş bırakılamayan geçerli bir LastName  olmalıdır
    * Kullanici lastname kutucuguna tiklar
    * Kullanici lastname kutucuguna sembolik karakter iceren "<soyisim>" girer
    * Kullanici hata metni goruldugunu dogrular
    And Kullanici sayfayi kapatir
    Examples:|soyisim|
    |ali*|
  @TC004_1 @SmokeTest
  Scenario:Lastname kutucugunun bos olup olmadigini dogrular
    * Kullanici lastname kutucuguna tiklar
    * Kullanici bos alana tiklar
    * Kullanici lastname kutucugunun bos olup olmadigini dogrular
    And Kullanici sayfayi kapatir