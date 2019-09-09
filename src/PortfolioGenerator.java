
import java.io.*;
import java.util.*;
import java.text.*;

        public class PortfolioGenerator {



                public static void main (String[]args){

                    ArrayList<String> pList = new ArrayList();
                    ArrayList<String> Ach = new ArrayList();
                    SafeInput sI = new SafeInput();



                    Boolean marker = true;
                    Boolean markerTwo = true;

                    Scanner scanner = new Scanner(System.in);

                    // These are just the numbers for when the input is printed to the file
                    int i = 1;
                    int b = 1;


                    String email = "";
                    String lang = "";
                    String aAndI = "";

                    // Name Entry
                    System.out.println("What's your name?");
                    String name = scanner.nextLine();

                    // Email Entry
                    System.out.println("What's your email");
                    email = scanner.nextLine();
                    sI.getEmail(email);

                    // Email Verification in SafeInput EXTRA CREDIT
                    while (!sI.getEmail(email)) {
                        System.out.println("Invalid Response: Retry");
                        email = scanner.nextLine();
                    }

                    System.out.println("Can you give some of your personal background?");
                    String personal = scanner.nextLine();

                    // Personal Info Validation
                    while (!sI.getString(personal)) {
                        System.out.println("You didn't write enough! Try again!");
                        personal = scanner.nextLine();
                    }


                    // Loop for multiple answers
                    while (marker) {
                        System.out.println("Programming Languages");
                        lang = scanner.next();
                        pList.add(new String(lang));
                        System.out.println("Is there any more? Y/N");
                        Character answer = scanner.next().charAt(0);
                        if (answer == 'N') {
                            marker = false;
                        }
                    }
                    System.out.println(pList);


                    System.out.println(pList);
                    while (markerTwo) {
                        System.out.println("Achievements and interests you would like to share");
                        aAndI = scanner.next();
                        Ach.add(scanner.next());
                        System.out.println("More Y/N");
                        Character answerTwo = scanner.next().charAt(0);
                        if (answerTwo == 'N') {
                            markerTwo = false;
                        }
                    }

                        // Write to file
                        try {
                            FileWriter fw = new FileWriter("outputFile.txt");
                            PrintWriter pw = new PrintWriter(fw);

                            pw.println("***************************");
                            pw.println(name);
                            pw.println("***************************");
                            pw.println(" ");
                            pw.println("E-mail: " + email);
                            pw.println(" ");
                            pw.println("** Personal Background:");
                            pw.println(personal);
                            pw.println("** Programming Languages:");
                            pw.println("---------------------------");
                            for (String s : pList) {

                                pw.println(i + ". " + s);
                                i++;
                            }
                            pw.println();
                            pw.println("** Achievements and interests:");
                            pw.println("-------------------------------");
                            for (String a : Ach) {

                                pw.println(b + ". " + a);
                                b++;


                            }
                                pw.close();
                        } catch (IOException e) {
                        }

                }
            }


