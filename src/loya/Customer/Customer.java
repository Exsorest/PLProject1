package loya.Customer;

/**
 * Created by carlosloya on 1/30/16.
 */
public class Customer {

    private String name;
    private String address;
    private String city;
    private String state;
    private String postalCode;

    public Customer(){

        name = "";
        address = "";
        city = "";
        state = "";
        postalCode = "";

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return city;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }

    public String getPostalCode(){
        return postalCode;
    }

    public String getNameAndAddress(){

        String nameAndAddress = "" + name +"\n" + address + "\n" + city + ", " + state + " " + postalCode;
        return nameAndAddress;

    }


}

