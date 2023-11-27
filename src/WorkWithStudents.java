public interface WorkWithStudents {

    default void nextYear(MyList<Student> list) {
        for (int i = 0; i < list.getLen(); i++) {
            if (list.getItem(i).getAverageMark() < 3) {
                list.remove(i);
                i--;
            }
            else {
                list.getItem(i).setCourse(list.getItem(i).getCourse() + 1);
            }
        }
    }

    default void printStudents(MyList<Student> list, int course) {
        for (int i = 0; i < list.getLen(); i++) {
            if (list.getItem(i).getCourse() == course) {
                System.out.println(list.getItem(i).getName());
            }
        }
    }
}
