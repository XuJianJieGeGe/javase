package com.xujj.designpattern.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class DemeterTest {

    public static void main(String[] args) {

        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}


//ѧУ�ܲ�Ա����
class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//ѧԺԱ����
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeManager {
    List<CollegeEmployee> getAllEmployee() {
        ArrayList<CollegeEmployee> collegeEmployees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("ѧԺԱ��id=" + i);
            collegeEmployees.add(collegeEmployee);
        }
        return collegeEmployees;
    }
}

//����  SchoolManager���ֱ����������Щ��Employee,CollegeManager
//CollegeEmployee ����ֱ�����ѣ�����İ���࣬����Υ���˵����ط���
class SchoolManager {
    List<Employee> getAllEmployee() {
        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("ѧԺԱ��id=" + i);
            employees.add(employee);
        }
        return employees;
    }


    void printAllEmployee(CollegeManager collegeManager){
        List<CollegeEmployee> allEmployee = collegeManager.getAllEmployee();
        System.out.println("==================�ֹ�˾Ա��==========");
        for(CollegeEmployee collegeEmployee:allEmployee){
            System.out.println(collegeEmployee.getId());
        }

        List<Employee> allEmployee1 = this.getAllEmployee();
        System.out.println("==================�ֹ�˾Ա��==========");
        for(Employee e:allEmployee1){
            System.out.println(e.getId());
        }

    }


}