package com.xujj.annotation;

public class User {
    /*
     * @Description ����һֻè����ķ���
     * @Date 2020/6/6
     * @Param []
     * @return void
     */
    @Check(login = false)
    public void findUserInfo(Integer userId) {
        System.out.println("��ѯ�û�����Ϣ:"+userId);
    }
}
