package homework;

public class PersonInfo {
    public static void main(String[] args) {

        String[] name;
        int[] grade;

        new PersonInfo();
        {
            grade = new int[]{2, 5, 6, 4, 5};
            name = new String[]{"Ivancho", "Ani", "Mariq", "Pencho", "Borislav"};
        }
        for(int i = 0; i < 5; i++) System.out.printf("%-10s  %15d\n", name[i], grade[i]);
    }
}



