# ISU-Priyanka-Verma

Priyanka Verma - ICS3U

**************************************
Cybersecurity Awareness Certification 
**************************************

---Program overview---

This program is a cybersecurity awareness certification quiz which consists of 2 parts, part A (recognizing cyber threats) and part B (online privacy and safe practices). The user can choose to either take the quiz or login as an admin. Each part in the quiz consist of a bank of 10 questions, 6 of which are randomly chosen to be printed. The user must get atleast 4/6 questions correct in each part in order to pass. 

---Main variables---
1. Question ArrayLists
ArrayList<String> questionbankA and ArrayList<String> questionbankB are both arraylists created to store all the questions in each bank

2. Options ArrayLists
ArrayList<String[]> optionsA and ArrayList<String[]> optionsB are both arraylists used to store the various potential answers for each question.

3. Answer ArrayLists
ArrayList<Character> answersA = new ArrayList<>() and ArrayList<Character> answersB = new ArrayList<>() are arraylists used to store the character of the correct answer for each question.

4. Scores
int scoreA and int scoreB are both variables used to track the correct answers during the quiz in each section.

 5. Wrong answers
int wrongAnswerA aned int wrongAnswerB are used to track the number of incorrect answers in each secion throughout the quiz.

6. Used questions
ArrayList<Integer> questionsUsedA and ArrayList<Integer> questionsUsedB are used to store the indexes of the questions that have already been used in the quiz. This is to prevent repeition of the questions.

7. Failure of test
boolean testFail is used to determine whether the test should be terminated early if at any point it is clear the user cannot pass.

---Program structure---

Main menu

The user is greeted and showed 2 options, Take the Certification Test or Login as Admin. The user's choice determines which section is run. 

Certification test

Six questions are randomly chosen from the questions bank A. A while loop ensures that none of the questions are repeated throughout it. The question is displayed alongside the options (A, B, C, D). The user inputs their answer and it is checked with the correct answer. If the answer is correct, the score variable goes up, however if it is incorrect, the wrong answer variable increases instead. If at any point the user has chosen 3 incorrect answers, their test is terminated, since they MUST get atleast 4 correct out of the 6. Part B is repeated with the same process but uses the Part B question bank, B options and B answers. After both parts (A and B) are completed, the scores from each section are combined. The final score and percentage is calculated and displayed to the user. The user only passes if their pecentage is 75% or higher and answers atleast 4 questions correctly in each section. 

Admin menu

The program asks the user to input the admin password to gain access to the admin menu. If the password is correct, the user gains access to the menu and is allowed to add or remove a question from the quiz. They are prompted to choose which part they want to add or remove from. If the user chooses to add a question, they input the new question along with all the possible answers and the correct answer. This information is added to the updated array variables. If the user chooses to remove a question, they choose a number from 1-10 to determine which question is getting removed. The array variables are then updated with the new changes. 
