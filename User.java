package InstaJava;

/*
 * this file will have the access to add new user or remove that user
 * and all the users have to enter from here first and helps them to go 
 * to the perticular sections 
 * 
*/

// import statements
import java.util.*;
import ExtraFunctions.*;

class User {
    // instance variables
    String fullName;
    String userName;
    String passWord;
    String emailId;
    String mobileNumber;
    int followers;
    int following;
    int posts;
    Scanner scanner = new Scanner(System.in);
    static ArrayList<User> userList = new ArrayList<User>();

    // perameterized constructor
    public User(String fullName, String userName, String passWord, String emailId, String mobileNumber, int followers,
            int following, int posts) {
        this.fullName = fullName;
        this.userName = userName;
        this.passWord = passWord;
        this.emailId = emailId;
        this.mobileNumber = mobileNumber;
        this.followers = followers;
        this.following = following;
        this.posts = posts;
    }

    // default constructor
    public User() {
    }

    // getters and setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public int getPosts() {
        return posts;
    }

    public void setPosts(int posts) {
        this.posts = posts;
    }

    // signIn() method --> this method will add the user
    public static void signIn() {
        Scanner scanner = new Scanner(System.in);
        // taking the details of the user
        System.out.println("Enter the first name of the user ");
        String firstName = scanner.nextLine();
        System.out.println("Enter the middle name of the user ");
        String middleName = scanner.nextLine();
        System.out.println("Enter the last name of the user ");
        String lastName = scanner.nextLine();
        String fullName = firstName + " " + middleName + " " + lastName;
        String userName = ExtraFunction.setUserName();
        String passsword = ExtraFunction.setPassword();
        String phoneNumber = ExtraFunction.setMobileNumber();
        String emaiId = ExtraFunction.setEmailId();
        // create new user and add into the list
        User newUser = new User(fullName, userName, passsword, emaiId, phoneNumber, 0, 0, 0);
        userList.add(newUser);
        scanner.close();
    }

    /*
     * logIn() method --> user have to enter the proper username and password
     * for enter into the system
     */
    public static void logIn() {
        Scanner scanner = new Scanner(System.in);
        boolean b = true;
        int flag = 0;
        User userEntered = null;
        while (b) {
            System.out.println("Enter your user name");
            String userName = scanner.nextLine();
            System.out.println("Enter your password");
            String password = scanner.nextLine();
            flag = 0;
            // for each loop for see that the user exits or not
            for (User user : userList) {
                if (user.userName.equals(userName) && user.passWord.equals(password)) {
                    flag = 1;
                    userEntered = user;
                    b = false;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println("user doesnot exist");
        } else {
            // here the user enterd into the system successfully
            Insta.optionMenu(userEntered);
        }
        scanner.close();
    }

    /*
     * display() method
     * this method will show all the basic details of the perticular user
     */
    public static void display(User searchUser) {
        int flag = 0;
        for (User user : userList) {
            if (user == searchUser) {
                flag = 1;
                System.out.println("User id : " + user.getUserName());
                System.out.println("User full Name : " + user.getFullName());
                System.out.println("User Mobile Number : " + user.getMobileNumber());
                System.out.println("User email Id : " + user.getEmailId());
                System.out.println("User followers : " + user.getFollowers());
                System.out.println("User following : " + user.getFollowing());
                System.out.println("User posts : " + user.getPosts());
                break;
            }
        }
        if (flag == 0) {
            System.out.println("User doesnot exist");
        }
    }

    /*
     * updateUser() method
     * this method updates the details of the user
     */
    public static void updateUser(User searchUser) {
        int flag = 0;
        for (User user : userList) {
            if (user == searchUser) {
                flag = 1;
                updateDetailsOfUser(user);
                break;
            }
        }
        if (flag == 0) {
            System.out.println("User doesnot exist");
        }
    }

    public static void updateDetailsOfUser(User user) {
        boolean b = true;
        Scanner scanner = new Scanner(System.in);
        while (b) {
            System.out.println("1. update username");
            System.out.println("2. update password");
            System.out.println("3. update full name");
            System.out.println("4. update mobile number");
            System.out.println("5. update email Id");
            System.out.println("6. exit from here");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("ENter the updated user name");
                    String updatedUserName = scanner.nextLine();
                    user.setUserName(updatedUserName);
                    break;
                case 2:
                    System.out.println("ENter the updated password");
                    String updatedPassword = scanner.nextLine();
                    user.setPassWord(updatedPassword);
                    break;
                case 3:
                    System.out.println("Enter the updated first name of the user ");
                    String updatedFirstName = scanner.nextLine();
                    System.out.println("Enter the updated middle name of the user ");
                    String updatedMiddleName = scanner.nextLine();
                    System.out.println("Enter the updated last name of the user ");
                    String updatedLastName = scanner.nextLine();
                    String updatedFullName = updatedFirstName + " " + updatedMiddleName + " " + updatedLastName;
                    user.setFullName(updatedFullName);
                    break;
                case 4:
                    System.out.println("Enter updated mobile number");
                    String updatedMobileNumber = scanner.nextLine();
                    user.setMobileNumber(updatedMobileNumber);
                    break;
                case 5:
                    System.out.println("Enter updated email Id");
                    String updatedEmailId = scanner.nextLine();
                    user.setEmailId(updatedEmailId);
                    break;
                case 6:
                    b = false;
                    break;
                default:
                    System.out.println("You enterd incorrect choce try again !!!");
                    break;
            }
        }
        scanner.close();
    }
}