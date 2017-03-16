/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafactory;

/**
 *
 * @author sysfore
 */
public class shapefactory {
    
    public shape getshape(String shapeType)
    {
        
        
      if(shapeType == null){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new circle();
         
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new rectangle();
      } 
      
      
      return null;
   

    }
    
    
}
