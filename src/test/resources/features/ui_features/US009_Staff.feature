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
        |420-07-1110   |
        |Hasta         |
        |Team59        |
        |12/08/57 12:08|
        |123-123-1234  |
        |dokunma@gmail.com|
        |FEMALE           |
        |AB+              |
        |team59 hause     |
        |team59 patient   |
        |hy               |
        |Moldova, Republic of |

        Scenario: US_009 TC_002









