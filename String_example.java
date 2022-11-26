import java.util.HashMap;
import java.util.Map;

public class String_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Find repeated word count *******************************
		String text = "coding skills to have, Must to have coding skills";

		Map<String,Integer> hashMap = new HashMap<>();

		String[] words = text.split(" ");

		for(String word : words){

			Integer intd = hashMap.get(word);

			if (intd == null)
				hashMap.put(word, 1);

			else{

				hashMap.put(word, intd+1);
			}

		}

		System.out.println(hashMap);
		

		
		// Find all char count ***********************************
		int count = 0;

		//char search = 'n';

		//Counts each character excluding spaces    
        for(int i = 0; i < text.length(); i++) {    
            if(text.charAt(i) != ' ')    
                count++;    
        }  
        
        System.out.println("Total number of characters in a string: " + count);    

	}

}
