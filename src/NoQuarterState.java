
public class NoQuarterState implements State {
	GumballMachine gumballMachine;
	
	public  NoQuarterState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quaeter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quaeter");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there's no quaeter");
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first");
	}

}
