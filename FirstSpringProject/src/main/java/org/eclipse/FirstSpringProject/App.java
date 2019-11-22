package org.eclipse.FirstSpringProject;

import org.eclipse.model.Person;
import org.eclipse.model.Personne;
import org.eclipse.nation.European;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Personne personne = context.getBean("per",Personne.class);
//		personne.afficher();
    	
    	//factory();
    	afficherEuropean();
    	//testerConduire();
    	
    }
    
    public static void factory()
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BeanFactory factory=(BeanFactory) context;
		Personne p=(Personne)factory.getBean("per");
		p.afficher();

    }
    
    public static void afficherEuropean()
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	European european = (European) context.getBean("fre");
    	european.saluer(4);
    }
    
    public static void testerConduire()
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Person p = (Person) context.getBean("person");
    	p.drive();

    }

}
