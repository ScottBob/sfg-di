package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola - Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {
        return "Guten tag - Primärer Grußdienst";
    }
}
