import java.util.List;
import java.util.ArrayList;



public class ChangeHouseActivity {
	
	
	public List<Integer> updateStates(int[] arr, int days){
		
		List<Integer> output = new ArrayList<Integer>();
		
		int[] initStates = arr;
		int[] nextStates = new int[arr.length];
		
		
		
		for(int i = 0; i < days; ++i) {			// 
iterate number of days
			
			
			for(int j = 0; j < initStates.length; ++j) {
				
				int leftState, rightState; 
				
				if(j == 0) {
					leftState = 0;
					rightState = initStates[j + 1];
				}else if(j == initStates.length - 1) {
					leftState = initStates[j - 1];
					rightState = 0;
				}else {
					leftState = initStates[j - 1];
					rightState = initStates[j + 1];
				}
				
				
				
				if(leftState == rightState) {	// both 
neighbors are either active or inactive so make center house inactive
					nextStates[j] = 0;
				}else {
					nextStates[j] = 1;			
// neighbors have different activity therefore set center house active
				}
				
				
			}
			
			//initStates = nextStates;
			
			for(int j = 0; j < initStates.length; ++j) {
				initStates[j] = nextStates[j];
			}
				
		}
		
		for(int i = 0; i < nextStates.length; ++i) {
			output.add(nextStates[i]);
		}
		
		
		
		return output;
	}
	
	
	
}

