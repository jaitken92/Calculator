import java.util.Scanner;                                                                         //Imported the Java frame works required for the Java user scanner for user input,
import java.text.NumberFormat;                                                                    // as well the frame work for the number format to add the money sign to the numbers that deal with money.

public class incomeCalculator
{

	static Scanner sc = new Scanner(System.in);
    static NumberFormat nf = NumberFormat.getCurrencyInstance();                                      //Here is where all of the variables are listed and initialized. Some are given values here
    final static double weeks = 4.33333333;                                                           //other variables are given values later on or the program won't function right.
    final static int months = 12;
    static double amountPerHour;
    static int hoursADay;
    static double daysAWeek;                                                                          //The static variables are initialized through out the whole program.
    static double amountPerDay;
    static double amountPerWeek;
    static double amountPerMonth;
    static double amountPerYear;
    static double amountPerFiveYears;
    static String state;
	static String income;
	static boolean validInput = true;
	static String place;


	 public static void main(String[]args)                                       //Here is the main class. I broke my code into two classes the calculator and aveIncome classes which I turned into methods
	{                                                                            //for easier use. The calculator method calls the first class and the aveIncome method calls the aveIncome class toward
                calculator();                                                    //the bottom of the page. The aveIncome class and method are named for the short hand Average Income.
		        aveIncome();                                                     //the calculator class and method are named because of the math or algorithm in it.
	}


	public static void calculator()                                                                       //The Calculator class and method.
    {

		System.out.println(" Welcome to Income Calculator! ");
		System.out.println(" Please enter how much money you make an hour?");                                //The first block of code is the user interaction where the program asks the user for specific
		amountPerHour = sc.nextDouble();                                                                     //inputs that are then used to give certain relievent variables values to use in the algorithm.
		System.out.println(" Thank you! Now please enter how many days a week you work on average?");        //The user enters the values via the java scanner initialized along side the variables above.
		daysAWeek = sc.nextDouble();
		System.out.println(" Finaly! Please enter how many hours in a day you work ");
		hoursADay = sc.nextInt();

		amountPerDay =((amountPerHour)*(hoursADay));                                          //The secound block of code is the algorithm or math itself. It uses the previously intialized variables
		amountPerWeek = ((amountPerDay)*(daysAWeek));                                                  //a long with the user given values to calculate values for the user.
		amountPerMonth = ((amountPerWeek)*(weeks));
		amountPerYear = ((amountPerMonth)*(months));
		amountPerFiveYears = (amountPerYear) * 5;

		System.out.println(" You make " + nf.format(amountPerDay)+ " Per Day!");                 //The third and last block of text in the calculator class is simply relaying the data calculations back
		System.out.println(" You make " + nf.format(amountPerWeek) + " Per Week!");               //to the user in an orderly, well displayed format.
		System.out.println(" You make " + nf.format(amountPerMonth) + " Per Month!");
		System.out.println(" You make " + nf.format(amountPerYear) + " Per Year!");
		System.out.println(" You make " + nf.format(amountPerFiveYears) + " Per Five Years!");


	}

