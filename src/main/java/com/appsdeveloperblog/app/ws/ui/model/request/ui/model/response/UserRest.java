package com.appsdeveloperblog.app.ws.ui.model.request.ui.model.response;

public class UserRest {
// convert java object into JSON response
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
//    dont return sensitive information


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
