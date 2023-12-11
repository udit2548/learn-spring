package learnspringframework_helloworld;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// 1. Launch Spring context
		try(var context= 
				new AnnotationConfigApplicationContext(HelloWordConfiguration.class)
		){// 2. Configure the things that spring needs to manage(Configuration class)
			// Configuration Class - HelloWorldConfiguration.java ( @Configuration )
			// name - @bean
			
			// 3. Retrieving Beans managed by Spring
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2MethodCall"));
			//System.out.println(context.getBean("address2"));
			System.out.println(context.getBean("person3parameters"));
			System.out.println(context.getBean(Address.class));
			System.out.println(context.getBean(Person.class));
			System.out.println(context.getBean("person5Qualifier"));
			
			// refer functional programming for this code
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);		
			
			}
		
		
		

	}

}
