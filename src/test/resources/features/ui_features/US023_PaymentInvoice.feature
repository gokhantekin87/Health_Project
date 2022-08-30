Feature: fatura olusturma
  @US23RT
  Scenario Outline:  Personel tarafından yapılan ödeme fatura işlemi

    Given kullinci medunna sayafasina gider
    Given kullanici kimlik bilgileriyle signs in klik yapar
    And kullanici my pages e klik yapar
    And kullanici patient arama butonuna klik yapar
    Then user searchs patient with SSN "<ssn>" in the search box
    Then kullanici appointment butonuna tiklar
    Then kullanicipatient's status tamamlandığını veya iptal edildiğini dogrular
    Then kullanici payment invoice process butonuna klik yapar
    And kullanici invoice pagede aşagındaki alanları görür
    And kullanici fatura oluşturma butonuna tiklar
    And kullanici kaydet butonuna tiklar
    And kullanici başarı mesajını dogrular
    And user search patient with SSN "<ssn>" in the search box again
    Then kullanıcı randevu göstere tıklar
    Then kullancı payment invoice için tekrar klik yapar
    And kullanıcı fatura göster butonuna klik yapar
    And kullanıcı invoice page i dogrular
    Examples: patient SSN id
      | ssn         |
      | 123-45-6786 |