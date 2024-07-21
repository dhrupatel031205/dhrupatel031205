package InstaJava;

import java.util.*;

/**
 * Posts
 */
public class Posts {
    // instance variables
    static ArrayList<Posts> postList = new ArrayList<Posts>();
    String userName;
    String discription;
    String postType;
    int likes;
    Stack<String> comments = new Stack<String>();
    int share;

    // perameterized constructor
    public Posts(String userName, String discription, String postType, int likes, Stack<String> comments, int share) {
        this.userName = userName;
        this.discription = discription;
        this.postType = postType;
        this.likes = likes;
        this.comments = comments;
        this.share = share;
    }

    // getters and setters

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getShare() {
        return share;
    }

    public void setShare(int share) {
        this.share = share;
    }

    /*
     * postOptions() method
     * this method adds the posts to the system which user want to add
     * or remove or update
     */
    public static void postOptions(User user) {
        Scanner scanner = new Scanner(System.in);
        boolean b = true;
        while (b) {
            System.out.println("1. add the post");
            System.out.println("2. update the post");
            System.out.println("3. delete the post");
            System.out.println("4. see my all posts");
            System.out.println("5. exit from post section");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    createPost(user);
                    break;

                case 2:
                    updatePost(user);
                    break;

                case 3:
                    deletePost(user);
                    break;

                case 4:
                    seeMyAllPosts(user);
                    break;

                case 5:
                    b = false;
                    break;

                default:
                    break;
            }
        }
        scanner.close();
    }

    public static void seeMyAllPosts(User user) {

    }

    public static void deletePost(User user) {

    }

    public static void updatePost(User user) {

    }

    public static void createPost(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the post type");
        String postType = scanner.nextLine();
        System.out.println("Enter the description");
        String description = scanner.nextLine();
        Posts newPost = new Posts(user.userName, description, postType, 0, null, 0);
        postList.add(newPost);
        scanner.close();
    }
}
