
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author annip
 */
public class Figurasgeometricas {
	

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws Exception { 
    {
         double radioCircle=0;
         double ladoSquare=0;
         double baseTriangle=0;
         double alturaTriangle=0;
        Scanner sc= new Scanner(System.in);
      	BufferedReader read = new BufferedReader(new InputStreamReader(System.in)); 


                System.out.println("*----------------------------------------------------------*");
		System.out.println("*        AREA Y PERÍMETRO DE FIGURAS GEOMÉTRICAS           *");
		System.out.println("*----------------------------------------------------------*\n");
                
		System.out.println("----------------------BIENVENIDO---------------------------");
		System.out.println("Selecciona la figura geométrica con la que quieras trabajar");
		System.out.println("-----------------------------------------------------------");
		System.out.println(" Presiona 1 para seleccionar Círculo");
		System.out.println(" Presiona 2 para seleccionar Cuadrado");
                System.out.println(" Presiona 3 para seleccionar Triángulo");
		System.out.println("-----------------------------------------------------------");
		
                        int seleccion = Integer.parseInt(read.readLine());
                System.out.println("-----------------------------------------------------------");
                System.out.println("       Selecciona qué operación deseas realizar            ");
		System.out.println(" Presiona 1 para seleccionar Perímetro");
		System.out.println(" Presiona 2 para seleccionar Área");
                System.out.println("-----------------------------------------------------------");
                        int seleccionOperacion = Integer.parseInt(read.readLine());
                
        
  if (seleccion == 1)
        {
        if (seleccionOperacion == 1){
                System.out.println("---------------PERÍMETRO DEL CÍRCULO-----------------------");
                System.out.print("Ingresa el radio del círculo: ");
                    radioCircle= sc.nextDouble();
                    Circle circle = new Circle(radioCircle);
                    circle.getPerimeter();
                System.out.println("El perímetro del círculo es " + circle.getPerimetroCirculo());
                System.out.println("-----------------------------------------------------------");
                }
        	else if (seleccionOperacion == 2) {
               System.out.println("-------------------ÁREA DEL CÍRCULO------------------------");
               System.out.print("Ingresa el radio del círculo: ");
                    radioCircle= sc.nextDouble();
                    Circle circle = new Circle(radioCircle);
                    circle.getArea();
               System.out.println("El área del círculo es " + circle.getAreaCirculo());
               System.out.println("-----------------------------------------------------------");
                }
                    else throw new Exception("La opción que elegiste no existe");	
        }
        
        
  else if(seleccion==2)
  {
      if (seleccionOperacion==1){
           System.out.println("---------------PERÍMETRO DEL CUADRADO--------------------------");
           System.out.print("Ingresa el lado del cuadrado: ");
                ladoSquare= sc.nextDouble();
                Square square = new Square(ladoSquare);
                square.getPerimeter();
           System.out.println("El perímetro del cuadrado es " + square.getPerimetroCuadrado());
           System.out.println("---------------------------------------------------------------");
                
      }
           else if (seleccionOperacion == 2) {
           System.out.println("----------------ÁREA DEL CUADRADO---------------------------");
           System.out.print("Ingresa el lado del cuadrado: ");
                ladoSquare= sc.nextDouble();
                Square square = new Square(ladoSquare);
                square.getArea();
                System.out.println("El área del cuadrado es: " + square.getareaCuadrado());
           System.out.println("------------------------------------------------------------");
           }
      else throw new Exception("La opción que elegiste no existe");	
  }
        
 else if(seleccion==3)
  {
      if (seleccionOperacion==1){
           System.out.println("---------------PERÍMETRO DEL TRIÁNGULO--------------------------");
           System.out.print("Ingresa la base del triángulo: ");
                baseTriangle= sc.nextDouble();
           System.out.print("Ingresa la altura del triángulo: ");
               alturaTriangle= sc.nextDouble();
                Triangle triangle = new Triangle(baseTriangle, alturaTriangle);
                triangle.getPerimeter();
           System.out.println("El perímetro del triángulo es " + triangle.getPerimetroTriangulo());
           System.out.println("---------------------------------------------------------------");
                
      }
           else if (seleccionOperacion == 2) {
           System.out.println("----------------ÁREA DEL TRIÁNGULO--------------------------");
           System.out.print("Ingresa la base del triángulo: ");
                baseTriangle= sc.nextDouble();
           System.out.print("Ingresa la altura del triángulo: ");
               alturaTriangle= sc.nextDouble();
                Triangle triangle = new Triangle(baseTriangle, alturaTriangle);
                triangle.getArea();
                System.out.println("El área del triángulo es: " + triangle.getareaTriangulo());
           System.out.println("------------------------------------------------------------");
           }
      else throw new Exception("La opción que elegiste no existe");	
  }
   
      }

              

  }      
   
       
        
     
       
}

