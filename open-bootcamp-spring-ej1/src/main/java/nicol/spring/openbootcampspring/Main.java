package nicol.spring.openbootcampspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        Saludo calculadora = (Saludo) context.getBean("saludo");
        String texto = calculadora.imprimirSaludo();
        System.out.println(texto);

    }
}
