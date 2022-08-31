@US27
 Feature: Messages by Admin Validate with API and DB

   Background:
     Given Admin Medunna Url'ine navigate yapar
     When Admin User Icona tıklar
     And Admin SignIn seceneğine tıklar



   @US027_TC01 @Smoke
     Scenario: Admin, mesaj portalına gidebilir ve tüm mesajları, yazarlarını ve e-postalarını görüntüleyebilir.
     And Admin geçerli username olarak "adminhlen41" girer
     And Admin geçerli password olarak "helen4141" girer
     And Admin signIn butonuna tıklar
     Then Admin Administration sayfasında olduğunu doğrular
     And Admin items and titles dropdownuna tıklar
     And Admin messages butonuna tıklar
     Then Admin messages sayfasının görüntülendiğini doğrular
     Then Admin tüm isimlerin, maillerin ve mesajların görüntülendiğini doğrular
     And Admin sayfayı kapatır


   @US027_TC02
     Scenario Outline: Admin, mesajları oluşturabilir
     And Admin geçerli username olarak "adminhlen41" girer
     And Admin geçerli password olarak "helen4141" girer
     And Admin signIn butonuna tıklar
     Then Admin Administration sayfasında olduğunu doğrular
     And Admin items and titles dropdownuna tıklar
     And Admin messages butonuna tıklar
     Then Admin messages sayfasının görüntülendiğini doğrular
     And Admin Create a new Message butonuna tıklar
     Then Admin Create or edit a message sayfasının görüntülendiğini doğrular
     And Admin name tex box'ına "<Name>" girer
     And Admin email tex box'ına "<Email>" girer
     And Admin subject tex box'ına "<Subject>" girer
     And Admin message tex box'ına "<Message>" girer
     And Admin save butonuna tıklar message olustur yada düzenle sayfasında
     Then Admin message oluşturma işleminin başarıyla tamamlandığını doğrular
     And Admin sayfayı kapatır

    Examples:
     |Name       | Email                |Subject      |Message                     |
     |Harun Bzkrt|hrun3939@hotmail.com  |Tıbbi bakım  |Hemsirelik hizmetleri iyilestirilmeli|

   @US027_TC03
     Scenario Outline: Admin, mesajları güncelleyebilir
     And Admin geçerli username olarak "adminhlen41" girer
     And Admin geçerli password olarak "helen4141" girer
     And Admin signIn butonuna tıklar
     Then Admin Administration sayfasında olduğunu doğrular
     And Admin items and titles dropdownuna tıklar
     And Admin messages butonuna tıklar
     Then Admin messages sayfasının görüntülendiğini doğrular
     And Admin messages sayfasında edit butonuna tıklar
     Then Admin Create or edit a message sayfasının görüntülendiğini doğrular
     And  Admin yeni name olarak "<Name>" girer
     And Admin yeni email olarak "<Email>" girer
     And Admin yeni subject olarak "<Subject>" girer
     And Admin yeni message olarak "<Message>" girer
     And Admin save butonuna tıklar message olustur yada düzenle sayfasında
     Then Admin mesajı değişikliği işleminin başarılı olduğunu görüntüler
     And Admin sayfayı kapatır

     Examples:
       |Name       | Email                |Subject      |Message                          |
       |Suzan Geny |szngenus@hotmail.com  |Memnuniyet   |Hizmet kalitesi daha iyi olabilir |


     @US027_TC04
     Scenario: Admin, mesajları silebilir
       And Admin geçerli username olarak "adminhlen41" girer
       And Admin geçerli password olarak "helen4141" girer
       And Admin signIn butonuna tıklar
       Then Admin Administration sayfasında olduğunu doğrular
       And Admin items and titles dropdownuna tıklar
       And Admin messages butonuna tıklar
       Then Admin messages sayfasının görüntülendiğini doğrular
       And Admin messages sayfasındaki delete butonuna tıklar
       Then Admin delete confirmation text'inin görüntülendiğini doğrular
       And Admin delete confirmation box'ındaki delete butonuna tıklar
       Then Admin silme işleminin başarılı olduğunu görüntüler
       And Admin sayfayı kapatır









