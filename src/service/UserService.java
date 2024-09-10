package service;

public class UserService {
    public UserService() {
        User user = new User();
        user.country = " a country";
        user.zipCode = "12345";
        user.vip = true;
        user.nationality;
        user.setCountry(" a country");
        user.setZipCode("12345");
        user.setVip(true);
        user.setNationality(" a nationality");

        Customer customer = new Customer();
        customer.country = "a country";
        customer.zipCode = "zip code";
        customer.vip = true;
        customer.nationality = "nationality";
        customer.setCountry("a country");
        customer.setZipCode("zip code");
        customer.setVip(true);
        customer.setNationality("nationality");


        customer.gender = "male";
        customer.phone = "123456";
        customer.address = "5 street";
        customer.name = "John";
        customer.setGender("female");
        customer.setPhone("123456");
        customer.setAddress("a street");
        customer.setName("John");




    }
}
