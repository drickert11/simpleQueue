/*
Developed by Dustin Rickert
 */
import java.util.*;
public class driver {	
	public static void main(String []args){
		//initializes queue
		LQueue lqueue=new LQueue();		
		for(int i=0;i<60;i++){
			if(lqueue.isEmpty()==true){
				//do nothing if true
			}
			else{
				lqueue.getFirst().decServiceTime();
				//if customer is serviced
				if(lqueue.getFirst().getServiceTime()==0){
					lqueue.dequeue();
					System.out.println("Customer serviced and removed from the queue.  Queue length is now "+lqueue.QLength());					
				}
			}
				//25% chance for new customer to add to queue
			int num= new Random().nextInt(4)+1;
			if(num==4){
					Customer c=new Customer();
					lqueue.enqueue(c);
					System.out.println("New customer added!  Queue length is now "+lqueue.QLength());
			}
				//per minute			
			System.out.println("---------------------------------------------------");
		}
		//final output
		System.out.println("The total number of customers serviced is "+lqueue.getTotal()+"\nThe Maximum number of people in the queue at a time is "+lqueue.getMax());
	}
}
