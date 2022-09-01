package stepdefinitions.api_stepdefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.US_007.Appointment;
import pojos.US_007.AppointmentRequest;
import utilities.ConfigReader;


import java.io.IOException;

import static io.restassured.RestAssured.given;

public class US_007RandevuOlusturmaAPI {


    static AppointmentRequest appointmentRequest =new AppointmentRequest();
    static Faker faker = new Faker();
    static Response response;
    static public Appointment appointment;

    public static RequestSpecification spec;
    //static Patient patient = new Patient();

//Ekleme yapildi


        //Body
    //"appoSpeciality": "string",
    //  "birthDate": "2022-04-16T12:52:30.875Z",
    //  "email": "addsdsds@gmail.com",
    //  "firstName": "ar",
    //  "gender": "fd",
    //  "lastName": "hgh",
    //  "phone": "5748394343",
    //  "snumber": "322",
    //  "ssn": "384-34-3254",
    //  "startDate": "2022-04-16"




        //Response

    //{
    //    "createdBy": "anonymousUser",
    //    "createdDate": "2022-08-13T08:16:40.229812Z",
    //    "id": 184275,
    //    "startDate": "2022-08-08T00:00:00Z",
    //    "endDate": "2022-08-08T01:00:00Z",
    //    "status": "UNAPPROVED",
    //    "anamnesis": null,
    //    "treatment": null,
    //    "diagnosis": null,
    //    "prescription": null,
    //    "description": null,
    //    "physician": null,
    //    "patient": {
    //        "createdBy": "anonymousUser",
    //        "createdDate": "2022-08-13T08:16:40.229601Z",
    //        "id": 181338,
    //        "firstName": "ahmet",
    //        "lastName": "hasan",
    //        "birthDate": null,
    //        "phone": "5743334343",
    //        "gender": null,
    //        "bloodGroup": null,
    //        "adress": null,
    //        "email": "von.hoeger@yahoo.com",
    //        "description": null,
    //        "user": {
    //            "createdBy": "anonymousUser",
    //            "createdDate": "2022-08-13T08:16:40.229232Z",
    //            "id": 183380,
    //            "login": "user_112233445_56677889991660378600127",
    //            "firstName": "ahmet",
    //            "lastName": "hasan",
    //            "email": "von.hoeger@yahoo.com",
    //            "activated": false,
    //            "langKey": null,
    //            "imageUrl": null,
    //            "resetDate": null,
    //            "ssn": "269-29-5355"
    //        },
    //        "inPatients": [
    //
    //        ],
    //        "country": null,
    //        "cstate": null
    //    },
    //    "ctests": [
    //
    //    ]
    //}
    //





    public static void main(String[] args) throws IOException {

        String ssn = "668-83-4231";
        String firstName = "Abdullah";
        String lastName ="oktay";





        String appoSpecialitySetData = "I dont know";
        String emailSetData = faker.internet().emailAddress();      //  aynı email ile kaydolmadan tekrar başvuru yapmaya çalışınca500 hatas
        String firstNameSetData = "ahmet";                          //
        String genderSetData = "Female";
        String lastNameSetData = "hasan";                           //
        String phoneSetData = "5743334343";                         //
        String sNumberSetData = "951";
        String ssnSetData = faker.idNumber().ssnValid();            //
        String starDateSetData = "2022-08-08";                      //
        System.out.println("starDateSetData = " + starDateSetData);
        System.out.println("emailSetData = " + emailSetData);


        appointmentRequest.setAppoSpeciality(appoSpecialitySetData);
        appointmentRequest.setEmail(emailSetData);
        appointmentRequest.setFirstName(firstNameSetData);
        appointmentRequest.setGender(genderSetData);
        appointmentRequest.setLastName(lastNameSetData);
        appointmentRequest.setPhone(phoneSetData);
        appointmentRequest.setSnumber(sNumberSetData);
        appointmentRequest.setSsn(ssnSetData);
        appointmentRequest.setStartDate(starDateSetData);

        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("anaSayfa")).build();

        //https://medunna.com/api/appointments/request
        spec.pathParams("first", "api", "second", "appointments", "third", "request");

