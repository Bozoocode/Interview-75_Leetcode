package Interviewset1;

public class Listnode{
	int Value;
	Listnode next;
		public Listnode() {
		super();
	}


	public Listnode(int value) {
			super();
			Value = value;
		}


	public Listnode(int value, Listnode next) {
		super();
		this.Value = value;
		this.next = next;
	}}
class listnodey{



	public static Listnode reverselist(Listnode head) {
		Listnode next = null;
		Listnode prev=null;
	Listnode current=head;
		while(current!=null) {
			next=current.next;
			current.next=prev;
				prev=current;
				current=next;
				
			}
		
	return prev;
		
	} 


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
