import java.util.*;
 class Worker {
    private int empno;
    private String ename;
    private int salary;

    Worker(int empno,String ename, int salary){
        this.empno=empno;
        this.ename=ename;
        this.salary= salary;
    }
    public int getEmpno(){
        return empno;
    }
    public int getSalary(){
        return salary;
    }
    public String getEname(){
        return ename;
    }
    public String toString(){
        return empno+" "+ename+" "+salary;
    }
}
class cruddemo{
    public static void main(String[]args)
    {
        List<Worker> c=new ArrayList<Worker>();
        Scanner s=new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
        int ch;
        do{
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("Enter the Choice:");
            ch = s.nextInt();
            switch(ch){
            case 1:
                System.out.print("Enter Empno:");
                int eno = s.nextInt();
                System.out.print("Enter Empname:");
                String ename = s1.nextLine();
                System.out.print("Enter Salary:");
                int salary = s.nextInt();
                c.add(new Worker(eno, ename, salary));
                break;
            case 2:
                System.out.println("---------------");
                Iterator<Worker> i=c.iterator();
                while(i.hasNext()){
                 Worker w=i.next();
                 System.out.println(w);
                }
                System.out.println("--------------");
                break;
            case 3:
                boolean found=false;
                System.out.println("Enter Empno to Search:");
                int empno=s.nextInt();
                System.out.println("---------------");
                i=c.iterator();
                while(i.hasNext()){
                 Worker w=i.next();
                 if(w.getEmpno()==empno)
                 System.out.println(w);
                 found=true;
                }
                if(!found)
                {
                    System.out.println("Record Not Found");
                }
                System.out.println("--------------");
                break;
            case 4:
                found=false;
                System.out.println("Enter Empno to delete:");
                empno=s.nextInt();
                System.out.println("---------------");
                i=c.iterator();
                while(i.hasNext()){
                 Worker w=i.next();
                 if(w.getEmpno()==empno)
                 i.remove();
                 found=true;
                }
               
                if(!found)
                {
                    System.out.println("Record Not Found");
                }
                else{
                    System.out.println("Record is Deleted Successfully-----!");                }
                System.out.println("--------------");
                break;
            case 5:
                found=false;
                System.out.println("Enter Empno to update:");
                empno=s.nextInt();
                System.out.println("---------------");
                ListIterator<Worker>li=c.listIterator();
                while(li.hasNext()){
                 Worker w=li.next();
                 if(w.getEmpno()==empno)

                System.out.print("Enter new Name:");
                ename=s1.nextLine();

                System.out.print("Enter new Salary:");
                salary=s.nextInt();
                li.set(new Worker(empno,ename,salary));

                 found=true;
                }
               
                if(!found)
                {
                    System.out.println("Record Not Found");
                }
                else{
                    System.out.println("Record is updated Successfully-----!");                }
                System.out.println("--------------");
                break;
            }
        }while(ch!=0);
    }
}