        response = given().spec(spec).contentType(ContentType.JSON).body(appointmentRequest).when().post("/{first}/{second}/{third}");
        response.prettyPrint();

        response.then().assertThat().statusCode(201);


        ObjectMapper ob = new ObjectMapper();
         appointment = ob.readValue(response.asString(), Appointment.class);
         //appointment = response.as(Appointment.class) // şeklinde de yapılabilir
        //appointment.toString();

        Assert.assertEquals(appointmentRequest.getEmail(), appointment.getPatient().getEmail());
        Assert.assertEquals(appointmentRequest.getFirstName(), appointment.getPatient().getFirstName());
        Assert.assertEquals(appointmentRequest.getLastName(), appointment.getPatient().getLastName());
        Assert.assertEquals(appointmentRequest.getPhone(), appointment.getPatient().getPhone());
        //Assert.assertEquals(appointmentRequest.getSsn(), appointment.getPatient().getUser().getSsn());
        Assert.assertEquals(appointmentRequest.getStartDate() + "T00:00:00Z", appointment.getStartDate());

    }

    @Given("Kayitsiz kullanici olarak set path params girilir")
    public void kayitsiz_kullanici_olarak_set_path_params_girilir() {

        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("anaSayfa")).build();

        //https://medunna.com/api/appointments/request
        spec.pathParams("first", "api", "second", "appointments", "third", "request");



    }
    @Given("Kayitsiz kullanici olarak  firstName, LastName, SSN, Email,Phone, Appointment DateTime kayit bilgilerini girilir")
    public void kayitsiz_kullanici_olarak_first_name_last_name_ssn_email_phone_appointment_date_time_kayit_bilgilerini_girilir() {

        String appoSpecialitySetData = "I dont know";
        String emailSetData = faker.internet().emailAddress();      //  aynı email ile kaydolmadan tekrar başvuru yapmaya çalışınca500 hatas
        String firstNameSetData = "ahmet";                          //
        String genderSetData = "Female";
        String lastNameSetData = "hasan";                           //
        String phoneSetData = "5743334343";                         //
        String sNumberSetData = "951";
        String ssnSetData = faker.idNumber().ssnValid();            //
        String starDateSetData = "2022-08-08";                      //
        System.out.println("starDateSetData = " + starDateSetData);
        System.out.println("emailSetData = " + emailSetData);


        appointmentRequest.setAppoSpeciality(appoSpecialitySetData);
        appointmentRequest.setEmail(emailSetData);
        appointmentRequest.setFirstName(firstNameSetData);
        appointmentRequest.setGender(genderSetData);
        appointmentRequest.setLastName(lastNameSetData);
        appointmentRequest.setPhone(phoneSetData);
        appointmentRequest.setSnumber(sNumberSetData);
        appointmentRequest.setSsn(ssnSetData);
        appointmentRequest.setStartDate(starDateSetData);


    }

    @Then("Respond alinarak kaydin server uzerinde yapildigi kontrol edilir")
    public void respond_alinarak_kaydin_server_uzerinde_yapildigi_kontrol_edilir() throws IOException {

        response = given().spec(spec).contentType(ContentType.JSON).body(appointmentRequest).when().post("/{first}/{second}/{third}");

        response.then().assertThat().statusCode(201);
        ObjectMapper ob = new ObjectMapper();
        appointment = ob.readValue(response.asString(), Appointment.class);



        //for DB test

    }
    @Then("Expected Data ile Actual Data verileri ayni olmasi gerekmektedir")
    public void expected_data_ile_actual_data_verileri_ayni_olmasi_gerekmektedir() {

        Assert.assertEquals(appointmentRequest.getEmail(), appointment.getPatient().getEmail());
        Assert.assertEquals(appointmentRequest.getFirstName(), appointment.getPatient().getFirstName());
        Assert.assertEquals(appointmentRequest.getLastName(), appointment.getPatient().getLastName());
        Assert.assertEquals(appointmentRequest.getPhone(), appointment.getPatient().getPhone());
        //Assert.assertEquals(appointmentRequest.getSsn(), appointment.getPatient().getUser().getSsn());
        Assert.assertEquals(appointmentRequest.getStartDate() + "T00:00:00Z", appointment.getStartDate());

    }



}



