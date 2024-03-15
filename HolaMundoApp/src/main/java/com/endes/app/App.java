package com.endes.app;
import com.github.javafaker.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Faker fk = new Faker();
        System.out.println( "Hello World!" );
        
        System.out.println(fk.lordOfTheRings().character());
    }
}
