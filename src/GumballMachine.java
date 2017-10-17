
public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	State state = soldOutState;
	int count = 0;
	
	
	public  GumballMachine(int numberGumballs){
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterstate(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		this.count = numberGumballs;
		if(numberGumballs > 0){
			state = noQuarterState;
		}
	}
		public void insertQuarter(){
			state.insertQuarter();
		}
		public void ejectQuarter(){
			state.ejectQuarter();
		}
		public void turnCrank(){
			state.turnCrank();
			state.dispense();
		}
		void setState(State state){
			this.state = state;
		}
		void releaseBall(){
			System.out.println("A gumball comes rolling out the slot...");
			if(count != 0){
				count = count - 1;
			}
		}
		public int getCount(){
			return this.count;
		}
		public State getNoQuarterState(){
			return noQuarterState;
		}
		public State getHasQuarterState(){
			return hasQuarterState;
		}
		public State getSoldState(){
			return soldState;
		}
		public State getSoldOutState(){
			return soldOutState;
		}
		public String toString(){
			 String status = "Gumball Machine";
			 if(state == hasQuarterState){
				 status = status + "\n status : HAS QUARTER";
			 }else if(state == noQuarterState){
				 status = status + "\n status : NO QUARTER";
			 }else if(state == soldState){
				 status = status + "\n status : SOLD";
			 }else if(state == soldOutState){
				 status = status + "\n status : SOLD OUT"; 
			 }
			 status = status + "\n count : "+this.count; 
			 return status;
		 }
		public State getWinnerState() {
			
			return winnerState;
		}
}
