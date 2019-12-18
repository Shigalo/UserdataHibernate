package by.bsuir.userhibernate.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.util.Date;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "userName",
        "secondName",
        "lastName",
        "phoneNum",
        "birthday",
        "gender",
        "passportSeria",
        "passportNum",
        "identicationNum",
        "passportWhoGive",
        "passportGiveDate",
        "livingCity",
        "address",
        "homePhone",
        "email",
        "citizenship"
})
@Entity
@Table(name = "userdata", schema = "testdb")
public  class User {

    @XmlElement(required = true)
    private String userName;
    @XmlElement(required = true)
    private String secondName;
    @XmlElement(required = true)
    private String lastName;
    @XmlElement(required = true)
    private String phoneNum;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    private Date birthday;
    private boolean gender;
    @XmlElement(required = true)
    private String passportSeria;
    @XmlElement(required = true)
    private String passportNum;
    private String identicationNum;
    @XmlElement(required = true)
    private String passportWhoGive;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    private Date passportGiveDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    private City livingCity;
    @XmlElement(required = true)
    private String address;
    private String homePhone;
    private String email;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    private Citizenship citizenship;
    @XmlAttribute(name = "id", required = true)
    private int userDataId;

    public User() { }

    public User(String userName, String secondName,
                String lastName, String phoneNum,
                Date birthday, boolean gender,
                String passportSeria, String passportNum,
                String identicationNum, String passportWhoGive,
                Date passportGiveDate, City livingCity,
                String address, String homePhone,
                String email, Citizenship citizenship,
                int userDataId) {
        this.userName = userName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.birthday = birthday;
        this.gender = gender;
        this.passportSeria = passportSeria;
        this.passportNum = passportNum;
        this.identicationNum = identicationNum;
        this.passportWhoGive = passportWhoGive;
        this.passportGiveDate = passportGiveDate;
        this.livingCity = livingCity;
        this.address = address;
        this.homePhone = homePhone;
        this.email = email;
        this.citizenship = citizenship;
        this.userDataId = userDataId;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getUserDataId() {
        return userDataId;
    }

    public void setUserDataId(int userDataId) {
        this.userDataId = userDataId;
    }

    @Basic
    @Column(name = "userName", nullable = false, length = 45)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "secondName", nullable = false, length = 45)
    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Basic
    @Column(name = "lastName", nullable = false, length = 45)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "phoneNum", nullable = true, length = 13)
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Basic
    @Column(name = "birthday", nullable = false)
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "gender", nullable = false)
    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "passportSeria", nullable = false, length = 2)
    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    @Basic
    @Column(name = "passportNum", nullable = false, length = 10)
    public String getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(String passportNum) {
        this.passportNum = passportNum;
    }

    @Basic
    @Column(name = "identicationNum", nullable = true, length = 13)
    public String getIdenticationNum() {
        return identicationNum;
    }

    public void setIdenticationNum(String identicationNum) {
        this.identicationNum = identicationNum;
    }

    @Basic
    @Column(name = "passportWhoGive", nullable = false, length = -1)
    public String getPassportWhoGive() {
        return passportWhoGive;
    }

    public void setPassportWhoGive(String passportWhoGive) {
        this.passportWhoGive = passportWhoGive;
    }

    @Basic
    @Column(name = "passportGiveDate", nullable = false)
    public Date getPassportGiveDate() {
        return passportGiveDate;
    }

    public void setPassportGiveDate(Date passportGiveDate) {
        this.passportGiveDate = passportGiveDate;
    }

    @Basic
    @Column(name = "livingCity", nullable = true)
    @Enumerated(EnumType.STRING)
    public City getLivingCity() {
        return livingCity;
    }

    @Enumerated(EnumType.STRING)
    public void setLivingCity(City livingCity) {
        this.livingCity = livingCity;
    }

    @Basic
    @Column(name = "address", nullable = false, length = -1)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "homePhone", nullable = true, length = 15)
    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 25)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "citizenship", nullable = false)
    @Enumerated(EnumType.STRING)
    public Citizenship getCitizenship() {
        return citizenship;
    }
    @Enumerated(EnumType.STRING)
    public void setCitizenship(Citizenship citizenship) {
        this.citizenship = citizenship;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (gender != user.gender) return false;
        if (userDataId != user.userDataId) return false;
        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
        if (secondName != null ? !secondName.equals(user.secondName) : user.secondName != null) return false;
        if (lastName != null ? !lastName.equals(user.lastName) : user.lastName != null) return false;
        if (phoneNum != null ? !phoneNum.equals(user.phoneNum) : user.phoneNum != null) return false;
        if (birthday != null ? !birthday.equals(user.birthday) : user.birthday != null) return false;
        if (passportSeria != null ? !passportSeria.equals(user.passportSeria) : user.passportSeria != null)
            return false;
        if (passportNum != null ? !passportNum.equals(user.passportNum) : user.passportNum != null) return false;
        if (identicationNum != null ? !identicationNum.equals(user.identicationNum) : user.identicationNum != null)
            return false;
        if (passportWhoGive != null ? !passportWhoGive.equals(user.passportWhoGive) : user.passportWhoGive != null)
            return false;
        if (passportGiveDate != null ? !passportGiveDate.equals(user.passportGiveDate) : user.passportGiveDate != null)
            return false;
        if (livingCity != user.livingCity) return false;
        if (address != null ? !address.equals(user.address) : user.address != null) return false;
        if (homePhone != null ? !homePhone.equals(user.homePhone) : user.homePhone != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        return citizenship == user.citizenship;
    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (phoneNum != null ? phoneNum.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (gender ? 1 : 0);
        result = 31 * result + (passportSeria != null ? passportSeria.hashCode() : 0);
        result = 31 * result + (passportNum != null ? passportNum.hashCode() : 0);
        result = 31 * result + (identicationNum != null ? identicationNum.hashCode() : 0);
        result = 31 * result + (passportWhoGive != null ? passportWhoGive.hashCode() : 0);
        result = 31 * result + (passportGiveDate != null ? passportGiveDate.hashCode() : 0);
        result = 31 * result + (livingCity != null ? livingCity.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (homePhone != null ? homePhone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (citizenship != null ? citizenship.hashCode() : 0);
        result = 31 * result + userDataId;
        return result;
    }

    @Override
    public String toString() {
        return "UserdataEntity{" +
                "userDataId=" + userDataId +
                ", userName='" + userName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", passportSeria='" + passportSeria + '\'' +
                ", passportNum='" + passportNum + '\'' +
                ", identicationNum='" + identicationNum + '\'' +
                ", passportWhoGive='" + passportWhoGive + '\'' +
                ", passportGiveDate=" + passportGiveDate +
                ", livingCity=" + livingCity +
                ", address='" + address + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", email='" + email + '\'' +
                ", citizenship=" + citizenship +
                '}';
    }
}
