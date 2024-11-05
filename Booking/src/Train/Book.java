package Train;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Book {
	
	static int availablelowerberth=1;
	static int availableupperberth=1;
	static int availablemiddleberth=1;
	static int availableracticket=1;
	static int availabewaitinglist=1;
	
	static Queue<Integer> waitinglist= new LinkedList<>();
	static Queue<Integer> raclist= new LinkedList<>();
	static List<Integer> bookingticketlist= new ArrayList<>();
	
	static List<Integer>lowerberthposition = new ArrayList<>(Arrays.asList(1));
	static List<Integer>upperberthposition = new ArrayList<>(Arrays.asList(1));
	static List<Integer>middleberthposition = new ArrayList<>(Arrays.asList(1));
	static List<Integer>racpositions = new ArrayList<>(Arrays.asList(1));
	static List<Integer>waitinglistposition = new ArrayList<>(Arrays.asList(1));
	
	static Map<Integer,Passenger> passengers= new HashMap<>();
	
	
	

}