	public static void aveIncome()                                                                                         //The start of the second class and method aveIncome.
	{
		System.out.println(" Please enter a state to view that state's average income per year! ");
		System.out.print(" NOTE. If the state you are trying to enter has a 2 word name please enter it by abbreviation.");
		System.out.println(" EX...WV or wv");


		do
		{                                                                        //A do-while loop is used here so if a incorrect input is entered the program will display an error message and give the
		    state = sc.next();                                                   //the user an oppertunity to re-enter the name without having to close the whole program and start again.
		    validInput = true;

		    switch(state.toUpperCase())                                        //The switch is used to match the users input with one of the switches which is coded to output the given information
		    {                                                                  //that the user has requested info about.
			    case "ALABAMA":
			    case "AL":                                                     // A boolean statement is used to create a loop. A second re-initialization of the validInput boolean value was need for
				    income = "$43,330";                                        // the loop to work properly through multiple loop cylce processes while running.
				    place = "Alabama";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;
                                                                                                            //Each state is given multiple cases to make it easier on the user to indicate which state
			    case "ALASKA":                                                                              //they want more infomation on.
			    case "AK":
				    income = "$61,749";
				    place = "Alaska";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));           //The income variable is initalized early on but on;y given a value during the switch selection
				    break;                                                                                  //so only the income value of the selected state is displayed to the user.

			    case "ARIZONA":
			    case "AZ":                                                                                  //The place is similar to the income variable(s), only the selected name will be displayed to
				    income = "$49,698";                                                                     //to the user of the chosen state a long with the income value.
				    place = "Arizona";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;                                                                                  //The system.out.println is what the screen displays to the user.

			    case "ARKANSAS":
			    case "AR":
				    income = "$40,877";
				    place = "Arkansas";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "CALIFORNIA":
			    case "CA":
				    income = "$57,161";
				    place = "California";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "COLORADO":
			    case "CO":
				    income = "$61,634";
				    place = "Colorado";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "CONNECTICUT":
			    case "CT":
				    income = "$67,807";
				    place = "Connecticut";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "DELAWARE":
			    case "DE":
				    income = "$54,377";
				    place = "Delaware";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "DISTRICT OF COLUMBIA":
			    case "DC":
				    income = "$61,229";
				    place = "D.C";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "FlORIDA":
			    case "FL":
				    income = "$47,106";
				    place = "Florida";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "GEORGIA":
			    case "GA":
				    income = "$47,753";
				    place = "Georgia";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "HAWAII":
			    case "HI":
				    income = "$60,814";
				    place = "Hawaii";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "IDAHO":
			    case "ID":
				    income = "$49,952";
				    place = "Idaho";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "ILLINOIS":
			    case "IL":
				    income = "$54,083";
				    place = "Illinois";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "INDIANA":
			    case "IN":
				    income = "$48,178";
				    place = "Indiana";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "IOWA":
			    case "IA":
				    income = "$53,364";
				    place = "Iowa";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "KANSAS":
			    case "KS":
				    income = "$49,804";
				    place = "Kansas";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "KENTUCKY":
			    case "KY":
				    income = "$42,260";
				    place = "Kentucky";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "LOUISIANA":
			    case "LA":
				    income = "$40,844";
				    place = "Louisiana";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "MAINE":
			    case "ME":
				    income = "$50,668";
				    place = "Maine";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "MARYLAND":
			    case "MD":
				    income = "$69,518";
				    place = "Maryland";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "MASSACHUSETTS":
			    case "MA":
				    income = "$64,555";
				    place = "Massachsetts";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "MICHIGAN":
			    case "MI":
				    income = "$49,902";
				    place = "Michigan";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "MINNESOTA":
			    case "MN":
				    income = "$59,847";
				    place = "Minnesota";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "MISSISSIPPI":
			    case "MS":
				    income = "$40,338";
				    place = "Mississippi";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "MISSOURI":
			    case "MO":
				    income = "$49,290";
				    place = "Missouri";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "MONTANA":
			    case "MT":
				    income = "$43,924";
				    place = "Montana";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "NEBRASKA":
			    case "NE":
				    income = "$55,107";
				    place = "Nebraska";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "NEVADA":
			    case "NV":
				    income = "$49,204";
				    place = "Nevada";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "NEW HAMPSHIRE":
			    case "NH":
				    income = "$69,888";
				    place = "New Hampshire";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "NEW JERSEY":
			    case "NJ":
				    income = "$65,321";
				    place = "New Jersey";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "NEW MEXICO":
			    case "NM":
				    income = "$44,472";
				    place = "New Mexico";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "NEW YORK":
			    case "NY":
				    income = "$51,962";
				    place = "New York";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "NORTH CAROLINA":
			    case "NC":
				    income = "$55,583";
				    place = "North Carolina";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "NORTH DAKOTA":
			    case "ND":
			 	    income = "$55,583";
			 	    place = "North Dakota";
			 	    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "OHIO":
			    case "OH":
			  	    income = "$46,672";
			  	    place = "Ohio";
			  	    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "OKLAHOMA":
			    case "OK":
				    income = "$47,282";
				    place = "Oklahoma";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "OREGON":
			    case "OR":
				    income = "$54,066";
				    place = "Oregon";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "PENNSYLVANIA":
			    case "PA":
				    income = "$52,481";
				    place = "Pennsylvania";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "RHODE ISLAND":
			    case "RI":
				    income = "$55,158";
				    place = "Rhode Island";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "SOUTH CAROLINA":
			    case "SC":
				    income = "$43,716";
				    place = "South Carolina";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "SOUTH DAKOTA":
			    case "SD":
				    income = "$50,488";
				    place = "South Dakota";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "TENNESSEE":
			    case "TN":
				    income = "$42,785";
				    place = "Tennessee";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "TEXAS":
			    case "TX":
				    income = "$51,752";
				    place = "Texas";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "UTAH":
			    case "UT":
				    income = "$60,053";
				    place = "Utah";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "VERMONT":
			    case "VT":
				    income = "$56,175";
				    place = "Vermont";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "VIRGINIA":
			    case "VA":
			    	income = "$65,635";
			    	place = "Virginia";
			    	System.out.println(" The average income for " + (place)+ " is: " + (income));
			    	break;

			    case "WASHINGTON":
			    case "WA":
				    income = "$60,520";
				    place = "Washington";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "WEST VIRGINIA":
			    case "WV":
				    income = "$43,361";
				    place = "West Virginia";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "WISCONSIN":
			    case "WI":
				    income = "$54,205";
				    place = "Wisconsin";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    case "WYOMING":
			    case "WY":
				    income = "$56,569";
				    place = "Wyoming";
				    System.out.println(" The average income for " + (place)+ " is: " + (income));
				    break;

			    default:
				    System.out.println(" ERROR! PLEASE CHECK YOUR SPELLING AND TRY AGAIN! ");
				    validInput = false;
				    break;

				}


			}while (!validInput);                                                               //The (!validInput) means the opposite or false in boolean language. If no switch is matched the
                                                                                     //default switch is automatically used which in this program is taken advantage by having it display
                                                                                //an error message as well as activating the while part of the do-while loop since it gives the validInput the false value
		}                                                                      //restarting the loop from the beginning and giving the user another chance to enter a correct switch value without
                                                                               //exiting or restarting the whole program.

	}

 //Created by. John Aitken