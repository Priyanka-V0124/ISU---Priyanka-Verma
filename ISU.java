import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class ISU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> questionbankA = new ArrayList<>();
        ArrayList<String> questionbankB = new ArrayList<>();
        ArrayList<String[]> optionsA = new ArrayList<>();
        ArrayList<String[]> optionsB = new ArrayList<>();
        ArrayList<Character> answersA = new ArrayList<>();
        ArrayList<Character> answersB = new ArrayList<>();

        //Part A Question 1
        questionbankA.add("Phishing is best described as: ");
        optionsA.add(new String[]{
                "A) A type of computer virus that hides inside another program",
                "B) A scam where an attacker tries to trick you into revealing sensitive information by " +
                        "pretending to be a trusted source",
                "C) A method of physically stealing computer hardware",
                "D) A technique that improves the speed of your internet connection"
        });
        answersA.add('B');

        //Part A Question 2
        questionbankA.add("Which of the following is a common red flag in a phishing email? ");
        optionsA.add(new String[]{
                "A) The sender’s email address is from a well-known company you regularly do business with",
                "B) The email is addressed to you by your full name",
                "C) The email creates a sense of urgency and asks you to click a link to “verify” your " +
                        "account immediately",
                "D) The message contains no spelling or grammatical errors"
        });
        answersA.add('C');

        //Part A Question 3
        questionbankA.add("What is ransomware ?");
        optionsA.add(new String[]{
                "A) Software that displays advertisements on your screen",
                "B) Malware that encrypts your files and demands payment in exchange for the " +
                        "decryption key",
                "C) A subscription fee charged by software companies",
                "D) A type of firewall used by large businesses"
        });
        answersA.add('B');

        //Part A Question 4
        questionbankA.add("Which of the following is an example of social engineering? ");
        optionsA.add(new String[]{
                "A) Designing a new social media website",
                "B) Writing code to break a password by brute force",
                "C) Calling someone and pretending to be from IT support to get their login credentials",
                "D) Sending a file over the network without encryption"
        });
        answersA.add('C');

        //Part A Question 5
        questionbankA.add("A Trojan is malware that: ");
        optionsA.add(new String[]{
                "A) Disguises itself as a legitimate or harmless program but performs malicious " +
                        "actions once installed",
                "B) Spreads automatically across networks without any user interaction",
                "C) Only attacks devices that are not connected to the internet",
                "D) Is a type of antivirus software"
        });
        answersA.add('A');

        //Part A Question 6
        questionbankA.add("You receive a text message that says “Your package could not be delivered. Click here " +
                "to reschedule: bit.ly/xyz123.” What should you do? ");
        optionsA.add(new String[]{
                "A) Click the link right away to make sure your package arrives on time",
                "B) Reply to the message asking for more details",
                "C) Do not click the link; verify the delivery directly through the courier’s official " +
                        "website or app",
                "D) Forward the message to all your contacts to warn them"
        });
        answersA.add('C');

        //Part A Question 7
        questionbankA.add("Which of the following best describes a man-in-the-middle attack? ");
        optionsA.add(new String[]{
                "A) An attack where a hacker physically stands between two people at an ATM",
                "B) An attack where an attacker secretly intercepts and possibly alters the " +
                        "communication between two parties",
                "C) A type of denial-of-service attack",
                "D) Hardware sabotage performed inside a server room"
        });
        answersA.add('B');

        //Part A Question 8
        questionbankA.add("Vishing is a form of phishing carried out:");
        optionsA.add(new String[]{
                "A) Over voice calls",
                "B) Through video games",
                "C) Using printed letters in the mail",
                "D) By installing software from a USB drive"
        });
        answersA.add('A');

        //Part A Question 9
        questionbankA.add("Which one of the following is most likely a sign of a spoofed website? ");
        optionsA.add(new String[]{
                "A) The URL is spelled exactly the same as the official site, including the correct top-level " +
                        "domain",
                "B) The URL contains small misspellings or extra characters (e.g., “amaz0n-login.com” " +
                        "instead of “amazon.com”)",
                "C) The site shows a padlock icon next to the URL",
                "D) The site loads quickly with no errors"
        });
        answersA.add('B');

        //Part A Question 10
        questionbankA.add("Spyware is malware that primarily: ");
        optionsA.add(new String[]{
                "A) Encrypts your data and demands a ransom",
                "B) Secretly collects information about your activity, such as keystrokes or browsing " +
                        "history, and sends it to a third party",
                "C) Floods a website with requests until it crashes",
                "D) Improves your computer’s performance by removing junk files"
        });
        answersA.add('B');

        //Part B Question 1
        questionbankB.add("Which of the following is the strongest password? ");
        optionsB.add(new String[]{
                "A) password123",
                "B) Farzin2009",
                "C) Tr0ub4dor&amp;3-Spring!Tuesday",
                "D) qwerty"
        });
        answersB.add('C');

        //Part B Question 2
        questionbankB.add("Two-factor authentication (2FA) protects an account by requiring: ");
        optionsB.add(new String[]{
                "A) Two different usernames",
                "B) A password plus a second verification step, such as a code from an app or text " +
                        "message",
                "C) Two separate passwords",
                "D) The user to log in from two different devices at the same time"
        });
        answersB.add('B');

        //Part B question 3
        questionbankB.add("Why should you keep your operating system and apps up to date?");
        optionsB.add(new String[]{
                "A) Updates make your device look more modern",
                "B) Updates often include security patches that fix newly discovered vulnerabilities",
                "C) Updates always add new social media features",
                "D) Updates are only useful for gaming computers"
        });
        answersB.add('B');

        //Part B Question 4
        questionbankB.add("You see “https://” at the start of a website’s URL. This means: ");
        optionsB.add(new String[]{
                "A) The site is guaranteed to be safe and legitimate",
                "B) The data sent between your browser and the site is encrypted in transit",
                "C) The site has been certified by the government",
                "D) The site cannot contain malware"
        });
        answersB.add('B');

        //Part B Question 5
        questionbankB.add("Which of the following is the safest way to manage many different account" +
                " passwords?");
        optionsB.add(new String[]{
                "A) Use the same password on every account so you don’t forget it",
                "B) Write all your passwords on a sticky note attached to your monitor",
                "C) Use a reputable password manager to generate and store unique passwords",
                "D) Use your birthday and last name on every account"
        });
        answersB.add('C');

        //Part B Question 6
        questionbankB.add("When using public Wi-Fi (e.g., at a coffee shop), the safest practice is to:");
        optionsB.add(new String[]{
                "A) Log in to your online banking immediately to take advantage of the free network",
                "B) Avoid sensitive activities, or use a reputable VPN to encrypt your traffic",
                "C) Disable your firewall to improve speed",
                "D) Share the network password with everyone nearby"
        });
        answersB.add('B');

        //Part B Question 7
        questionbankB.add("Why might it be risky to grant a free flashlight app access to your contacts and " +
                "microphone");
        optionsB.add(new String[]{
                "A) The app needs those permissions to turn the flashlight on",
                "B) Apps can collect and share data they don’t actually need, creating a privacy risk",
                "C) Permissions make the flashlight brighter",
                "D) There is no risk; permissions are only requested by safe apps"
        });
        answersB.add('B');

        //Part B Question 8
        questionbankB.add("Which of the following is a good rule for sharing personal information online? ");
        optionsB.add(new String[]{
                "A) Post your full address and phone number on your social media profile",
                "B) Share only the minimum information needed and review your privacy settings " +
                        "regularly",
                "C) Use the same profile picture and bio on every site so people can recognize you",
                "D) Accept all friend or follower requests, including from strangers"
        });
        answersB.add('B');

        //Part B Question 9
        questionbankB.add("The “3-2-1” backup rule recommends keeping: ");
        optionsB.add(new String[]{
                "A) 3 copies of your data, on 2 different types of storage media, with 1 copy stored " +
                        "offsite",
                "B) 3 passwords, 2 usernames, and 1 email account",
                "C) Backups for 3 days, 2 weeks, and 1 month",
                "D) 3 antivirus programs running at the same time"
        });
        answersB.add('A');

        //Part B Question 10
        questionbankB.add("If you think your account has been hacked, the first thing you should do is: ");
        optionsB.add(new String[]{
                "A) Delete the account immediately",
                "B) Tell no one and hope the attacker loses interest",
                "C) Change the password, enable 2FA if available, and review recent activity for " +
                        "unauthorized access",
                "D) Post about it on social media to warn your friends"
        });
        answersB.add('C');

        System.out.println("\n*******************************************************");
        System.out.println("Welcome to Cybersecurity Awareness Certification!");
        System.out.println("*******************************************************\n");


        System.out.println("----- Main Menu -----");
        System.out.println("1. Take the certification test");
        System.out.println("2. Login as admin");

        System.out.println("Enter 1 or 2: ");
        int choice = sc.nextInt();

        //certification test
        if (choice == 1) {
            System.out.println("\n----- CERTIFICATION TEST -----\n");
            System.out.println("Part A - Recognizing Cyber Threats\n");

            int scoreA = 0; //number of correct answers in part A
            int wrongAnswerA = 0; //number of wrong answers in part A
            boolean testFail = false; //to terminate test if user can no longer proceed

            ArrayList<Integer> questionsUsedA = new ArrayList<>(); //to prevent repetition of questions

            for (int questionNum = 1; questionNum <= 6; questionNum++) {
                int randomNum = (int) (Math.random() * (9 - 0 + 1) + 0); //generates random question
                while (questionsUsedA.contains(randomNum)) {
                    randomNum = (int) (Math.random() * (9 - 0 + 1) + 0); //generates new number of question is used
                }
                questionsUsedA.add(randomNum);

                //printing question and options
                System.out.println("Question " + questionNum);
                System.out.println(questionbankA.get(randomNum));
                String[] currentOptions = optionsA.get(randomNum);
                for (int i = 0; i < 4; i++) {
                    System.out.println(currentOptions[i]);
                }
                System.out.println("\nEnter your answer: ");
                String answer = sc.next().toUpperCase();
                char userAnswer = answer.charAt(0);

                if (userAnswer == answersA.get(randomNum)) {
                    System.out.println("Correct! Well Done!\n");
                    scoreA++;
                } else {
                    System.out.println("Incorrect!\n");
                    wrongAnswerA++;

                    //cannot get 3 or more answers incorrect
                    if (wrongAnswerA >= 3) {
                        System.out.println("You can no longer continue the test. Please try again.");
                        testFail = true;
                        break;
                    }
                }
            }
            if (testFail == false) {
                System.out.println("Part A complete. Your score is " + scoreA + "/6\n");
                System.out.println("Part B - Online Privacy and Safe Practices\n");

                int scoreB = 0; //number of correct answers in Part B
                int wrongAnswerB = 0; //number of wrong answers in Part B

                ArrayList<Integer> questionsUsedB = new ArrayList<>(); //preventing repetition

                for (int questionNum = 1; questionNum <= 6; questionNum++) {
                    int randomNum = (int) (Math.random() * (9 - 0 + 1) + 0);
                    while (questionsUsedB.contains(randomNum)) {
                        randomNum = (int) (Math.random() * (9 - 0 + 1) + 0);
                    }
                    questionsUsedB.add(randomNum);

                    //printing questions and options
                    System.out.println("Question " + questionNum);
                    System.out.println(questionbankB.get(randomNum));
                    String[] currentOptions = optionsB.get(randomNum);
                    for (int i = 0; i < 4; i++) {
                        System.out.println(currentOptions[i]);
                    }

                    System.out.println("\nEnter your answer: ");
                    String answer = sc.next().toUpperCase();
                    char userAnswer = answer.charAt(0);

                    if (userAnswer == answersB.get(randomNum)) {
                        System.out.println("Correct! Well Done!\n");
                        scoreB++;

                    } else {
                        System.out.println("Incorrect!\n");
                        wrongAnswerB++;

                        if (wrongAnswerB >= 3) {
                            System.out.println("You can no longer continue the test. Please try again.");
                            testFail = true;
                            break;
                        }
                    }
                }

                if (testFail == false) {
                    System.out.println("Part B complete. Your score is " + scoreB + "/6\n");

                    int totalScore = scoreA + scoreB;
                    double percent = (totalScore / 12.0) * 100.0;

                    System.out.println("Final score: " + totalScore + "/12");
                    System.out.println("Percentage: " + percent + "%\n");

                    if (percent >= 75 && scoreA >= 4 && scoreB >= 4) {
                        System.out.println("Congratulations! You passed the certification.");
                    } else {
                        System.out.println("You failed the certification.");
                    }
                }
            }

        //admin login
        } else if (choice == 2) {
            System.out.println("\n----- ADMIN LOGIN -----");
            String password = "adminPass123";
            System.out.println("Enter admin password: ");
            String passEntered = sc.next();

            if (password.equals(passEntered)) {
                System.out.println("\nLogin successful!\n");
                System.out.println("1. Add a question");
                System.out.println("2. Remove a question");
                System.out.println("Enter 1 or 2: ");
                int adminChoice = sc.nextInt();

                //admin selects add a question
                if (adminChoice == 1) {
                    System.out.println("\nAdd question selected.");
                    System.out.println("Which part do you want to add to? A or B?");
                    String partChoice = sc.next().toUpperCase();

                    System.out.println("Enter new question: ");
                    String newQuestion = sc.nextLine();
                    sc.nextLine();

                    System.out.println("Enter option A: ");
                    String optionA = sc.nextLine();

                    System.out.println("Enter option B: ");
                    String optionB = sc.nextLine();

                    System.out.println("Enter option C: ");
                    String optionC = sc.nextLine();

                    System.out.println("Enter option D: ");
                    String optionD = sc.nextLine();

                    System.out.println("Enter correct answer: ");
                    String strAnswer = sc.next().toUpperCase();
                    char newAnswer = strAnswer.charAt(0);

                    String[] newOptions = {
                            "A) " + optionA,
                            "B) " + optionB,
                            "C) " + optionC,
                            "D) " + optionD };

                    //adding question, options and correct answer to part A
                    if (partChoice.equals("A")) {
                        questionbankA.add(newQuestion);
                        optionsA.add(newOptions);
                        answersA.add(newAnswer);
                        System.out.println("Question successfully added to part A.");

                    //adding question/ options and correct answer to part B
                    } else if (partChoice.equals("B")) {
                        questionbankB.add(newQuestion);
                        optionsB.add(newOptions);
                        answersB.add(newAnswer);
                        System.out.println("Question successfully added to part B.");

                    } else {
                        System.out.println("Invalid part");
                    }

                //admin selects remove a question
                } else if (adminChoice == 2) {
                    System.out.println("\nRemove question selected");
                    System.out.println("Which part do you want to remove from? A or B?");
                    String partChoice = sc.next().toUpperCase();

                    System.out.println("Which question do you want to remove? (1-10): ");
                    int numRemove = sc.nextInt();
                    int index = numRemove - 1;

                    //removing from part A or B
                    if (partChoice.equals("A")) {
                        questionbankA.remove(index);
                        optionsA.remove(index);
                        answersA.remove(index);
                        System.out.println("Question " + numRemove + " successfully removed from part A.");
                    } else if (partChoice.equals("B")) {
                        questionbankB.remove(index);
                        optionsB.remove(index);
                        answersB.remove(index);
                        System.out.println("Question " + numRemove + " successfully removed from part B");
                    } else {
                        System.out.println("Invalid");
                    }
                } else {
                    System.out.println("Invalid choice");
                }
            } else {
                System.out.println("Incorrect password");
            }
        }
    }
}
