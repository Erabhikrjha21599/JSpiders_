class TotalMarkAndPercentage
{
	public static void main(String[] args)
	{
		int science_mark_is = 78;
		int social_science_mark_is = 89;
		int math_mark_is = 99;
		int english_mark_is =88;
		int hindi_mark_is = 67;

		float over_all_percentage_is = science_mark_is + social_science_mark_is + math_mark_is + english_mark_is + hindi_mark_is/100;

		System.out.println(science_mark_is);
		System.out.println(social_science_mark_is);
		System.out.println(math_mark_is);
		System.out.println(english_mark_is);
		System.out.println(hindi_mark_is);
		
		System.out.println(over_all_percentage_is);
	}
}