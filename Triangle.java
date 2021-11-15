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
public class Triangle implements SHAPES{
    private double base;
    private double altura;
    private double lado;
    private double areaTriangulo;
    private double perimetroTriangulo;

    public Triangle(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() 
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura() 
    {
        return altura;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }
    
    public double getLado(){
        return lado;
    }
    public void setLado(double lado){
        this.lado=lado;
    }
    public double getareaTriangulo() 
    {
        return areaTriangulo;
    }
    
    public double getPerimetroTriangulo()
    {
        return perimetroTriangulo;
    }

    @Override
    public void getArea() 
    {
        areaTriangulo = base * altura/ 2;
    }    
    public void getPerimeter()
    {
        perimetroTriangulo=lado+lado+lado;
    }
}