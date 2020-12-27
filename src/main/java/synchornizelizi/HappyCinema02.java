package synchornizelizi;

import java.util.ArrayList;
import java.util.List;

public class HappyCinema02 {
	
	public static void main(String[] args) {
		
		List<Integer> avaliable = new ArrayList<>();
		avaliable.add(1);
		avaliable.add(2);
		avaliable.add(3);
		avaliable.add(5);
		avaliable.add(6);
		HICinema cinema = new HICinema(avaliable, "����ӰԺ");
		
		//�˿���Ҫ��λ��
		List<Integer> c1 = new ArrayList<>();
		c1.add(1);
		c1.add(2);
		c1.add(3);
		
		List<Integer> c2 = new ArrayList<>();
		c2.add(1);
		c2.add(2);
		c2.add(3);
		
//		c2.add(5);
//		c2.add(6);
		
		new Thread(new HiCustomer(cinema,c1),"С��").start();
		new Thread(new HiCustomer(cinema, c2),"С��").start();
	}
}

class HiCustomer implements Runnable{
	
	HICinema cinema;
	List<Integer> seats;
	public HiCustomer(HICinema cinema,List<Integer> seats) {
		this.cinema = cinema;
		this.seats = seats;
	}
	@Override
	public void run() {
        synchronized (cinema) {
        	boolean flag = cinema.buyTicket(seats);
    		if(flag) {
    			System.out.println("��Ʊ�ɹ�"+Thread.currentThread().getName()+"-->λ��Ϊ"+seats);
    		}else {
    			System.out.println("��Ʊʧ��"+Thread.currentThread().getName()+"-->λ�ò���");
    		}
		}
	}
}

class HICinema{
	List<Integer> avaliable;//����λ��
	String name;//����
	public HICinema(List<Integer> avaliable, String name) {
		super();
		this.avaliable = avaliable;
		this.name = name;
	}
	
	//��Ʊ
	public boolean buyTicket(List<Integer> seats) {
		System.out.println("���õ�λ��Ϊ"+avaliable);
		List<Integer> copyList = new ArrayList<>();
		copyList.addAll(avaliable);
		//���
		copyList.removeAll(seats);
		
		if(avaliable.size()-copyList.size()!=seats.size()) {
			return false;
		}
		
		avaliable = copyList;
		return true;
	}
}
