/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorge.censo;

/**
 *
 * @author morfoblue
 */
public class TestCenso {
     public static void main(String[] args){
       //no se usa memoria
       // Censo censoGuatemala= new Censo(dia, mes, anio);
        Censo censoGuatemala = new Censo();
        censoGuatemala.cantHombres = 5;
        censoGuatemala.cantMujeres= 10;
        System.out.println("-----------");
        //Censo.iniciar(2,3,2019);
        censoGuatemala.mostrar();
        
        System.out.println("-----------");
        Censo.iniciar(1,3,2019);
        Censo.agregarPersona(Censo.MUJER);
        Censo.agregarPersona(Censo.HOMBRE);
        Censo.agregarPersona(Censo.MUJER);
        Censo.agregarPersona(Censo.INDEFINIDO);
        Censo.mostrar();
        System.out.println("-----------");
        Censo.agregarPersona(Censo.MUJER);
         Censo.agregarPersona(Censo.HOMBRE);
        censoGuatemala.mostrar();
           System.out.println("-----------");
           Censo.totales();
           Censo.fechaCenso(3,5,2019);
        //censoGuatemala.cantHombres = 5;
        //censoGuatemala.cantMujeres = 11;
    }
}
