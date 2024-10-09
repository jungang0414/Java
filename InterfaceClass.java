interface School {
    public void place();
}

interface Teacher {
    public void name();
}


class Student implements School, Teacher {

    public void place() {
        System.out.println("TPE School");
    }

    public void name() {
        System.out.println("John");
    }
}

class InterfaceClass {
    public static void main(String[] args) {
        Student student = new Student();
        student.place();
        student.name();
    }
}

