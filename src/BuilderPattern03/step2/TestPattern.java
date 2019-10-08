package BuilderPattern03.step2;

import java.time.LocalDate;
import java.time.Month;

public class TestPattern {

  public static void main(String[] args) {
    //Person p1 = createPersonForTesting();
    //System.out.println(p1.getFirstName());
    Person p1 = Person.builder()
        .firstName("FirstName")
        .lastName("LastName")
/*        .addressOne("금천구 가산동")
        .addressTwo("AddressTwo")
        .birthDate(LocalDate.of(1995, Month.APRIL, 13))
        .sex("Male")
        .driverLicense(true)
        .married(true)*/
        .build();

    System.out.println(p1.getFirstName());
  }

/*  public static Person createPersonForTesting () {
    Person person = new Person();
    person.setFirstName("FirstName");
    person.setLastName("LastName");
    person.setAddressOne("Address1");
    person.setAddressTwo("Address2");
    person.setSex("Man");
    person.setDriverLicense(false);
    person.setMarried(true);
    return person;
  }*/
}
