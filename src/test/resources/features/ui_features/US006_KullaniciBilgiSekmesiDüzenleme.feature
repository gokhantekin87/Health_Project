Feature: US006 kullanici bilgi sekmesi


    @TC01 @US006
        #Kullanıcı bilgileri "firstname, lastname, email and language" girerken doldurulan kullanıcı bilgileri olmalıdır.
    Scenario: Kullanıici bilgilerini düzenleyebilmeli
    Given kullanici medunna anasayfasinda
    And kullanici "patientUserNamed" ve "patientPasswordd" girerek giris yapar
    And kullanici adamIkonuna tiklar
    And kunnalici accountSettingse tıklar
    And kullanici savedButtonuna tıklar
    And kullanici SettingsSaved yazisini kontrol eder
    And sayfayi kapatir



  @tc02 @US006
        #"Firstname"güncelleme seçeneği olmalıdır.
  Scenario: FirstName güncelleme secenegi olamli
    Given kullanici medunna anasayfasinda
    And kullanici "patientUserNamed" ve "patientPasswordd" girerek giris yapar
    And kullanici adamIkonuna tiklar
    And kunnalici accountSettingse tıklar
    And kullanıcı firstName kutusuna "Poalt1" bilgi girer
    And kullanici savedButtonuna tıklar
    And kullanici SettingsSaved yazisini kontrol eder
    And sayfayi kapatir
    
    @tc03 @US006
          #"Lastname" güncelleme seçeneği olmalıdır.
  Scenario: LastName güncelleme secenegi olmalıdır
      Given kullanici medunna anasayfasinda
      And kullanici "patientUserNamed" ve "patientPasswordd" girerek giris yapar
      And kullanici adamIkonuna tiklar
      And kunnalici accountSettingse tıklar
      And kullanıcı lastName kutusuna "Alemdar1" bilgi girer
      And kullanici savedButtonuna tıklar
      And kullanici SettingsSaved yazisini kontrol eder
      And sayfayi kapatir
      
      @tc04 @US006
            #"E-mail" güncelleme seçeneği olmalıdır.
  Scenario: Email güncelleme secenegi olmalı
        Given kullanici medunna anasayfasinda
        And kullanici "patientUserNamed" ve "patientPasswordd" girerek giris yapar
        And kullanici adamIkonuna tiklar
        And kunnalici accountSettingse tıklar
        And kullanıcı eMail kutusuna "erkouzn1@gmail.com" bilgi girer
        And kullanici savedButtonuna tıklar
        And kullanici SettingsSaved yazisini kontrol eder
        And sayfayi kapatir
      
