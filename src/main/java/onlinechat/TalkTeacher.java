package onlinechat;

public class TalkTeacher {
	
	public static void main(String[] args) {
		new Thread(new TalkServer03(9999)).start();//����
		
		new Thread(new TalkSend03(5555,"localhost",8888)).start();//����
	}

}
