package day9.task1;

public class Student extends Human {
    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    Student(String groupName, String name) {
        super(name);
        this.groupName = groupName;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("This student with name - " + getName());
    }
}
