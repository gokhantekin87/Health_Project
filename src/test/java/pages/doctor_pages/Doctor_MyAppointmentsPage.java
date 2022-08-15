package pages.doctor_pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Doctor_MyAppointmentsPage {

   public Doctor_MyAppointmentsPage(){PageFactory.initElements(Driver.getDriver(),this);}

        @FindBy(xpath = "//a[@aria-haspopup='true']")
        public WebElement accountButton;

        @FindBy(xpath = "//a[@class='dropdown-item']")
        public WebElement signInButton;

        @FindBy(xpath ="//input[@name='username']")
        public WebElement usernameBox;

        @FindBy(xpath = "//input[@name='password']")
        public WebElement passwordBox;

        @FindBy(xpath = "//button[@type='submit']")
        public WebElement sign2Button;

        @FindBy(xpath = "//a[@aria-haspopup='true']")
        public WebElement myPagesButton;

        @FindBy(xpath = "//a[@class='dropdown-item']")
        public WebElement myAppointmentButton;


        @FindBy(xpath = "//input[@id='fromDate']")
        public WebElement fromBox;


        @FindBy(xpath = "//input[@id='toDate']")
        public WebElement toBox;

        @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
        public WebElement randevuEditButton;

        @FindBy(xpath = "//select[@id='appointment-status']")
        public WebElement statüsBox;

        @FindBy(xpath = "//option[@value='PENDING']")
        public WebElement statusPending;
    @FindBy(xpath = "//option[@value='COMPLETED']")
    public WebElement statusCompleted;
    @FindBy(xpath = "//option[@value='CANCELLED']")
    public WebElement statusCancelled;
    //option[@value='PENDING']COMPLETED
    //option[@value='COMPLETED']
    //option[@value='CANCELLED']

        @FindBy(xpath = "//div[@class='invalid-feedback']")
        public WebElement invalidFeedbackBox;

        @FindBy(xpath = "//textarea[@name='anamnesis']")
        public WebElement anamnesisBox;

     @FindBy(xpath = "(//div[@class='text-danger form-group'])[2]")
     public WebElement anamnesisHataBox;


        @FindBy(xpath = "//textarea[@name='treatment']")
        public WebElement treatmentBox;

     @FindBy(xpath = "(//div[@class='text-danger form-group'])[4]")
     public WebElement treatmentHataBox;


        @FindBy(xpath = "//textarea[@name='diagnosis']")
        public WebElement diagnosisBox;

     @FindBy(xpath = "(//div[@class='text-danger form-group'])[5]")
     public WebElement diagnosisHataBox;


        @FindBy(xpath = "//textarea[@name='prescription']")
        public WebElement prescriptionBox;

        @FindBy(xpath = "//textarea[@name='description']")
        public WebElement descriptionBox;

       // @FindBy(xpath = "//button[@type='submit']")
        //public WebElement saveButton;
        @FindBy(xpath = "//button[@id='save-entity']")
      public WebElement save;


        @FindBy(xpath = "//div[@role='alert']")
        public WebElement createAppointOnayButton;


        @FindBy(xpath = "//a[@class='btn btn-success btn-sm']")
        public WebElement testRequestButton;

        @FindBy(xpath = "//input[@id='132791']")
        public WebElement glucoseButton;

        @FindBy(xpath = "//input[@id='1402']")
        public WebElement ureaButton;

        @FindBy(xpath = "//input[@id='1403']")
        public WebElement creatinineButton;

        @FindBy(xpath = "//input[@id='1404']")
        public WebElement sodiumButton;

        @FindBy(xpath = "//input[@id='1405']")
        public WebElement potasiumButton;

        @FindBy(xpath = "//input[@id='1406']")
        public WebElement totalProteinButton;

        @FindBy(xpath = "//input[@id='1407']")
        public WebElement albuminButton;

        @FindBy(xpath = "//input[@id='1408']")
        public WebElement hemoglobinButton;

        @FindBy(xpath = "//button[@id='save-entity']")
        public WebElement testSaveButton;

        @FindBy(xpath = "//div[@class='Toastify__toast-body']")
        public WebElement testSaveOnayButton;

        @FindBy(xpath = "//tbody//tr[1]//td[1]")
        public WebElement hastaId;

        @FindBy(xpath = "//tbody//tr[1]//td[2]")
        public WebElement startDateTime;

        @FindBy(xpath = "//tbody//tr[1]//td[3]")
        public WebElement endDateTime;

        @FindBy(xpath = "//tbody//tr[1]//td[4]")
        public WebElement Status;

        @FindBy(xpath = "//tbody//tr[1]//td[11]")
        public WebElement physician;

        @FindBy(xpath = "//tbody//tr[1]//td[12]")
        public WebElement patient;


//div[@role='alert'] kaydınız basarılı
    //button[@id='save-entity'] tahlil save
    //div[@role='alert']

    }

