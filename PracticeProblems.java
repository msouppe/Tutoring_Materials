public static void printOdds(int n) {
	for (int i = 1; i <= n; i++) {
		int odd = 2 * i – 1;
		System.out.print(odd + " ");
	}
	System.out.println();
}

public static void halfTheFun(int number) {
	number = number / 2;
	for (int count = 1; count <= number; count++) {
		System.out.print(count + " ");
	}
	System.out.println();
}

public static void ftoc(double tempf, double tempc) {
	tempc = (tempf – 32) * 5 / 9;
	return tempc;
}

Given the variable declarations
	int x = 4;
	int y = –3;
	int z = 4;
What are the results of the following relational expressions?
	a. x == 4
	b. x == y
	c. x == z
	d. y == z
	e. x + y > 0
	f. x – z != 0
	g. y * y <= z
	h. y / y == 1
	i. x * (y + 2) > y - (y + z) * 2

public static void ifElseMystery1(int x, int y) {
	int z = 4;
	if (z <= x) {
		z = x + 1;
	} else {
		z = z + 9;
	}
	if (z <= y) {
		y++;
	}
	System.out.println(z + " " + y);
}
What output is produced for each of the following calls?
	a. ifElseMystery1(3, 20);
	b. ifElseMystery1(4, 5);
	c. ifElseMystery1(5, 5);
	d. ifElseMystery1(6, 10);

Write Java code to read an integer from the user, then print even if that number is an even number or odd otherwise. You may assume that the user types a valid integer.










public static void main(String[] args)
	int a = 10;
	int b = 2;
	if ( a % b == 0 )
	{
	   System.out.println(a + " is divisible by "+ b);
	}
	else
	{
	   System.out.println(a + " is not divisible by " + b);
	}
}

What does this function do?
What is the output for function1("hello")?
public static String function1 (String phrase) {
	String result = "";
	for (int i = 0; i < phrase.length(); i++) {
		result = phrase.charAt(i) + result;
	}
	return result;
}

What is the output for this nested for loop?
for (int i = 1; i <= 3; i++) {
	for (int j = 1; j <= 2; j++) {
		System.out.printf("%5d", i * j);
	}
	System.out.println();
}

Which one if these two lines of code will print out inifinity and why?
	a. int x = 1 / 0;
	b. double x = 1.0 /0.0;

Assume the variables a = 2, b = 4, and c = 6. Indicate by circling the T or F if each
of the following conditions is true or false.
	a == 4 || b > 2 	T F
	6 <= c && a > 3 	T F
	1 != b && c != 3 	T F
	a >= -1 || a <= b 	T F
	!(a > 2) 			T F

Write an if statement to check whether the variable x is equal to y.

Consider the following method:
public static void ifElseMystery2(int a, int b) {
	if (a * 2 < b) {
		a = a * 3;
	} else if (a > b) {
		b = b + 3;
	}
	if (b < a) {
		b++;
	} else {
		a– –;
	}
	System.out.println(a + " " + b);
}
What output is produced for each of the following calls?
	a. ifElseMystery2(10, 2);
	b. ifElseMystery2(3, 8);
	c. ifElseMystery2(4, 4);
	d. ifElseMystery2(10, 30);

What is wrong with the following code, which attempts to add all numbers from 1 to a given maximum? Describe
how to fix the code.
public static int sumTo(int n) {
	for (int i = 1; i <= n; i++) {
	int sum = 0;
	sum += i;
	}
	return sum;
}

Find the errors in the following code.
if (average = 100) 
	System.out.println("Perfect Average!");

Find the errors in the following code.
if (x == 1);
	y = 2;
else if (x == 2);
	y = 3;
else if (x == 3);
	y = 4;

Assume that the double variable number holds the value 0.0329. What format pattern
would you use with the DecimalFormat class to display the number as 00000.033?

Write a program that asks the user to enter a number of seconds.
	a) There are 60 seconds in a minute. If the number of seconds entered by the user is
	   greater than or equal to 60, the program should display the number of minutes in that
	   many seconds.
	b) There are 3,600 seconds in an hour. If the number of seconds entered by the user is
	   greater than or equal to 3,600, the program should display the number of hours in
	   that many seconds.
	c) There are 86,400 seconds in a day. If the number of seconds entered by the user is
	   greater than or equal to 86,400, the program should display the number of days in
	   that many seconds.

The following code was intended to print a message, but it actually produces no output. Describe how to fix the
code to print the expected message.
double gpa = 3.2;
if (gpa * 3 == 9.6) {
	System.out.println("You earned enough credits.");
}

Consider a String stored in a variable called name that stores a person’s first and last name (e. g., “Marla Singer”).
Write the expression that would produce the last name followed by the first initial (e. g., “Singer, M.”).

Write a method called repl that accepts a String and a number of repetitions as parameters and returns the
String concatenated that many times. For example, the call repl("hello", 3) should return
"hellohellohello". If the number of repetitions is zero or less, the method should return an empty string.

Write a method called pow that accepts a base and an exponent as parameters and returns the base raised to the given
power. For example, the call pow(3, 4) should return 3 * 3 * 3 * 3, or 81. Assume that the base and exponent
are nonnegative.






Write a method called printRange that accepts two integers as arguments and prints the sequence of numbers
between the two arguments, enclosed in square brackets. Print an increasing sequence if the first argument is smaller
than the second; otherwise, print a decreasing sequence. If the two numbers are the same, that number should be
printed between square brackets. Here are some sample calls to printRange:
	printRange(2, 7);
	printRange(19, 11);
	printRange(5, 5);
The output produced from these calls should be the following sequences of numbers:
	[2, 3, 4, 5, 6, 7]
	[19, 18, 17, 16, 15, 14, 13, 12, 11]
	[5]
