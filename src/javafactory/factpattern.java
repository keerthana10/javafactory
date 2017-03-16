/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafactory;

/**
 *
 * @author sysfore
 */
public class factpattern {
    
    public static void main(String args[])
    {
    shapefactory obj= new shapefactory();
    
    shape shape1=obj.getshape("circle");
    shape1.draw();
     shape shape2=obj.getshape("rectangle");
    shape2.draw();
}
}