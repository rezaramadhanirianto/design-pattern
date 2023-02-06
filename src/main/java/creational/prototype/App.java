package creational.prototype;

import java.util.List;

public class App {
    public static void main(String[] args){
        Employees emps = new Employees();
        emps.loadData();

        Employees empsNew = (Employees) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("John");

        System.out.println("emps List: "+emps.getEmpList());
        System.out.println("empsNew List: "+list);
    }
}
