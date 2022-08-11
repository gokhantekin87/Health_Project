Feature: US011 "My Appointments" Physician (Doctor) tarafindan duzenlenebilmeli

  Scenario: US011 TC001 "Create or Edit an Appointment" alanı doktor tarafından düzenlenebilmeli


    Given Doktor Medunna url'sine gider
    When Doktor "account menu" yu tiklar
    And Doktor giris secenegini tiklar
    And Doktor kullanici bilgilerini girer ve  giris yapar
    And Sayfalarim bolumunden  "randevularim" i secer
    And Doktor randevuda "edit" butonunu tiklar
    And Doktor "anamnesis", "treatment" ve "diagnosis" alanlarini doldurur
    And Doktor randevuyu kaydeder
    Then Doktor "Kaydiniz basarili" mesajini görür




