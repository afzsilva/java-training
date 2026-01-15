package org.example.certification.qx1b;

import java.io.File;
import java.io.FileNotFoundException;

abstract class School {
 abstract Float getNumTeachers(); // método abstrato
 public int getNumStudents() {
 return 10;
 }
}

public class HighSchool extends School {
 final Float getNumTeachers() {
 return 4f;
 }

 // ⚠️ Exceção removida para manter compatibilidade com superclasse
 public int getNumStudents() /*throws FileNotFoundException*/ {
 return 20;
 }

 public static void main(String[] s) {
 var school = new HighSchool();
 System.out.print(school.getNumStudents());
 }
}