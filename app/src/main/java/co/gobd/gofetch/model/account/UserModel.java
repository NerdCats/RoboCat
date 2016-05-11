package co.gobd.gofetch.model.account;

import android.support.annotation.Nullable;

/**
 * Created by tonmoy on 11-May-16.
 */
public class UserModel {
    private String ConfirmPassword;

    private String Email;

    private String Type;

    private String Password;

    private String PhoneNumber;

    private String UserName;

    @Nullable
    private String PicUri;

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public void setConfirmPassword(String ConfirmPassword) {
        this.ConfirmPassword = ConfirmPassword;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPicUri() {
        return PicUri;
    }

    public void setPicUri(String PicUri) {
        this.PicUri = PicUri;
    }

    @Override
    public String toString() {
        return "UserModel [ConfirmPassword = " + ConfirmPassword + ", Email = " + Email + ", Type = " + Type + ", Password = " + Password + ", PhoneNumber = " + PhoneNumber + ", UserName = " + UserName + ", PicUri = " + PicUri + "]";
    }
}