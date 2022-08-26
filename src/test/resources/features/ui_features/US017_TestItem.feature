Feature: US017 Test Item

  Scenario: US016 TC000 admin room sayfasini dogrular
    Given kullanici medunna anasayfasinda
    Then kullanici "us16Username" ve "us16Password" girerek giris yapar
    And admin Test Items sayfasina gecis yapar
    Then url nin "test-item" icerdigini dogrular
    Then basligin "Test Items" icerdigini dogrular
    And tablo da "ID" "Name" "Description" "Price" "Default Min. Value" "Default Max. Value" "Created Date" basliklarinin gorunur oldugunu dogrular
    And Create a new Room butonunun erisilebilir ve gorunur oldugunu dogrular
    And sayfayi kapatir