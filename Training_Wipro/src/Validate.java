

public class Validate {
	
	
	public static boolean validateMobileNo(String mob)
	{
	
		if(mob.length()==10 && mob.matches("[0-9]+?"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
//	Early defect
//	coverage
//	good teamwork
//	code cleaner , easy to understand

}
