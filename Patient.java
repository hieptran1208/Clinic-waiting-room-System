
public class Patient 
{
	String name;
	int number;
	
	
	public Patient(String name, int num)
	{
		this.name = name;
		this.number = num;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setNum(int num){
		number = num;
	}
	
	public String getName(){
		return name;
	}
	
	public int getNum(){
		return number;
	}
}
