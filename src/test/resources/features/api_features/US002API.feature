
@US02_API
Feature:kullanici adı API kullanelarak dogrulanmalidir

  @Api @ApiAyhan
  Scenario Outline: TC00205  bir hesapla Api kullanarak e-postayı doğrulayın

    Given Kullanici API icin path paramslari set eder
    And kullanici beklenen datalari girer
    And kullanici "<username>","<password>" ile istek gönderir ve cevap alir
    Then kullanici "<email>" Api ile kayitlari doğrular

    Examples:

      |username| password| email|
      |userayhan|userayhan123|userayhan@gmail.com|

  @Api @ApiAyhan
  Scenario Outline: TC00206 Verify email using Api by non-activated account

    Given Kullanici API icin path paramslari set eder
    And kullanici beklenen datalari girer
    And kullanici "<username>","<password>" ile istek gönderir ve cevap alir
    Then kullanici eposta kayitlarinin bos oludugunu dogrular

    Examples:

      |username| password|
      |ayhan571|ayhan571|
