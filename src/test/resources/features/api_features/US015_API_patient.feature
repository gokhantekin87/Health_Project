Feature: Get Patient

  Scenario: Admin hasta bilgilerini gorur

    Given Admin hasta bilgisi icin get request yapar
    And Admin hasta bilgilerini deserialize eder
    Then Admin hasta bilgilerini dogrular