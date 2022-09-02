@E2E
Feature: US015 API validation / Get Patient

  Scenario: US015 TC001 Admin hasta bilgilerini gorur

    Given Admin hasta bilgisi icin get request yapar
    And Admin hasta bilgilerini deserialize eder
    Then Admin hasta bilgilerini dogrular