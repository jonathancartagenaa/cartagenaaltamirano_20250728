/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cartagenaaltamirano_20250728;

/**
 *
 * @author UFG
 */
public class Main {
    
    /* VARIABLES GLOBALES */ 
    public static String nombres = "Jose Jonathan";
    public static String apellidos = "Cartagena Altamirano";
    public static int anio_nacimiento = 2003;
    public static int mes_nacimiento = 8;
    public static float estatura = 1.70f; // estatura en metros
    public static float peso = 180.2f; // peso en libras
    public static char genero = 'M';
    public static String estado_familiar = "Con novia";
    public static double salario_mensual = 400.00d;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double imc = 0.0d;
        float tasa_kilogramo = 0.453592f; // 1 libra equivale a 0.453592 kg
        int dias_laborales = 22; // 22 dias laborales al mes
        int horas_laborales = 8; // 8 horas laborales al dia
        
        // convertir el peso de libras a kilogramos
        float peso_kilogramos = Main.peso*tasa_kilogramo;
        
        // elevando el valor de la estatura al cuadrado
        float estatura_al_cuadrado = Main.estatura*Main.estatura; 
        
        // calcular el indice de masa corporal
        imc = peso_kilogramos/estatura_al_cuadrado;
        
        //calculando el salario diario
        double salario_diario = Main.salario_mensual/dias_laborales;
        
        // calculando el salario por hora
        double salario_hora = salario_diario/horas_laborales;
        /*************************************/
        /**********Salida de datos************/
        /*************************************/
        
        System.out.println("Saludos "+Main.nombres+ " "+Main.apellidos);
        System.out.println("Su peso en libras es: "+Main.peso+", pero en kilogramos es: "+peso_kilogramos);
        System.out.println("Su indice de Masa Corporal es: "+imc);
        System.out.println("Su salario mensual es: "+Main.salario_mensual);
        System.out.println("Su salario diario es: "+salario_diario);
        System.out.println("Su salario por hora es: "+salario_hora);
        
        
    }
    
}
