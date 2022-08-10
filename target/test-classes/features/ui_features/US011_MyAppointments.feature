Feature US011 "My Appointments" Physician (Doctor) tarafindan duzenlenebilmeli

Scenario US011 TC001 "Create or Edit an Appointment" alanı doktor tarafından düzenlenebilmeli


 Given Doktor Medunna url'sine gider
 Then Doktor "account menü" yü tıklar
And Doktor giriş seçeneğini tıklar
And Doktor kullanıcı bilgilerini girer ve  giriş yapar
And Sayfalarım bölümünden  "randevularım" ı secer
And Doktor randevuda "edit" butonunu tıklar
And Doktor "anamnesis", "treatment" ve "diagnosis" alanlarını doldurur
And Doktor randevuyu kaydeder
And Doktor "Kaydınız başarılı" mesajını görür