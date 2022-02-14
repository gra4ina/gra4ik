public enum Season {
	WINTER, SPRING, SUMMER, AUTUMN
}

BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
System.out.println("Please input any month and program will define the season it belongs to.");
String month = br.readLine();

	Season season;

	switch (month.toLowerCase()) {
	case "december":
	case "january":
	case "february":
		season = Season.WINTER;
		System.out.println("Your month is " + month + " and the season is " + season);
		break;
	case "march":
	case "april":
	case "may":
		season = Season.SPRING;
		System.out.println("Your month is " + month + " and the season is " + season);
		break;
	case "june":
	case "july":
	case "august":
		season = Season.SUMMER;
		System.out.println("Your month is " + month + " and the season is " + season);
		break;
	case "september":
	case "october":
	case "november":
		season = Season.AUTUMN;
		System.out.println("Your month is " + month + " and the season is " + season);
		break;
	default:
       	System.out.println("Incorrect input");
}
