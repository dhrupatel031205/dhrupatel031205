package InstaJava;

import java.util.Scanner;

/**
 * Insta
 */
public class Insta {
    /*
     * main method()
     * this method operats whole program
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean b = true;
        while (b) {
            System.out.println("1. You are new user");
            System.out.println("2. You are old user");
            System.out.println("3. Exit from the system");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    User.signIn();
                    break;
                case 2:
                    User.logIn();
                    break;
                case 3:
                    System.exit(0);
                    b = false;
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }

    /*
     * optionMenu() method 
     * this method helps the user to redirect that perticular section
     */
    public static void optionMenu(User user) {
        Scanner scanner = new Scanner(System.in);
        boolean b = true;
        while (b) {
            System.out.println("1. see your profile");
            System.out.println("2. update your profile");
            System.out.println("3. upload the post");
            System.out.println("4. message someone");
            System.out.println("5. search option");
            System.out.println("6. see random reels");
            System.out.println("7. exit from the system");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    seeMyProfile(user);
                    break;
                case 2:
                    updateMyProfile(user);
                case 3:
                    uploadPost(user);
                case 4:
                    messageSomeone(user);
                case 5:
                    serachOption(user);
                case 6:
                    seeRandomReels(user);
                case 7:
                    b = false;
                    System.exit(0);
                default:
                    break;
            }
            scanner.close();
        }
    }

    /*
     * seeRandomReels() method
     * this method redirect user into the reels section
     */
    public static void seeRandomReels(User user) {
        RandomReels.showReels(user);
    }

    /*
     * serachOption() method 
     * this method goes to the search section
     */
    public static void serachOption(User user) {
        Search.searchOptions(user);
    }

    /*
     * uploadPost() method
     * this method helps the user to create the posts
     */
    public static void uploadPost(User user) {
        Posts.postOptions(user);
    }

    /*
     * messageSomeone() method
     * this method goes to the message section
     */
    public static void messageSomeone(User user) {
        Dm.messageSection(user);
    }

    /*
     * updateMyProfile() method
     * this method update the basic details of the user 
     */
    public static void updateMyProfile(User user) {
        User.updateUser(user);
    }

    /*
     * seeMyProfile() method 
     * this method shows all the basic details of the user
     */
    public static void seeMyProfile(User user) {
        User.display(user);
    }
}
