package synchornizelizi;


public class HappyCinema {
	
	public static void main(String[] args) {
		Cinema cinema = new Cinema(10, "����ӰԺ");
		new Thread(new Customer(cinema, 2),"��").start();
		new Thread(new Customer(cinema, 2),"Ҧ").start();
	}
}

class Customer implements Runnable{
	
	Cinema cinema;
	int seats;
	public Customer(Cinema cinema, int seats) {
		this.cinema = cinema;
		this.seats = seats;
	}
	@Override
	public void run() {
		boolean flag = cinema.buyTicket(seats);
		if(flag) {
			System.out.println("��Ʊ�ɹ�"+Thread.currentThread().getName()+"-->λ��Ϊ"+seats);
		}else {
			System.out.println("��Ʊ�ɹ�"+Thread.currentThread().getName()+"-->λ�ò���");
		}
	}
	
}

class Cinema{
	int avaliable;//����λ��
	String name;//����
	public Cinema(int avaliable, String name) {
		super();
		this.avaliable = avaliable;
		this.name = name;
	}
	
	//��Ʊ
	public boolean buyTicket(int seats) {
		System.out.println("���õ�λ��Ϊ"+avaliable);
		if(seats>avaliable) {
			return false;
		}
		avaliable-=seats;
		return true;
	}
}
