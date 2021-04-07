
import java.awt.*;
import java.awt.event.KeyEvent;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class FunTimer{
    public static void main(String[] args) throws AWTException {
        System.out.print("For (sec):");
        Scanner scanner=new Scanner(System.in);
        int time=scanner.nextInt();
        List list=new ArrayList();
        list.add(KeyEvent.VK_A);list.add(KeyEvent.VK_M);
        list.add(KeyEvent.VK_B);list.add(KeyEvent.VK_N);
        list.add(KeyEvent.VK_C);list.add(KeyEvent.VK_O);
        list.add(KeyEvent.VK_D);list.add(KeyEvent.VK_P);
        list.add(KeyEvent.VK_E);list.add(KeyEvent.VK_Q);
        list.add(KeyEvent.VK_F);list.add(KeyEvent.VK_R);
        list.add(KeyEvent.VK_G);list.add(KeyEvent.VK_S);
        list.add(KeyEvent.VK_H);list.add(KeyEvent.VK_T);
        list.add(KeyEvent.VK_I);list.add(KeyEvent.VK_U);
        list.add(KeyEvent.VK_J);list.add(KeyEvent.VK_V);
        list.add(KeyEvent.VK_K);list.add(KeyEvent.VK_W);
        list.add(KeyEvent.VK_L);list.add(KeyEvent.VK_X);
        list.add(KeyEvent.VK_Y);list.add(KeyEvent.VK_Z);
        Random random=new Random();
        Robot robot=new Robot();
        for(int i=0;i<time;i++){
        int randNum=random.nextInt(list.size());
        robot.delay(3000);
        robot.keyPress((int)list.get(randNum));}
    }
}

