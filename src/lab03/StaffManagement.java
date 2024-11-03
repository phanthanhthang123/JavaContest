package lab03;

import java.util.*; 

public class StaffManagement {
    private String name;
    private int yearofbirth;
    private int yearofservice;
    private int currentSalary;

    //bien toan cuc
    public static Scanner input = new Scanner(System.in);
    public static int n;
    public static int maxSalary;
    public static int basicSalary;
    public static int startSalary;
    public static int salaryIncreaseCoefficient;
    public static int sumSalary = 0;
    public static int salaryCoefficient = 5;
    public static StaffManagement array[] = new StaffManagement [10005];

    public static void main(String[] args) {
        n = input.nextInt();
        maxSalary = input.nextInt();
        basicSalary = input.nextInt();
        startSalary = input.nextInt();
        salaryIncreaseCoefficient = input.nextInt();
        input.nextLine();
        NhapThongTin();
        output();
    }

    //constructor
    public StaffManagement(String name,int yearofbirth,int yearofservice){
        this.name = name;
        this.yearofbirth = yearofbirth;
        this.yearofservice = yearofservice;
        this.currentSalary = luongNhanVien(yearofservice);
    }
    public StaffManagement(){}

    public static int luongNhanVien(int yearofservice){
        int hesoluongtangthem = ((yearofservice-1)/salaryCoefficient)* salaryIncreaseCoefficient;
        int luong =  hesoluongtangthem*basicSalary + basicSalary*startSalary;
        return luong > maxSalary ? maxSalary : luong;
    }

    public static void NhapThongTin(){
        for(int i = 0; i< n; i++){
            String name = input.next();
            int yearofbirth = input.nextInt();
            int yearofservice = input.nextInt();
            input.nextLine();
            array[i] = new StaffManagement(name,yearofbirth,yearofservice);
        }
    }

    public static void output(){
        for(int i=0;i<n;i++){
            System.out.print(array[i].toString());
            sumSalary+= array[i].getCurrentSalary();
        }
        System.out.print(sumSalary);
        
    }


    //getter
    public String getName(){
        return this.name;
    }
    public int getYearOfBirth(){
        return this.yearofbirth;
    }
    public int getYearOfService(){
        return this.yearofservice;
    }
    public int getCurrentSalary(){
        return this.currentSalary;
    }
    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setYearOfBirth(int year){
        this.yearofbirth = year;
    }
    public void setYearOfService(int year){
        this.yearofservice = year;
    }
    //toString
    public String toString(){
        return (
            this.getName() + " " + this.getYearOfBirth() +" "+ this.getYearOfService() + " " + this.getCurrentSalary()+" "
        );
    }
}

