@E2E
Feature:US018 API validation / Admin tum physician bilgilerini dogrular

  Scenario Outline:US018 TC001 admin physician bilgilerini get request ile alir ve dogrular
    Given kullanici physician bilgileri icin get request yapabilmeli
    Then kullanici hasta bilgilerini dogrular "<firstname>" "<lastname>" "<phone>" "<adress>" "<gender>"

    Examples:
      | firstname   | lastname |phone         | gender |  adress    |
      |Ahmetsda     | Arslan   | 765-888-0989 |FEMALE    |Kim bilir nerede9|


    # "<birthDate>"birthDate  |1999-12-31|      "<examFee>" examFee| 400.00  |      "<speciality>" speciality|PEDIATRICS|