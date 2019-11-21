package org.eclipse.FirstSpringProject;

import org.eclipse.model.Personne;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Personne personne = context.getBean("per",Personne.class);
		personne.afficher();
    }
}
