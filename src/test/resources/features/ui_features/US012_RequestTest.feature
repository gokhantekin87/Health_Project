Feature: Physician (Doktor) test isteyebilmel (My Appointments/Edit/Request A Test)

  Scenario: US012 TC001 Doctor içeriğinde "Glucose, Urea, Creatinine, Sodium
  Potassium, Total protein, Albumin, Hemoglobin" olan test isteyebilmeli
    And Doktor randevuda edit butonunu tiklar
    And Doktor Requeest a test butonunu tıklar
    And Doktor Glucose, Urea, Creatinine, Sodium,Potassium, Total protein, Albumin, Hemoglobin  butonlarını tıklar
    And Doktor randevuyu kaydeder
    Then Doktor 'Kaydiniz basarili' mesajini görür
    And Doktor sayfayi kapatir