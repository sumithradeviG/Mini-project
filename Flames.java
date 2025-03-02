class flamesCalculator{
	
    	public String flames(String name1, String name2){
    
    		if(name1.length() < name2.length())
    		{
    			String temp = name1;
    			name1 = name2;
    			name2 = temp;
    		}
    
    		for(int i=0; i<name1.length(); i++){
    			char a = name1.charAt(i);
    			if(a != ' ' && name2.indexOf(a) != -1)
    			{
                    
    				name1 = name1.replaceAll(""+a, " ");
    				name2 = name2.replaceAll(""+a, " ");
    			}
    		}
    		name1 = name1.replaceAll(" ", "");
    		name2 = name2.replaceAll(" ", "");
    		int totLen = name1.length() + name2.length();
    
    		System.out.println("name1: "+name1+"   name2: "+ name2);
    		System.out.println(totLen);
    
    		String flames = "FLAMES";
    
    		while(flames.length() != 1){
    			int removedLetterIndex = totLen % flames.length();
    			System.out.println(removedLetterIndex);
                
    
    			if(removedLetterIndex != 0){
    				flames = flames.substring(removedLetterIndex) + flames.substring(0, removedLetterIndex-1);
    			}
                
    			else{
    				flames = flames.substring(0, flames.length()-1);
    			}
                
    			System.out.println(flames);
    		}
    		return flames;
            
    	}
    }
    
    public class Flames {
    
    	public static void main(String[] args) {
    		String name1 = "sumithradevi";
    		String name2 = "gowribalan";
    
    		flamesCalculator fc = new flamesCalculator();
    		String relation = fc.flames(name1, name2);
    		switch (relation) {
    			case "F":
    				System.out.println("Friend");
    				break;
    			case "L":
    				System.out.println("Love");
    				break;
    			case "A":
    				System.out.println("Affection");
    				break;
    			case "M":
    				System.out.println("Marriage");
    				break;
    			case "E":
    				System.out.println("Enemy");
    				break;
    			case "S":
    				System.out.println("Sister");
    				break;
    			default:
    				break;
    		}
    	}
    }
    
