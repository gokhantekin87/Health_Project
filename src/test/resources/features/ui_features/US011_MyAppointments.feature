Feature US011 "My Appointments" Physician (Doctor) tarafindan duzenlenebilmeli

Scenario US011 TC001 "Create or Edit an Appointment" alanı doktor tarafından düzenlenebilmeli


 Given Doktor Medunna url'sine gider
 Then Doktor "account menü" yü tıklar
Doktor giriş seçeneğini tıklar
Doktor kullanıcı bilgilerini girer ve  giriş yapar
Sayfalarım bölümünden  "randevularım" ı secer
Doktor randevuda "edit" butonunu tıklar
Doktor "anamnesis", "treatment" ve "diagnosis" alanlarını doldurur
Doktor randevuyu kaydeder
Doktor "Kaydınız başarılı" mesajını görür