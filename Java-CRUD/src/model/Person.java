
package model;

import java.sql.Date;

/**
 *
 * @author ferna
 */
public class Person {
    private int ID;
    private String key;
    private String name;
    private String address;
    private String cellphone;
    private String email;
    private Date date;
    private String gender;
/*
    public Person(int ID, int key, String name, String address, String cellphone, String email, Date date, String gender) {
        this.ID = ID;
        this.key = key;
        this.name = name;
        this.address = address;
        this.cellphone = cellphone;
        this.email = email;
        this.date = date; //Data type "Date". 
        this.gender = gender;
    }
*/
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void showData(){
        System.out.println("Key: " + key + "\nName: " + name + "\nAddress: " + address +
            "\nCellphone: " + cellphone + "\nEmail: " + email + "\nDate: " + date + 
            "\nGender: " + gender);
    }
}
