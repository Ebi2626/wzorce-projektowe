package pl.edu.wszib.lab1.builder;

public class Application {

    public static void main(String[] args) {
        Person.Builder personBuilder = Person.builder()
                .firstName("Edwin")
                .lastName("Harmata")
                .age(2)
                .gender(Gender.MALE);
        Address address = personBuilder.addressBuilder()
                .city("Kraków")
                .number("6")
                .street("Test")
                .postalCode("30-085")
                .build();
        personBuilder.address(address);
    }
}
