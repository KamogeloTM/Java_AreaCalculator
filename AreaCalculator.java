 /*
 * To change this license header, choose License Headers in Project Properties  
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacalculatorapp;

/**
 *
 * @author Kamogelo Moatshe
 */
public class AreaCalculator {
    
    private double length;
    private double breadth;
    private double area;
     
    public AreaCalculator(){
       
        
        length=0.0;
        breadth=0.0;
       
    
    }
    public void setLength(double length){
     
        this.length = length;
          
    }
    public void setBreadth(double breadth){ 
    
          this.breadth= breadth;
        }
    public double getLength(){
      
        return length;
      }
    public double getBreadth(){
       
        return breadth; 
     }
    public double calculateAverage(){
  
        area = length*breadth;
        
        return area;  
    
    
    }
    public static void main(String[] args) {
        
       AreaCalculator areaCalculator = new AreaCalculator();
        
       areaCalculator.setLength(3.0);
       areaCalculator.setBreadth(4.0);
       
       System.out.println("The area of :" + " length: " + areaCalculator.getLength() + " breadth: " + 
                           areaCalculator.getBreadth() + " is " + areaCalculator.calculateAverage());
    }
    
}
