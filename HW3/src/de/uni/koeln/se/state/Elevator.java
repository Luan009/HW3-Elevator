package de.uni.koeln.se.state;

public class Elevator {

	
	public static int current_Floor=5;
	int dest_Floor;
	
	private Elv_States State = new Elv_States();
	
	public Elevator (int dest_floor)
	{
		
		
		this.dest_Floor=dest_floor;
	System.out.println("*** Destination floor is: "+ dest_Floor);
	
	if(current_Floor < dest_Floor) {
		go_up();
		
		
	} else if(current_Floor > dest_Floor) {
		go_down();
		
		
	}
	
	
	if(current_Floor == dest_Floor) {
	arrive_atFloor();
	exit();
	
	}
	

	}

	private void arrive_atFloor() {
		
		State.Current_State = State.Idle;
		
		System.out.println(State.Current_State);
		
		
	}
	
	private void go_up() {
		
		
		State.Current_State = State.Moving_up;

		
		while(current_Floor < dest_Floor) {
			
			if(dest_Floor < 0 || dest_Floor > 10) {
				System.out.println("Fehler");
				break;
			}
			
			current_Floor++;
			System.out.println(State.Current_State);

		}
		
	}
	
	private void go_down() {
		
		
		State.Current_State = State.Moving_down;

		
		while(current_Floor > dest_Floor) {
			
			if(dest_Floor < 0 || dest_Floor > 10) {
				System.out.println("Fehler");
				break;
			}
			
			
			current_Floor--;
			System.out.println(State.Current_State);

		}

		
	}
	
	private void exit() {
		
		System.out.println("Exit");
		
	}
	
	

	
}


