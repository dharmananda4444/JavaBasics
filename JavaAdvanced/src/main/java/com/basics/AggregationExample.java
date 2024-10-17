package com.basics;

import java.util.ArrayList;
import java.util.List;

public class AggregationExample {

    public static void main(String[] args) {
        University university = new University("XYZ University");
        Department cs = new Department("Computer Science");
        Department math = new Department("Mathematics");

        university.addDepartment(cs);
        university.addDepartment(math);

        System.out.println(university.name + " has departments: " + cs.name + ", " + math.name);
    }
}

    class Department {
        String name;

        Department(String name) {
            this.name = name;
        }
    }

    class University {
        String name;
        List<Department> departments;

        University(String name) {
            this.name = name;
            departments = new ArrayList<>();
        }

        void addDepartment(Department department) {
            departments.add(department);
        }
    }




