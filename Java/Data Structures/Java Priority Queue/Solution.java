import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
   private int token;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

public class Solution {

    public static void main(String[] args) {
      Comparator<Student> comparator = new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getCgpa()==o2.getCgpa()){
                    if(o1.getFname().equals(o2.getFname())){
                        return o1.getToken() > o2.getToken() ? -1:1;
                    }
                    return o1.getFname().compareTo(o2.getFname());
                }
                return o1.getCgpa() > o2.getCgpa() ? -1:1;
            }
            
        };
                
        
        Scanner in = new Scanner(System.in);
        int totalEvents = Integer.parseInt(in.nextLine());
        PriorityQueue<Student> pq = new PriorityQueue<>(totalEvents, comparator);
        while(totalEvents>0){
            String event = in.nextLine();
            String[] arrStr = event.split(" ");
            
            switch(arrStr[0]){
                case "ENTER":
                    
                    String fname = arrStr[1];
                    float cgpa = Float.parseFloat(arrStr[2]);
                    int id = Integer.parseInt(arrStr[3]);
                    Student st = new Student(id, fname, cgpa);
                    pq.add(st);
                    
                break;
                case "SERVED":
                    pq.poll();
                break;
            }
            totalEvents--;
        }
        
        if(pq.isEmpty()){
            System.out.println("EMPTY");
        }else{
            while(!pq.isEmpty()){
                System.out.println(pq.poll().getFname());
            }
        }
    }
}
