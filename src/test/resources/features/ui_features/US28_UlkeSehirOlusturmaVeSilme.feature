@E2E
Feature:US28 Admin yeni ulke, eyalet ve sehir olusturup silebilir


  Scenario Outline:US28 TC01 Admin yeni bir ulke olusturabilir
    Given admin siteye gider
    And admin account dropdown menuye tiklar
    And admin sign in butona tiklar
    And admin username "<username>" ve password "<password>" girer
    And admin sign in sayfasinda sign in butona tiklar
    And admin admin sayfasini goruntuler
    And admin items and titles dropdowna tiklar
    And admin country buttona tiklar
    And admin countries sayfasini goruntuler
    And admin create a new Country buttona tiklar
    And admin ulke ismini girer "<Sri Lanka>"
    And admin Save buttona tiklar
    And admin a new country is created with identifier mesajini goruntuler
    Then admin driveri kapatir

    Examples:
      | username     | password |
      | bergin       | ABCDEF   |



  Scenario Outline: US28 TC02 Admin bir ulke olusturup silebilir
    Given admin siteye gider
    And admin account dropdown menuye tiklar
    And admin sign in butona tiklar
    And admin username "<username>" ve password "<password>" girer
    And admin sign in sayfasinda sign in butona tiklar
    And admin items and titles dropdowna tiklar
    And admin country buttona tiklar
    And admin create a new Country buttona tiklar
    And admin yeni ulke ismini girer "<Gine Conakry>"
    And admin Save buttona tiklar
    And admin bir ulke secer
    And admin delete buttona tiklar
    And admin silme uyarisini gorur
    And admin a country is deleted with identifier yazisini goruntuler
    Then admin driveri kapatir

    Examples:
      | username     | password |
      | bergin       | ABCDEF   |



  Scenario Outline:US28 TC03 Admin eyalet ve sehir olusturabilmelidir, ancak olusturamaz
    Given admin siteye gider
    And admin account dropdown menuye tiklar
    And admin sign in butona tiklar
    And admin username "<username>" ve password "<password>" girer
    And admin sign in sayfasinda sign in butona tiklar
    And admin items and titles dropdowna tiklar
    And admin states and cities buttona tiklar
    And admin crete a new StateCity buttona tiklar
    And admin bir StateCity ismi girer "<stateCity>"
    And admin bir ulkeye tiklar "<country>"
    And admin Save buttona tiklar
    And admin Field translation-not-found[hospitalmsappfrontendApp.CState.country] cannot be empty! mesajini BUG olarak gorur
    Then admin driveri kapatir
    Examples:
      | username     | password | stateCity | country   |
      | bergin       | ABCDEF   | Kutahya   | Turkiye   |