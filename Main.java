import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        int x= 8;
        int y= 13;
     int suma= MathUtils.add(x, y);
     System.out.println("Suma  "+ x +" i "+ y + " to: "+ suma);

     EmailMessenger mes = new EmailMessenger();
     mes.sendMessage("Suma "+ x +" i "+ y + " to: "+ suma);
    }
}