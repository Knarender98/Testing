package com.test;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	
	public static void main(String[] args) {
		System.out.println("for testing ");

        Emp emp = new Emp();
		// Create subjects
        Subject sub1 = new Subject(1, "Mathematics");
        Subject sub2 = new Subject(2, "Physics");
        Subject sub3 = new Subject(3, "Chemistry");

        // Add subjects to list
        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(sub1);
        subjectList.add(sub2);
        subjectList.add(sub3);

        // Create employee and assign subject list
        emp.setEmpId(1);
        emp.setEmpName("nnnn");

        // Display data
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getEmpName());
        System.out.println("Subjects:");

        for (Subject s : emp.getSubjects()) {
            System.out.println(" - " + s.getSubjectId() + ": " + s.getSubjectName());
        }
	}
}
