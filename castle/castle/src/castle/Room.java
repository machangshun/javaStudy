package castle;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String,Room> exits = new HashMap<String, Room>();

    public Room(String description) 
    {
        this.description = description;
    }
    //设置房间的通向
    public void setExit(String dir,Room room) {
    	exits.put(dir,room);
    }
    

    @Override
    public String toString()
    {
        return description;
    }  
    //获取当前位置
    public String getExitDesc() {
    	StringBuffer sb = new StringBuffer();
    	//利用字符串+的方式不断创建新的对象会增加系统的开销
//    	String ret = "";
    	for(String dir : exits.keySet()) {
    		sb.append(dir);
    		sb.append(" ");
    	}

    	return sb.toString();
    }
    //根据方向获取当前位置所在
    public Room getExit(String direction) {    	
    	return exits.get(direction);
    }
}
