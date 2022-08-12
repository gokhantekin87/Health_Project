Feature: US009 Staff, hasta bilgilerini gorebilmeli, duzenleyebilmeli ve silebilmelidir

Scenario: US009 TC001 Staff "My Pages" sekmesinden hasta bilgilerini gorebilmelidir
    Given kullanici medunna anasayfasinda
    Then kullanici "staffUsername" ve "staffPassword" girerek giris yapar
    And My Pages sekmesinden Search Patient tiklar
    Scenario Outline: TC_001 No_02
        Then Tabloda "<patient info>" gorunur oldugunu dogrular
        Examples:
        | patient info |
        |16563         |
        |456-87-1234   |
        |Hasta         |
        |Team59        |
        |123-123-1234  |
        |dokunma@gmail.com|
        |team59 hause     |
        |team59 patient   |
        |hy               |
        |Moldova, Republic of |


#Scenario: US_009 TC_004 Staff hastalari silememeli
        #Then Staff Patient View sayfasinda Delete butonu olmadigini dogrular


Scenario: US_009 TC_005 Staff hastalari SSN numarasina gore arayabilir
        And Staff arama cubuguna SSN numarasi "123-78-9871" girer
        Then Sonucun aranan SSN numarasi icerdigini "123-78-9871" dogrular


Scenario: US_009 TC_006 Staff SSN numarasina gore yeni bir basvuru sahibi arayabilmeli
          ve tum kayit bilgilerinin dolduruldugunu gorebilmelidir
        And Staff arama cubuguna SSN numarasi "123-78-9871" girer
        And Show Appointment butonuna tiklar
        Then Appointments tablosunda kayit bilgilerini icerdigini dogrular


#Scenario: US_009 TC_002 Staff butun hasta bilgilerini: id, firstname, lastname, birthdate, email, phone,
#          gender, blood group, address,description, user, country and state/city" duzenleyebilmelidir
#        When Staff Edit butonuna tiklar
#        And Staff Gender, Blood Group, User, Country, State City duzenler
#        Scenario Outline: TC_002 No:02
#        And Staff "<patient info>" duzenler ve "<test data>" girer
#        Examples:
#        | patient info       | test data       |
#        |patient-id          |deneme           |
#        |patient-firstName   |deneme           |
#        |patient-lastName    |deneme           |
#        |patient-birthDate   |12345678910111   |
#        |email               |deneme@gmail.com |
#        |patient-phone       |123-123-1234     |
#        |patient-adress      |deneme           |
#        |patient-description |deneme           |
#        Scenario: TC_002 No:03
#        Then Staff Save butonuna tiklar
#        And Acilan sayfada duzenlemeler kaydedildimi dogrular


Scenario: US_009 TC_003 Staff herhangi bir hasta bilgisini silebir
        Given kullanici medunna anasayfasinda
        And My Pages sekmesinden Search Patient tiklar
        When Staff Edit butonuna tiklar
        Then Staff hasta bigilerini siler ve kaydeder
        And  Staff duzenleme kaydedildi mi dogrular