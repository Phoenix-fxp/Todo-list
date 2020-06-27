package memo;

import java.util.Deque;
import java.util.Scanner;

public class Control {
    public static void main(String[] args) {
        //创建存储空间，并初始化。最大容纳20个事件
        String[] index = new String[20];
        for(int i = 0; i<20; i++)
            index[i] = "";
        while(true) {

            System.out.println("**********************");
            System.out.println("请输入您想要选择的功能序号：\n1.添加待办事项\n2.删除待办事项\n3.标记事项为完成\n4.查看全部待办事项\n5.结束程序");
            System.out.println("**********************");
            Scanner sc = new Scanner(System.in);
            int function = sc.nextInt();

            switch (function) {
                case 1:
                    System.out.println("请输入您想要添加的待办事项：");
                    String enter = sc.nextLine();
                    String thing = sc.nextLine();
                    index = Add.add(index, thing);
                    break;
                case 2:
                    System.out.println("请输入您想要删除的待办事项序号：");
                    enter = sc.nextLine();
                    int number = sc.nextInt();
                    enter = sc.nextLine();
                    index = Delete.delete(index, number);
                    break;
                case 3:
                    System.out.println("请输入您已经完成的待办事项序号：");
                    enter = sc.nextLine();
                    number = sc.nextInt();
                    enter = sc.nextLine();
                    index = Complete.complete(index, number);
                    break;
                case 4:
                    Glance.glance(index);
                    break;
                case 5:
                    System.out.println("感谢您的使用，再见！");
                    return;
            }
        }
    }
}
