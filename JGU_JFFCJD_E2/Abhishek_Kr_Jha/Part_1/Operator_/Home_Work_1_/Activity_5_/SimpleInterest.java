class SimpleInterest
{
	public static void main(String[] args)
	{
		int principle_amount = 8;
		int time_is = 60;
		int rate_of_interest = 12;

		float simple_interest = principle_amount*time_is*rate_of_interest/100;
		
		System.out.println(principle_amount);
		System.out.println(time_is); 
		System.out.println(rate_of_interest);

		System.out.println(simple_interest);
	}
}