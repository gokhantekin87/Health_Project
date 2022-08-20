Feature: Hasta Test sonuçları (Staff)
Scenario: Kullanıcı (Staff) hastanın SSN id ile arama yapabilir.
    * Kullanici "https://medunna.com/" adresine gider
    * Kullanici sag ustteki adam ikonuna tiklar
    * Kullanici Sign in e tiklar
    * Kullanici username ve password girer
    * Kullanici Sign in butonuna tiklar
    * Kullanici My PAGES yazisina tiklar
    * kullanici Search Patient yazisina tiklar
    * Kullanici Patient SSN kutucuguna SSN girer
    * Kullanici assagidaki listede hastanin ciktigini test eder
 Scenario:kullanıcı (Staff) test sonuçlarını görebilmelidir.
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
  Scenario:Kullanıcı "ID, Date, Result, description, Created date" vb. sonuç bilgilerini görebilmeli ve
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
    * Kullanici View Results butonuna tiklar
    * Kullanici ID-Result gordugunu tets eder
