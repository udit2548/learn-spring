package com.in28Minutes.learnspringframework.examples.a3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MySqlDataService implements DataService {
    public int[] retrieveData() {
   	 return new int[] {1,2,3,4,5};

}
    }
