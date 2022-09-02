package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Staff {

    /*
 {
{
  "adress": "string",
  "birthDate": "2022-08-28T23:35:24.820Z",
  "bloodGroup": "Apositive",
  "country": {
    "id": 0,
    "name": "string"
  },
  "createdBy": "string",
  "createdDate": "2022-08-28T23:35:24.820Z",
  "cstate": {
    "country": {
      "id": 0,
      "name": "string"
    },
    "id": 0,
    "name": "string"
  },
  "description": "string",
  "firstName": "string",
  "gender": "MALE",
  "id": 0,
  "lastName": "string",
  "phone": "string",
  "ssn": "189-04-8169",
  "user": {
    "activated": true,
    "createdBy": "string",
    "createdDate": "2022-08-28T23:35:24.820Z",
    "email": "string",
    "firstName": "string",
    "id": 0,
    "imageUrl": "string",
    "langKey": "string",
    "lastName": "string",
    "login": "string",
    "resetDate": "2022-08-28T23:35:24.820Z",
    "ssn": "430-39-4322"
  }
}
 */

    private String adress;
    private int id;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
