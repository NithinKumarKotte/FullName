
/*Program to check whether string contains Firstname and Lastname , Such that if First Name = Nithin and LastName= Kotte
then in String if we come across "Nithin<<Kotte" pattern we give FirstName =Nithin and LastName as Kotte
if we come across "Nithin<Kotte" pattern we output as FullName = Nithin Kotte

*/
public class FullName {
	private String name;
	public FullName(String str){
		this.name=str;
	}
	
	public void nameDifference(){
		String [] strArray= name.split("<");
		for(int i=0;i<strArray.length;i++) {
			
			//Checking for end conditions when i=0
			if(i==0){
				if(strArray[i].equals("Kotte") && strArray[i+1].isEmpty()){
					System.out.println("LastName : "+strArray[i]);
				}else if (strArray[i].equals("Nithin") && strArray[i+1].isEmpty()){
					System.out.println("FirstName: "+strArray[i]);
				}else if (strArray[i].equals("Nithin") && (strArray[i+1].equals("Kotte"))) {
					System.out.println("FullName: "+strArray[i]+" "+strArray[i+1]);
					i=i+2;
				}else if (strArray[i].equals("Kotte") && strArray[i+1].equals("Nithin")) {
					System.out.println("FullName: "+strArray[i+1]+" "+strArray[i]);
					i=i+2;
				}
				
			}
			
			//Checking for end conditions when i=last index
			else if(i==strArray.length-1){
				if(strArray[i].equals("Kotte") && strArray[i-1].isEmpty()){
					System.out.println("LastName : "+strArray[i]);
				}else if (strArray[i].equals("Nithin") && strArray[i-1].isEmpty()){
					System.out.println("FirstName: "+strArray[i]);
				}else if (strArray[i].equals("Nithin") && (strArray[i-1].equals("Kotte"))) {
					System.out.println("FullName: "+strArray[i]+" "+strArray[i-1]);
				}else if (strArray[i].equals("Kotte") && strArray[i-1].equals("Nithin")) {
					System.out.println("FullName: "+strArray[i-1]+" "+strArray[i]);
				}
				
			}
			// Check for the middle indexes of strArrar derived from String name
			else{
				if(strArray[i].equals("Kotte") && strArray[i+1].isEmpty() && strArray[i-1].isEmpty()){
					System.out.println("LastName : "+strArray[i]);
				}else if (strArray[i].equals("Nithin") && strArray[i+1].isEmpty() && strArray[i-1].isEmpty()){
					System.out.println("FirstName: "+strArray[i]);
				}else if (strArray[i].equals("Nithin") && (strArray[i+1].equals("Kotte")||strArray[i-1].equals("Kotte"))) {
					System.out.println("FullName: "+strArray[i]+" "+strArray[i+1]);
					i=i+2;
				}else if (strArray[i].equals("Kotte") && (strArray[i+1].equals("Nithin")||strArray[i-1].equals("Nithin"))) {
					System.out.println("FullName: "+strArray[i+1]+" "+strArray[i]);
					i=i+2;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		//Vary the parameterized string for desired results
		FullName fullName = new FullName("Nithin<<Kotte<<<<Kotte<Nithin<<Kotte<<Nithin<Kotte<<<<<<Kotte");	
		fullName.nameDifference();
	}

}
