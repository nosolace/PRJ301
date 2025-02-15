/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author no-solace
 */
public class User {

    private String userID;
    private String fullName;
    private String roldID;
    private String password;

    public User() {
    }

    public User(String userID, String fullName, String roldID, String password) {
        this.userID = userID;
        this.fullName = fullName;
        this.roldID = roldID;
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRoldID() {
        return roldID;
    }

    public void setRoldID(String roldID) {
        this.roldID = roldID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
