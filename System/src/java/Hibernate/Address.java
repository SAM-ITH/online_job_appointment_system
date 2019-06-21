package Hibernate;
// Generated Jan 30, 2019 7:46:47 AM by Hibernate Tools 3.6.0



/**
 * Address generated by hbm2java
 */
public class Address  implements java.io.Serializable {


     private Integer idaddress;
     private User user;
     private String no;
     private String street;
     private String city;
     private String town;

    public Address() {
    }

	
    public Address(User user) {
        this.user = user;
    }
    public Address(User user, String no, String street, String city, String town) {
       this.user = user;
       this.no = no;
       this.street = street;
       this.city = city;
       this.town = town;
    }
   
    public Integer getIdaddress() {
        return this.idaddress;
    }
    
    public void setIdaddress(Integer idaddress) {
        this.idaddress = idaddress;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getNo() {
        return this.no;
    }
    
    public void setNo(String no) {
        this.no = no;
    }
    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getTown() {
        return this.town;
    }
    
    public void setTown(String town) {
        this.town = town;
    }




}

