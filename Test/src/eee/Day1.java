package eee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Day1 {
	public static void main(String[] args) {
		  ArrayList<Integer> list = new ArrayList<>();  
		  
	        list.add(1);  
	        list.add(2);  
	        list.add(3);  
	        list.add(4);  
	        list.add(5);  
	        
	  
	        Iterator<Integer> it = list.iterator();  
	        while (it.hasNext()) {                   
	Integer value = it.next();              
	            if (value==2) 
	                it.remove();
	          
	        }  
	  
	    }  
	  

}