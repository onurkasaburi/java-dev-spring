import service.FullTimeMentor;
import service.MentorAccount;

public class OnkaApp {
    public static void main(String[] args) {
        FullTimeMentor fullTime = new FullTimeMentor();
        MentorAccount mentor = new MentorAccount(fullTime);
        mentor.manageAccount();
    }
}
