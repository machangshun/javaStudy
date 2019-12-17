/*
 * 消除代码复制
 * 用封装降低耦合,两者的关系要拉的远些
 * 两个类的数据尽量不要直接相互调用
 * Room从硬编码改变为hashMap体现了较高的可扩展性,如果在game中新添加up和down，那么直接在game中添加，和Room没有关系
 * 框架+数据来提高可扩展性
 */
package castle;

import java.util.HashMap;
import java.util.Scanner;

public class Game {
    private Room currentRoom;
    private HashMap<String,Handler> handlers = new HashMap<String, Handler>();

    public Game() 
    {
    	handlers.put("go", new HandlerGo(this));
    	handlers.put("bye",new HandlerBye(this));
    	handlers.put("help",new Handlerhelp(this));
        createRooms();
    }

    private void createRooms()
    {
        Room outside, lobby, pub, study, bedroom;
      
        //	制造房间
        outside = new Room("城堡外");
        lobby = new Room("大堂");
        pub = new Room("小酒吧");
        study = new Room("书房");
        bedroom = new Room("卧室");
        
        //	初始化房间的出口
        outside.setExit("east",lobby);
        outside.setExit("south",study);
        outside.setExit("west",pub);
        lobby.setExit("west",outside);
        pub.setExit("north",outside);
        study.setExit("north",outside);
        study.setExit("east", bedroom);
        bedroom.setExit("west",study);
        lobby.setExit("up", pub);
        pub.setExit("Down", lobby);

        currentRoom = outside;  //	从城堡门外开始
    }

    private void printWelcome() {
        System.out.println();
        System.out.println("欢迎来到城堡！");
        System.out.println("这是一个超级无聊的游戏。");
        System.out.println("如果需要帮助，请输入 'help' 。");
        System.out.println();
        showPrompt();
    }

    // 以下为用户命令

    public  void goRoom(String direction) 
    {
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("那里没有门！");
        }
        else {
            currentRoom = nextRoom;
            showPrompt();
        }
    }
    
    public void showPrompt() {
    	 System.out.println("你在" + currentRoom);
         System.out.print("出口有: ");
         System.out.print(currentRoom.getExitDesc());
         System.out.println();
    }
	
    public void play() {
    	Scanner in = new Scanner(System.in);
    	while ( true ) {
    		String line = in.nextLine();
    		//以空格分隔开
    		String[] words = line.split(" ");
    		Handler handler = handlers.get(words[0]);  
    		String value = "";
    		if(words.length > 1) {
    			value = words[1];
    		}
    		if(handler != null) {
    			handler.doCmd(value);
    			if(handler.isBye())
    				break;
    		}
    	}
    	in.close();
    }
    
	public static void main(String[] args) {
		Game game = new Game();
		game.printWelcome();
		game.play();
        System.out.println("感谢您的光临。再见！");
	}
}
