https://github.com/JasminaArslanova/health_project_team59.gitFeature: Staff hastalar için randevuları görür
  Scenario:Kullanıcı (Staff) hastanın SSN id ile arama yapabilir.
  * Kullanici  "https://medunna.com/" adresine gider
  * Kullanici sag ustteki adam ikonuna tiklar
  * Kullanici Sign in e tiklar
  * Kullanici username ve password girer
  * Kullanici 'Sign in' butonuna tiklar
  * Kullanici My PAGES yazisina tiklar
  * kullanici Search Patient a tiklar
  * Kullanici sayfadaki Show Appointments kismina tiklar
  * Kullanici sayfadaki Edit kismina tiklar
  * Kullanici sayfadaki Create or an Appointment yazisinin gorunurlugunu test eder
  Scenario: Staff hasta durumunu (status) "UNAPPROVED, PENDING veya CANCELLED" yapabilmeli ancak "COMPLETED" yapamamalı.
    * Kullanici  "https://medunna.com/" adresine gider
    * Kullanici sag ustteki adam ikonuna tiklar
    * Kullanici Sign in e tiklar
    * Kullanici username ve password girer
    * Kullanici 'Sign in' butonuna tiklar
    * Kullanici My PAGES yazisina tiklar
    * kullanici Search Patient a tiklar
    * Kullanici sayfadaki Show Appointments kismina tiklar
    * Kullanici sayfadaki Edit kismina tiklar
    * Kullanici statusde UNAPPROVED, PENDING veya CANCELLED yapabildigini ancak COMPLETED yapamadigini test eder
  Scenario: Staff "Anamnesis (Hastalık Geçmişi), Treatment ( Tedavi) veya Diagnosis(Teşhis)" kısımlarına girmemeli.
    * Kullanici  "https://medunna.com/" adresine gider
    * Kullanici sag ustteki adam ikonuna tiklar
    * Kullanici Sign in e tiklar
    * Kullanici username ve password girer
    * Kullanici 'Sign in' butonuna tiklar
    * Kullanici My PAGES yazisina tiklar
    * kullanici Search Patient a tiklar
    * Kullanici sayfadaki Show Appointments kismina tiklar
    * Kullanici sayfadaki Edit kismina tiklar
    * Kullanici Kullanici Anamnesis e giris yapilmadigini test eder
    * Kullanici Treatment e giris yapilmadigini test eder
    * Kullanici Diagnosis e giris yapilmadigini test eder
  Scenario: Hasta için gerekli doktoru seçebilmeli ve randevuyu oluşturmalı.
    * Kullanici  "https://medunna.com/" adresine gider
    * Kullanici sag ustteki adam ikonuna tiklar
    * Kullanici Sign in e tiklar
    * Kullanici username ve password girer
    * Kullanici 'Sign in' butonuna tiklar
    * Kullanici My PAGES yazisina tiklar
    * kullanici Search Patient a tiklar
    * Kullanici sayfadaki Show Appointments kismina tiklar
    * Kullanici sayfadaki Edit kismina tiklar
    * Kullanici doktor secebilmeli
    * Kullanici save tusuna basar