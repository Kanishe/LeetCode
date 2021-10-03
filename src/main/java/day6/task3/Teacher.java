package day6.task3;

import java.util.Random;

public class Teacher {
    private String lesson;
    private String name;

    public Teacher(String lesson, String name) {
        this.lesson = lesson;
        this.name = name;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        String evauation = "";
        int randomEval = random.nextInt(4) + 2;
        switch (randomEval) {
            case 2:
                evauation = "BAAAD";
            case 3:
                evauation = "NOTsoobad";
            case 4:
                evauation = "greate";
            case 5:
                evauation = "greate";
        }
        System.out.println(this.name+"evaluate - "+student.getName()+"Evaluate like - "+evauation);
    }
}

