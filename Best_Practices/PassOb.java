import java.util.ArrayList;
class student{
    String Name;
    String Reg;
    ArrayList<teacher> MyTutorList= new ArrayList<>();

    student(){
    }
    student(String Name){
        this();
        this.Name=Name;
    }
    student(String Name, String Reg){
        this(Name);
        this.Reg=Reg;
    }
    void addMyTutor(teacher obj){
        if(!MyTutorList.contains(obj)){
            MyTutorList.add(obj);
        }
    }
    void displayAllMyTutor(){

        int n=MyTutorList.size();
        System.out.println("Name : "+Name+" Reg : "+Reg);
        System.out.println("Tutor list:");
        for(int i=0;i<n;i++){
            teacher te=MyTutorList.get(i);
            System.out.println((i+1)+". Name : "+te.Name+" Id : "+te.Id);
        }
    }

}
class teacher{
    String Name;
    String Id;
    ArrayList<student> studentList=new ArrayList<>();
    teacher(String Name, String Id){
        this.Name=Name;
        this.Id=Id;
    }
    void addStudent(student st){
           studentList.add(st);
           st.addMyTutor(this);
    }
    void print(){
        System.out.println("Name : "+Name+" Id : "+Id);
        int n=studentList.size();
        System.out.println("Student List");
        for(int i=0;i<n;i++){
            student st=studentList.get(i);
            System.out.println((i+1)+". Name : "+st.Name+" Reg : "+st.Reg);

        }

    }
}
class PassOb {
    public static void main(String[] args){
        student s1=new student("Mazharul","2019331075");
        teacher t1=new teacher("Fakhrul","10101");
        t1.addStudent(s1);
        student s2=new student("Arham","2019331005");
        t1.addStudent(s2);
        student s3= new student("Rigan","2019331019");
        t1.addStudent(s3);
        teacher t2=new teacher("Numan", "1001");
        t2.addStudent(s2);
        t2.addStudent(s3);
        t1.print();
        t2.print();
        s1.displayAllMyTutor();
        s2.displayAllMyTutor();
        s3.displayAllMyTutor();
        

    }
}