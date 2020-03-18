/*
Scott Cromling
Lab7
 */
public class Main {
    public static void main(String[] args) {

        Instructor ins1 = new Instructor("Scott","Cromling","Cherry",214);
        Instructor ins2 = new Instructor();
        Textbook tb1 = new Textbook("I hate java","this shit sucks",5);
        Textbook tb2 = new Textbook("i just want","to graduate",11);
        Course c1=new Course("Computer Science","Second",new Instructor("Scott","Cromling","McNair",200),new Textbook("This shit is the pits","get me out of here LLC",12));
        Course c2=new Course("Electronics","Fifth",new Instructor("Cromling","Scott","Graham",111),new Textbook("I don't like coding","ar all",9));
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(tb1);
        System.out.println(tb2);
        System.out.println(ins1);
        System.out.println(ins2);
    }
}
