import java.util.Scanner;

public class HousingSelector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;


        System.out.println("Hello and welcome to the Housing Selection Process. We will be asking a few questions to help determine your eligibility for campus housing.\nPart I\nWhat Year are you in? \n1. Freshmen 2. Sophomore 3. Junior 4. Senior 5. Super Senior 6. Graduate/Masters : ");
        int yer = sc.nextInt();
        sc.nextLine();
        switch (yer) {
            case 1:
                score = score + 1;
                break;
            case 2:
                score = score + 2;
                break;
            case 3:
                score = score + 3;
                break;
            case 4:
                score = score + 4;
                break;
            case 5:
                score = score + 5;
                break;
            default:
                System.out.println("Error");
                break;
        }

        System.out.println("Will you enroll as a Full-Time or Part-Time Student? \n1. Full-Time 2. Part-Time : ");
        int term = sc.nextInt();
        sc.nextLine();
        switch (term) {
            case 1:
                score = score + 2;
                break;
            case 2:
                score = score + 1;
                break;
            default:
                System.out.println("Error");
                break;
        }

        System.out.println("How old are you? : ");
        int age = sc.nextInt();
        sc.nextLine();
        if (age < 18 && age > 0) {
            score = score + 1;
        } else if (age < 20 && age >= 18) {
            score = score + 4;
        } else if (age < 22 && age >= 20) {
            score = score + 2;
        } else if (age >= 22) {
            score = score + 3;
        } else {
            System.out.println("Error");
        }

        System.out.println("Are you eligible for Financial Aid? (yes or no) : ");
        String ap = sc.nextLine().toLowerCase();

        if (ap.equals("yes")) {
            score = score + 3;
        } else if (ap.equals("no")) {
            score = score - 1;
        } else {
            System.out.println("Error");
        }

        System.out.println("Are you an Internation Student ? (yes or no) :");
        String intu = sc.nextLine().toLowerCase();

        if (intu.equals("yes")) {
            score = score + 5;
        } else if (intu.equals("no")) {
            System.out.println("How far do you live from SFSU (In miles please) : ");
            int dis = sc.nextInt();
            sc.nextLine();
            if (dis <= 20 && dis > 0) {
                score = score + 1;
            } else if (dis <= 50 && dis > 20) {
                score = score + 2;
            } else if (dis <= 100 && dis > 50) {
                score = score + 3;
            } else if (dis > 100) {
                score = score + 4;
            } else {
                System.out.println("Error");
            }

            System.out.println("Do you have any Academic Probation (yes or no) : ");
            String fa = sc.nextLine().toLowerCase();
            if (fa.equals("yes")) {
                score = score - 3;
            } else if (fa.equals("no")) {

            } else {
                System.out.println("Error");
            }

            System.out.println("Do you have any Criminal Record (yes or no) : ");
            String cr = sc.nextLine().toLowerCase();
            if (cr.equals("yes")) {
                score = score - 5;
            } else if (cr.equals("no")) {
                score = score + 1;
            } else {
                System.out.println("Error");
            }

            System.out.println("Do you have a Disability (yes or no) : ");
            String disa = sc.nextLine().toLowerCase();
            if (disa.equals("yes")) {
                score = score + 2;
            } else if (disa.equals("no")) {
                score = score + 0;
            } else {
                System.out.println("Error");
            }


            System.out.println("Thank you for your time , Here is your housing score : " + score);
        }
    }
}
