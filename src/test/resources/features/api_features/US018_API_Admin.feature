@US018_API
Feature: Admin tum physician bilgilerini dogrular

  Scenario Outline:admin physician bilgilerini get request ile alir ve dogrular
    Given kullanici physician bilgileri icin get request yapabilmeli
    Then kullanici hasta bilgilerini dogrular "<firstname>" "<lastname>" "<phone>" "<adress>" "<gender>"

    Examples:
      | firstname   | lastname |phone         | gender |  adress    |
      |leylamecnun2| fuzuli   | 222-222-2222 |MALE |mumdan gemi|


    # "<birthDate>"birthDate  |1999-12-31|      "<examFee>" examFee| 400.00  |      "<speciality>" speciality|PEDIATRICS|