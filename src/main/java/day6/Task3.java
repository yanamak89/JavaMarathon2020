package day6;

import java.util.Random;

/**
 * 3. Создать класс Teacher (Преподаватель), имеющий поля “Имя”,
 * “Предмет”. Создать класс Student (Студент) с полем “Имя”.
 * Каждый класс имеет конструктор (с параметрами), set и get методы
 * по необходимости, а также у преподавателя есть метод evaluate
 * (оценить студента) принимающий в параметры студента и число от 2 до 5,
 * и работающий следующим образом: выводится строка:
 * "Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил студента с именем ИМЯСТУДЕНТА
 * по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
 * Все слова, написанные большими буквами, должны быть заменены
 * соответствующими значениями. ОЦЕНКА должна принимать значения
 * "отлично”, "хорошо”, "удовлетворительно" или "неудовлетворительно",
 * в зависимости от значения случайного числа.
 * Если передано число отличное от допустимого, вывести сообщение
 * “Неправильная оценка”.
 * Создайте по 1 экземпляру каждого класса, у преподавателя вызовите
 * метод оценки студента, передав студента в качестве аргумента метода.
 */
public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Макарова Юлия Олеговна", "Право");
        Student student = new Student("Макогон Яна Сергеевна");

        teacher.evaluate(student);


    }
}

class Teacher {
    private String teacherName;
    private String subject;

    public Teacher(String teacherName, String subject) {
        this.teacherName = teacherName;
        this.subject = subject;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherNamee(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int randomValue = random.nextInt(4) + 2;
        String mark;
        switch (randomValue) {
            case 5:
                mark = "Отлично";
                break;
            case 4:
                mark = "Хорошо";
                break;
            case 3:
                mark = "удовлетворительно";
                break;
            case 2:
                mark = "неудовлетворительно";
                break;
            default:
                mark = "Неправильная оценка";
        }
        System.out.println("Преподаватель " + this.teacherName + " оценил студента с именем "
                + student.getStudentName() + " по предмету " + this.subject + " на оценку " + mark);
    }
}

class Student {
    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}