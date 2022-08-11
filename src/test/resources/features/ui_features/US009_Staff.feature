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

Scenario: US_009 TC_002 Staff butun hasta bilgilerini: id, firstname, lastname, birthdate, email, phone,
          gender, blood group, address,description, user, country and state/city" duzenleyebilmelidir
    When Staff Edit butonuna tiklar
    And Staff Gender, Blood Group, User, Country, State City duzenler

    Scenario Outline: TC_002 No:02
        And Staff "<patient info>" duzenler ve "<test data>" girer
        Examples:
        | patient info       | test data       |
        |patient-id          |deneme           |
        |patient-firstName   |deneme           |
        |patient-lastName    |deneme           |
        |patient-birthDate   |12345678910111   |
        |email               |deneme@gmail.com |
        |patient-phone       |123-123-1234     |
        |patient-adress      |deneme           |
        |patient-description |deneme           |

    Scenario: TC_002 No:03
        Then Staff Save butonuna tiklar
        And Acilan sayfada duzenlemeler kaydedildimi dogrular


