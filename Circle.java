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
public class Circle implements SHAPES{
    private double radio;
    private double areaCirculo;
    private double perimetroCirculo;
    static final double pi=3.1416;
    
public Circle(double radio){
      this.radio=radio;
}
   
public double getRadio()
{
    return radio;
}

public void setRadio(double radio){
    this.radio=radio;
} 

public double getAreaCirculo(){
    return areaCirculo;
}

public double getPerimetroCirculo(){
    return perimetroCirculo;
}
@Override

public void getArea()
{
    areaCirculo=pi*radio*radio;
}
public void getPerimeter()
{
    perimetroCirculo= 2*pi*radio;
}
}


