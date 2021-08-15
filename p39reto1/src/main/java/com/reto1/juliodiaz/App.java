package com.reto1.juliodiaz;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Inversiones validarInversion = new Inversiones();
        System.out.println(validarInversion.validarInversion(6,2000000,0.12));
    }
}
