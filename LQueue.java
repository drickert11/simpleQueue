
public class LQueue {
	private Customer First, Last,hold;
	private int QLength,Max,total=0;
	//Constructor
	public LQueue(){
		First=Last=null;
					}
	//checks the max amount in a Queue at a time
	public void isMax(){
		if(QLength>Max){
			Max=QLength;
		}
	}
	//to return max 
		public int getMax(){
		return Max;	
		}
	//Returns current length
	public int QLength(){
	return QLength;
	}
	
	//checks if empty
	public boolean isEmpty(){
		if(First==null){
			return true;
			
		}
		else
			return false;
	}
	
	//add customer to queue
	public void enqueue(Customer C){
		if(isEmpty()==true){
			First=Last=C;
			QLength++;
			isMax();
		}
		else{
			Last.setNext(C);
			Last=C;
			QLength++;
			isMax();
		}
	}
	
	//removes first
	public void dequeue(){
		if(QLength>=2){
		First=First.getNext();
		}
		else{
			First=null;
		}
		
		QLength--;
		isMax();
		total++;
	}
	//to be used in the driver
	public Customer getFirst(){
		return First;
	}
	//gets total amount of people serviced at a time
	public int getTotal(){
		return total;
	}
		
		
}
