public class Main {

    public static void main(String[] args) {
        Person arpitPerson=new Person("Paul");
        Person johnPerson=new Person("Steve");
        
        Product samsungMobile=new Product("Samsung", "Mobile", "Not available");
              
        samsungMobile.registerObserver(arpitPerson);
        samsungMobile.registerObserver(johnPerson);
        
        samsungMobile.setAvailability("Available");
        
    }
}