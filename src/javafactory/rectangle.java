/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafactory;

/**
 *
 * @author sysfore
 */
public class rectangle implements shape{
    @Override
    public void draw()
    {
        System.out.println("Implementing rectangle through factory pattern-one factory class and many subclasses choosing the subclass at runtime using if or switch");
    }
    
    
}
