package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

   public class Messages {

    /*

  {
    "email": "string",
    "id": 0,
    "message": "string",
    "name": "string",
    "subject": "string"
  }
     */

    private Integer id;
    private String email;
    private String message;
    private String name;
    private String subject;

 public void setId(Integer id) {
  this.id = id;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public void setMessage(String message) {
  this.message = message;
 }

 public void setName(String name) {
  this.name = name;
 }

 public void setSubject(String subject) {
  this.subject = subject;
 }

 public Integer getId() {
  return id;
 }

 public String getEmail() {
  return email;
 }

 public String getMessage() {
  return message;
 }

 public String getName() {
  return name;
 }

 public String getSubject() {
  return subject;
 }

 @Override
 public String toString() {
  return "Messages{" +
          "id=" + id +
          ", email='" + email + '\'' +
          ", message='" + message + '\'' +
          ", name='" + name + '\'' +
          ", subject='" + subject + '\'' +
          '}';
 }
}




