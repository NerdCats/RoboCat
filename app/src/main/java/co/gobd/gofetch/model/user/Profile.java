package co.gobd.gofetch.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Profile {

    @SerializedName("NationalId")
    @Expose
    private String NationalId;
    @SerializedName("DriversLicenseId")
    @Expose
    private String DriversLicenseId;
    @SerializedName("Vehicle")
    @Expose
    private Object Vehicle;
    @SerializedName("FirstName")
    @Expose
    private String FirstName;
    @SerializedName("LastName")
    @Expose
    private String LastName;
    @SerializedName("Age")
    @Expose
    private Integer Age;
    @SerializedName("Gender")
    @Expose
    private String Gender;
    @SerializedName("Address")
    @Expose
    private String Address;
    @SerializedName("PicUri")
    @Expose
    private Object PicUri;

    /**
     * @return The NationalId
     */
    public String getNationalId() {
        return NationalId;
    }

    /**
     * @param NationalId The NationalId
     */
    public void setNationalId(String NationalId) {
        this.NationalId = NationalId;
    }

    /**
     * @return The DriversLicenseId
     */
    public String getDriversLicenseId() {
        return DriversLicenseId;
    }

    /**
     * @param DriversLicenseId The DriversLicenseId
     */
    public void setDriversLicenseId(String DriversLicenseId) {
        this.DriversLicenseId = DriversLicenseId;
    }

    /**
     * @return The Vehicle
     */
    public Object getVehicle() {
        return Vehicle;
    }

    /**
     * @param Vehicle The Vehicle
     */
    public void setVehicle(Object Vehicle) {
        this.Vehicle = Vehicle;
    }

    /**
     * @return The FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @param FirstName The FirstName
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * @return The LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName The LastName
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return The Age
     */
    public Integer getAge() {
        return Age;
    }

    /**
     * @param Age The Age
     */
    public void setAge(Integer Age) {
        this.Age = Age;
    }

    /**
     * @return The Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender The Gender
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * @return The Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address The Address
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return The PicUri
     */
    public Object getPicUri() {
        return PicUri;
    }

    /**
     * @param PicUri The PicUri
     */
    public void setPicUri(Object PicUri) {
        this.PicUri = PicUri;
    }
}
