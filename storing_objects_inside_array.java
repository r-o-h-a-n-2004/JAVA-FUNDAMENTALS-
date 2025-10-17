class student{

    String student_name;
    int roll;
    int clas;
}


class hello{

    public static void main(String a[]){
        student s1 = new student();
        s1.student_name = "rohan";
        s1.roll= 21;
        s1.clas=12;

        student s2 = new student();
        s2.student_name = "rohith";
        s2.roll= 54;
        s2.clas=11;

        student students[] = new student[2];
        students[0]=s1;
        students[1]=s2;


        for(student stud : students){
            System.out.print(stud.student_name + " " + stud.roll);
            System.out.println();
        }
        

    }
}

