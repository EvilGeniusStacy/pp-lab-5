import company.implementations.EmailMessenger;

public class Main {
    public static void main(String[] args) {
        EmailMessenger emsg = new EmailMessenger();
        emsg.sendMessage("wiadomosc");
    }
}