import java.util.*;
     class switchcondition1
     {
	         public static void main(String[] args) {
	          Scanner sc=new Scanner(System.in);
		        System.out.print("1:even or odd \n2:find gread \n3:find cube \n4:greatest number");
		        int ch = sc.nextInt();
		        
		        switch (ch) {
		            case 1:
		                System.out.print("Enter a number: ");
		                int num = sc.nextInt();
		                if (num % 2 == 0) {
		                    System.out.println("The given number is even.");
		                } else {
		                    System.out.println("The given number is odd.");
		                }
		                break;

		            case 2:
		                int totalMarks = 0;
		                for (int i = 1; i <= 5; i++) {
		                    System.out.print("Enter marks for subject " + i + ": ");
		                    totalMarks += sc.nextInt();
		                }
		                int averageMarks = totalMarks / 5;
		                if (averageMarks >= 90) {
		                    System.out.println("Grade: A+");
		                } else if (averageMarks >= 80) {
		                    System.out.println("Grade: A");
		                } else if (averageMarks >= 70) {
		                    System.out.println("Grade: B");
		                }else if (averageMarks >= 60) {
		                     System.out.println("Grade: c");
		                } else {
		                    System.out.println("Grade: D");      
		                }
		                break;

		            case 3:
		                System.out.print("Enter a number: ");
		                int cubenum = sc.nextInt();
		                if (cubenum % 5 == 0) {
		                    int cube = cubenum *cubenum * cubenum;
		                    System.out.println("Cube of the number (divisible by 5): " + cube);
		                } else {
		                    System.out.println("The number is not divisible by 5.");
		                }
		                break;

		            case 4:
		                System.out.print("Enter the  Three number: ");
		                int num1 = sc.nextInt();
		                int num2 = sc.nextInt();
		                int num3 = sc.nextInt();

		                int max = num1;
		                if (num2 > max) {
		                    max = num2;
		                }
		                if (num3 > max) {
		                    max = num3;
		                }

		                System.out.println("The greatest number is: " + max);
		                break;

		            default:
		                System.out.println("Invalid choice");
		        }
		    }
		
                      }
