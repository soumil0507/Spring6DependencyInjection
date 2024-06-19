package bose.soumil.spring6di.services;

import org.springframework.stereotype.Service;

// setting a name to the bean
@Service("greetingServiceBean")
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting(){
        return "Hello Everyone from base service!!!";

    }
}
