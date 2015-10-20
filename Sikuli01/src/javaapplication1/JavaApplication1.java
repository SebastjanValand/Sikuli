/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import org.sikuli.script.*;
import java.util.*;
/**
 *
 * @author Seba
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Screen s = new Screen();
       ArrayList<String> cities = new ArrayList<String>(){{
		   add("Testnotestno00");
		   add("Agra");
		   add("Chennai");
		   }}; 
        
        for (int i = 0; i < 3; i++){
                try{
//                        s.click("../imgs/Sikuli01/Capture.PNG");
//                        s.wait("Capture2.PNG",15);
//                        s.setW(1000);
//                        s.click(15);
                        s.click(0);
                        s.write(cities.get(i)+ Key.ENTER);
                }
                catch(FindFailed e){
                        e.printStackTrace();
                }
//        System.out.println(cities.get(i));
    }
    }
    
}
