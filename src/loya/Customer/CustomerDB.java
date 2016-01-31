package loya.Customer;

/**
 * Created by carlosloya on 1/30/16.
 */
public class CustomerDB {

    public static Customer getCustomer(int customerNumber){

        if(customerNumber == 1001){
            Customer register = new Customer();
            register.setName("Barbara White");
            register.setAddress("3400 Richmond Parkway #3423");
            register.setCity("Bristol");
            register.setState("CT");
            register.setPostalCode("06010");

            return register;
        }

        else if(customerNumber == 1002){
            Customer register = new Customer();
            register.setName("Karl Vang");
            register.setAddress("327 Franklin Street");
            register.setCity("Edina");
            register.setState("MN");
            register.setPostalCode("55435");

            return register;
        }

        else if(customerNumber == 1003){
            Customer register = new Customer();
            register.setName("Ronda Chavan");
            register.setAddress("518 Commanche Dr.");
            register.setCity("Greensboro");
            register.setState("NC");
            register.setPostalCode("27410");

            return register;
        }

        else{
            return null;
        }

    }

}
