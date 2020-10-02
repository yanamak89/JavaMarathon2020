package day9.Task1;

class Student extends Human{
    private String studyGroup;

    public String getStudyGroup() {
        return studyGroup;
    }

    public void setStudyGroup(String studyGroup) {
        this.studyGroup = studyGroup;
    }

    public Student(String name, String studyGroup) {
        super(name);
        this.studyGroup = studyGroup;
    }

    @Override
    public void printInfo() {
        super.printInfo();
            System.out.println("Это студент с именем " + getName());
    }
}
