package com.xujj.dbconnpool;
/**
 * ���Ӵ�����
 * @author Administrator
 *
 */

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class DBConnPool {
	
	private static List<Connection> pool;//���ӳصĶ���
	
	private static final int POOL_MAX_SIZE=100;//���������
	private static final int POOL_MIN_SIZE=10;//��С������
	
	public void initPool() {
		if(pool==null) {
			pool = new ArrayList<Connection>();
		}
		while(pool.size()<DBConnPool.POOL_MIN_SIZE) {
			//�������ӳ�
//			pool.add(DBManager.getConn());
		}
	}
	
	

}
