package learnspringframework_helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// Eliminate verbosity in creating java beans 
// Public accessor methods, getters and setters,constructors
// equals, Hashcode,toString are automatically created
// Launched in JDK 16

record Person (String name,int age,Address address) {};
record Address(String firstLine, String city) {};


@Configuration
public class HelloWordConfiguration {

 @Bean	
   public String name() {
	   return "Udit";
   }
 
 @Bean
  public int age() {
	  return 15;
  }
 @Bean
 public Person person() {
	 return new Person("Ravi",20, new Address("Bakers Street","Miami Florida"));
 }
 @Bean
 public Person person2MethodCall() {
	 // Creating beans using existing bean.
	 return new Person(name(),age(),address()); // By passing method call to name, age
 }
 @Bean
 public Person person3parameters(String name,int age,Address address3) { // By passing bean name as parameters in method declaration
	 return new Person(name,age,address3);
 }
 @Bean
 @Primary
 public Person person4parameters(String name,int age,Address address) {
	 return new Person(name,age,address);
 }
 @Bean
 public Person person5Qualifier(String name,int age,@Qualifier("address3qualifier")Address address) {
	 return new Person(name,age,address);
 }
 @Bean(name="address2")
 @Primary
 public Address address() {
	 return new Address("Bakers Street","Miami Florida");
 }
 @Bean(name="address3")
 @Qualifier("address3qualifier")
 public Address address3() {
	 return new Address("Motinagar","Hyderabad");
 }
 
}
