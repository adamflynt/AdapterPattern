
public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
	private OldCoffeeMachine oldVendingMachine;
	
	public CoffeeTouchscreenAdapter(OldCoffeeMachine oldVendingMachine) {
		this.oldVendingMachine = oldVendingMachine;
	}

	public void chooseFirstSelection() {
		this.oldVendingMachine.selectA();
		
	}

	public void chooseSecondSelection() {
		this.oldVendingMachine.selectB();
	}
	
}
