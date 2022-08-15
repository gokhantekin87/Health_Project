Feature: US011 "My Appointments" Physician (Doctor) tarafindan duzenlenebilmeli

  Background:
    Given Doktor medunnaUrl ine gider
    When Doktor accountButton u tiklar
    And Doktor sign in secenegini tiklar
    And Doktor doktorKullaniciAdi girer
    And Doktor 1 saniye bekler
    And doktor doktorKullaniciSifre girer
    And Doktor giris icin sign in  tiklar
    And Doktor 1 saniye bekler
    And Sayfalarim bolumunden  randevularim i secer
    And Doktor from bolumune baslangic tarihi girer
    And Doktor to bolumune bitis tarihi girer

  Scenario: US011 TC001 "Create or Edit an Appointment" alanı doktor tarafından düzenlenebilmeli


    And Doktor randevuda edit butonunu tiklar
    And Doktor anamnesis, treatment ve diagnosis alanlarini doldurur

    And Doktor randevuyu kaydeder
    And Doktor 1 saniye bekler
    Then Doktor 'Kaydiniz basarili' mesajini görür
    And Doktor sayfayi kapatir

    Scenario: US011 TC002 Bir randevu güncellendiğinde; kullanıcı (doktor), hastanın aşağıdaki bilgilerini görmelidir

    And Doktor randevuda edit butonunu tiklar
    And Doktor anamnesis, treatment ve diagnosis alanlarini doldurur
    And Doktor randevuyu kaydeder
    Then Doktor hastanin id, start date time, end date time, Statüs, physician, patient bilgilerini görmelidir
    And Doktor sayfayi kapatir

  Scenario: US011 TC003 Doktor Anamnesis, Treatment ve Diagnosis alanlarını doldurmak zorundadır

    And Doktor randevuda edit butonunu tiklar
    And Doktor anamnesis kutusunu siler

    And Doktor treatment kutusunu siler

    And Doktor diagnosis kutusunu siler
    And Doktor randevuyu kaydeder
    Then Doktor anamnesis kutusunun uyari verdigini görür
    Then Doktor treatment kutusunun uyari verdigini görür
    Then Doktor diagnosis kutusunun uyari verdigini görür

    And Doktor sayfayi kapatir

    Scenario: US011 TC004 Doktorun "prescription ve description" bölümlerini doldurmasi isteğe bağlı olmalıdır.
    And Doktor randevuda edit butonunu tiklar
    And Doktor anamnesis, treatment ve diagnosis alanlarini doldurur
    And Doktor prescription ve description alanlarini siler
    And Doktor randevuyu kaydeder
    Then Doktor 'Kaydiniz basarili' mesajini görür

      And Doktor sayfayi kapatir
  Scenario: US011 TC005 "Status" doktor tarafından "PENDING, COMPLETED veya CANCELLED" olarak seçilebilmeli
    And Doktor randevuda edit butonunu tiklar
    And Doktor statüs kutusunda pending secer
    And Doktor statüs kutusunda pending yazisini gorur
    And Doktor statüs kutusunda completed secer
    And Doktor statüs kutusunda completed yazisini gorur
    And Doktor statüs kutusunda cancelled secer
    And Doktor statüs kutusunda cancelled yazisini gorur
    And Doktor sayfayi kapatir

  Scenario: US012 TC001 Doctor içeriğinde "Glucose, Urea, Creatinine, Sodium
  Potassium, Total protein, Albumin, Hemoglobin" olan test isteyebilmeli
    And Doktor "Requeest a test" butonunu tıklar
    And Doktor Glucose, Urea, Creatinine, Sodium,Potassium, Total protein, Albumin, Hemoglobin  butonlarını tıklar
    And Doktor randevuyu kaydeder
    Then Doktor 'Kaydiniz basarili' mesajini görür
    And Doktor sayfayi kapatir