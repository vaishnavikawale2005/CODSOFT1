package CODSOFT;

import java.util.Scanner;

public class Two {
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    
    System.out.print("Enter the no. of Subjects:");
    int subno=scanner.nextInt();

    int totalmarks=0;
    for(int i=1;i<=subno;i++){
        System.out.print("Enter marks for Subject "+i+"(out of 100):");
        int marks=scanner.nextInt();
        totalmarks+=marks;
    }
    double avg =totalmarks/subno;

    String grade;

    if (avg>=90) {
        grade= "A+";
    }
    else if (avg>=80) {
        grade="A";
    }
    else if (avg>=70) {
        grade="B";
    }
    else if (avg>=60) {
        grade="C";
    }
    else if (avg>=50) {
        grade="D";
    }
    else {
        grade="F";
    }

    System.out.println("\n Results--");
    System.out.println("Totalmarks:"+totalmarks);
    System.out.printf("Average Percentile: %.2f%%\n",+avg);
    System.out.println("Grade:"+grade);

}
}
