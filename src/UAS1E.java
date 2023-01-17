import java.util.ArrayList;
import java.util.Scanner;

public class UAS1E {
        private String UserID;
        private String UserName;
// Getter and setter
    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public ArrayList<Messages> getMY_MESSAGES() {
        return MY_MESSAGES;
    }

    public void setMY_MESSAGES(ArrayList<Messages> MY_MESSAGES) {
        this.MY_MESSAGES = MY_MESSAGES;
    }
    public UAS1E() {}
    public UAS1E(String UserID, String userName){
        this.MY_MESSAGES = MY_MESSAGES();
    }
    private  ArrayList<Messages> MY_MESSAGES;
    //Class0bject Messages
    class Messages {
        private String userID;
        private String userName;
        private String whatYouPosts;
        //Getter and setter
        public String getUserID() {
            return userID;
        }

        public void setUserID(String userID) {
            this.userID = userID;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getWhatYouPosts() {
            return whatYouPosts;
        }

        public void setWhatYouPosts(String whatYouPosts) {
            this.whatYouPosts = whatYouPosts;
        }
    }

    public static void main(String[] args) {
        UAS1E social = new UAS1E();
        social.setUserID("001");
        social.setUserName("@whitehat");
        System.out.println("USER ID : " + social.getUserID());
        System.out.println("USER NAME : " + social.getUserName());
        int jum_msg=3;
        Scanner sc = new Scanner(System.in);
        ArrayList<UAS1E.Messages> xMsg = new ArrayList<>();
        for(int index=0;index<jum_msg;index++){
            Messages msg = new Messages();
            msg.setUserID(social.getUserID());
            msg.setUserName(social.getUserName());
            System.out.print("Post Message " + String.valueOf(index+1) + " = ");
            String _msg = sc.nextLine();
            msg.setWhatYouPosts(_msg);
            xMsg.add(msg);
        }
        social.setMY_MESSAGES(xMsg);
        //TODO :
        //  BUATLAH METHOD ShowPosts untuk menampilkan
        //  pesan yang telah di posting oleh user
        social.ShowPosts(social);
    }
    //ShowPosts
    public void ShowPosts(UAS1E profile) {
        ArrayList<Messages> messages = profile.getMY_MESSAGES();
        if (messages.size() == 0) {
            System.out.println("Tidak ada pesan yang diposting");
        } else {
            System.out.println("Pesan yang diposting oleh " + profile.getUserName() + ":");
            for (int i= 0; i< messages.size(); i++){
                Messages msg = messages.get(i);
                System.out.println(msg.getWhatYouPosts());
            }
        }
    }

}
