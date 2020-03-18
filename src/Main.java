/*
Scott Cromling
Lab7
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main extends Course{
    static String filename;
    public static void main(String[] args) throws FileNotFoundException {

        //Instructor ins1 = new Instructor("Scott","Cromling","Cherry",214);
       //Instructor ins2 = new Instructor();
       // Textbook tb1 = new Textbook("I hate java","this shit sucks",5);
       // Textbook tb2 = new Textbook("i just want","to graduate",11);
        //Course c1=new Course("Computer Science","Second",new Instructor("Scott","Cromling","McNair",200),new Textbook("This shit is the pits","get me out of here LLC",12));
        //Course c2=new Course("Electronics","Fifth",new Instructor("Cromling","Scott","Graham",111),new Textbook("I don't like coding","at all",9));
        //System.out.println(c1);
       // System.out.println(c2);
        //System.out.println(tb1);
       //System.out.println(tb2);
       // System.out.println(ins1);
       // System.out.println(ins2);

        ArrayList<String> courses = new ArrayList<>();

        readCourseData( courses,  "coursedata.txt");
        //for(int i = 0;i<courses.size();i++)
        //System.out.println(courses.toString());



    }
    public static void readCourseData( ArrayList courses, String filename ) throws FileNotFoundException {
        Scanner read = new Scanner(new File(filename));

        while(read.hasNextLine()){
            String[] coursename = read.nextLine().split(",");

            String[] instruct = read.nextLine().split("\\*");

            String title = read.nextLine();
            String publisher = read.nextLine();
            String edition = read.nextLine();
            String noWhite = instruct[3].replaceAll("\\s+","");

            Instructor instr = new Instructor();
            instr.setFirstname(instruct[0]);
            instr.setLastname(instruct[1]);
            instr.setOfficebuilding(instruct[2]);
            instr.setRoomNumber(Integer.parseInt(noWhite));

            Textbook txtb = new Textbook();
            txtb.setTitle(title);
            txtb.setPublisher(publisher);
            txtb.setEdition(((Integer.parseInt(edition))));

            String name = coursename[0];
            String semester = coursename[1];

            courses.add(new Course(name,  semester, instr, txtb));
            System.out.println(courses.toString());


        }
    }
}
