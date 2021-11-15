/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author annip
 */
public class Square implements SHAPES
        
{
    private double lado;
    private double areaCuadrado;
    private double perimetroCuadrado;

    public Square(double lado) {
        this.lado = lado;
    }
    
    public double getLado() 
    {
        return lado;
    }

    public void setLado(double lado) 
    {
        this.lado = lado;
    }

    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }    
    
    public double getPerimetroCuadrado(){
        return perimetroCuadrado;
    }
   //AREA DE CÍRCULO 
    @Override
    public void getArea() 
    {
        
        areaCuadrado = lado * lado;
    }    
    
    public void getPerimeter(){
        perimetroCuadrado=lado+lado+lado+lado;
    }
}
