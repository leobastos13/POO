package aula11.Ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Gradebook {
    TreeMap<String, Student> classes = new TreeMap<>();
    SimpleGradeCalculator calculator = new SimpleGradeCalculator();

    public void load(String path) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(path));

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] studentArray = linha.split("\\|");

                List<Double> grades = new ArrayList<>();
                for (int i = 1; i < studentArray.length; i++) {
                    grades.add(Double.parseDouble(studentArray[i]));
                }
                addStudent(new Student(studentArray[0], grades));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não existente!");
        } finally {
            if (scanner != null)
                scanner.close();
        }
    }

    public void addStudent(Student newStudent) {
        classes.put(newStudent.getName(), newStudent);
    }

    public void removeStudent(String name) {
        classes.remove(name);
    }

    public Student getStudent(String name) {
        return classes.get(name);
    }

    public double calculateAverageGrade(String name) {
        List<Double> grades = classes.get(name).getGrades();

        return calculator.calculate(grades);
    }

    public void printAllStudents() {
        String res = "";
        for (Student aluno : classes.values()) {
            List<Double> grades = aluno.getGrades();
            res += String.format("Nome: %s; Notas: %s; Média: %.2f\n",
                    aluno.getName(),
                    grades.toString(),
                    calculateAverageGrade(aluno.getName()));
        }
        System.out.println(res);
    }
}
