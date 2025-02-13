package org.amex.assignment.objects;

public class User {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String phoneNumber;
    private String email;


   


    public User(){}

    public User(String firstName, String lastName, String dateOfBirth, String phoneNumber,
                          String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getdateOfBirth() {
        return dateOfBirth;
    }

    public User setdateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getphoneNumber() {
        return phoneNumber;
    }

    public User setphoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setemail(String email) {
        this.email = email;
        return this;
    }

}
