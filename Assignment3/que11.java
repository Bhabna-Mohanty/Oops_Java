class Student {
    String name;
    int programmingMark;
    int logicMark;
    char labGrade;

    Student(String name, int programmingMark, int logicMark, char labGrade) {
        this.name = name;
        this.programmingMark = programmingMark;
        this.logicMark = logicMark;
        this.labGrade = labGrade;
    }
    String getName() {
        return name;
    }

    int getProgrammingMark() {
        return programmingMark;
    }

    int getLogicMark() {
        return logicMark;
    }

    char getLabGrade() {
        return labGrade;
    }

    boolean isStronger(Student student1, Student student2) {
        if (student1.programmingMark > student2.programmingMark) {
            return true;
        } else if (student1.programmingMark == student2.programmingMark) {
            if (student1.logicMark > student2.logicMark) {
                return true;
            } else if (student1.logicMark == student2.logicMark) {
                return student1.labGrade < student2.labGrade; 
            }
        }
        return false;
    }
}
class que11
{
	public static void main(String[] args) {
        Student student1 = new Student("Bhabna", 85, 90, 'O');
        Student student2 = new Student("Siya", 85, 80, 'A');

        if (isStronger(student1, student2)) {
            System.out.println(student1.getName() + " is stronger than " + student2.getName());
        } else {
            System.out.println(student2.getName() + " is stronger than " + student1.getName());
        }
    }
}
