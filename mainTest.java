
import java.util.List;
import java.util.ArrayList;


public class mainTest {

	public static void main(String[] args) {
		
		ChangeHouseActivity cha = new ChangeHouseActivity();
		
		List<Integer> list = new ArrayList<>();
		
		
		int[] houseStates = {1,0,0,0,0,1,0,0};
		int days = 2;
		
		list = cha.updateStates(houseStates, days);
		
		System.out.println(list);
		
	}
	
	
	
}

