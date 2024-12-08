/*
 * package com.example.demo.practice;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * public class CountMethodExample { public static void main(String[] args) {
 * //Conut
 * 
 * List<Integer> list = List.of(23,43,5,7,12,80,66);
 * 
 * long count = list.stream().filter(e -> e > 50).count();
 * System.out.println("Count After filter " + count);
 * 
 * ArrayList<Emp> EmpList = new ArrayList<>(); EmpList.add(new Emp("ram",
 * 26000)); EmpList.add(new Emp("sham", 65000)); EmpList.add(new Emp("sita",
 * 45000)); EmpList.add(new Emp("rakesh", 61000));
 * System.out.println(EmpList.stream().count());
 * 
 * long EmpCount = EmpList.stream().filter(e -> e.getSalary() >50000).count();
 * System.out.println("Emp Cont After filter " + EmpCount);
 * 
 * }
 * 
 * }
 * 
 * class Emp{ private String name; private int salary;
 * 
 * public Emp(String name, int salary) { super(); this.name = name; this.salary
 * = salary; } public String getName() { return name; } public void
 * setName(String name) { this.name = name; } public int getSalary() { return
 * salary; } public void setSalary(int salary) { this.salary = salary; }
 * 
 * @Override public String toString() { return "Emp [name=" + name + ", salary="
 * + salary + "]"; }
 * 
 * 
 * }
 * 
 * 
 * 
 */