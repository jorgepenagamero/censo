/*
 * crear clase Censo Atributos estáticos para cantidad de mujeres, hombres
 *Constantes para indicar sexo HOMBRE, MUJER
 *Método estático agregarPersona(sexo)
 *Método estático que permita mostrar el total de hombres y de mujeres.
 *Variables de instancia privadas indicando la fecha de inicio del censo, y el año del censo.
 *Clase de prueba TestCenso, utilizando los métodos creado
 */
package com.jorge.censo;

/**
 *
 * @author Jorge
 */
public class Censo {

    //atributos publicos

    public static final String nombre = "";
    public static final String sexo = "";
    public static int cantMujeres;
    public static int cantHombres;
    //public static int cantPersonas;

    //constantes:
    public static final String HOMBRE = "HOMBRE";
    public static final String MUJER = "MUJER";
    public static final String INDEFINIDO = "INDEFINIDO";
    // atributos privados
    private static int dia;
    private static int mes;
    private static int anio;

    //constructor asigna memoria y para que sea statico se cambian 
    public static void iniciar(int d, int m, int a) {
        cantHombres = 0;
        cantMujeres = 0;
        dia = d;
        mes = m;
        anio = a;
    }
    public static void fechaCenso(int d, int m, int a){
        
        System.out.println("fecha de inicio censo: "+d+"/"+m+"/"+a );
    }
    public static void agregarPersona(String sexo) {
        if (sexo.equals("HOMBRE")) {
            cantHombres++;
        } else if (sexo.equals("MUJER")) {
            cantMujeres++;
        } else {
            System.out.println("Genero no reconocido");
        }
    }

    public static void totales() {
        System.out.println("total de hombres " + cantHombres);
        System.out.println("total de mujeres " + cantMujeres);

    }

    public static void mostrar() {
        System.out.println("Cantidad de hombres son:  " + cantHombres);
        System.out.println("Cantidad de mujeres son: " + cantMujeres);
    }

    public static int getCantPersonas() {
        int cantPersonas = cantMujeres + cantHombres;
        return cantPersonas;
    }

}
