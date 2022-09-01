@E2E

Feature:US22 Hasta Test sonuçları (Staff)
Scenario:US22 TC01 Kullanıcı (Staff) hastanın SSN id ile arama yapabilir.
    * Kullanici "https://medunna.com/" adresine gider
    * Kullanici sag ustteki adam ikonuna tiklar
    * Kullanici Sign in e tiklar
    * Kullanici username ve password girer
    * Kullanici Sign in butonuna tiklar
    * Kullanici My PAGES yazisina tiklar
    * kullanici Search Patient yazisina tiklar
    * Kullanici Patient SSN kutucuguna SSN girer
    * Kullanici assagidaki listede hastanin ciktigini test eder
  And sayfayi kapatir

 Scenario:US22 TC02 kullanıcı (Staff) test sonuçlarını görebilmelidir.
    * Kullanici "https://medunna.com/" adresine gider
    * Kullanici sag ustteki adam ikonuna tiklar
    * Kullanici Sign in e tiklar
    * Kullanici username ve password girer
    * Kullanici Sign in butonuna tiklar
    * Kullanici My PAGES yazisina tiklar
    * kullanici Search Patient yazisina tiklar
    * Kullanici  sayfadaki Show Appointments kismina tiklar
    * Kullanici sayfadaki Show Tests kismina tiklar
    * Kullanici No Tests found yazisinin gorundugunu test eder
   And sayfayi kapatir


  Scenario:US22 TC03 Kullanıcı "ID, Date, Result, description, Created date" vb. sonuç bilgilerini görebilmeli ve
  güncelleyebilmelidir.
    * Kullanici "https://medunna.com/" adresine gider
    * Kullanici sag ustteki adam ikonuna tiklar
    * Kullanici Sign in e tiklar
    * Kullanici username ve password girer
    * Kullanici Sign in butonuna tiklar
    * Kullanici My PAGES yazisina tiklar
    * kullanici Search Patient yazisina tiklar
    * Kullanici  sayfadaki Show Appointments kismina tiklar
    * Kullanici sayfadaki Show Tests kismina tiklar
 #   * Kullanici View Results butonuna tiklar
 #   * Kullanici ID-Result gordugunu tets eder
    And sayfayi kapatir
