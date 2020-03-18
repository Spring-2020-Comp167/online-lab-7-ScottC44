public class Main {
    public static void main(String[] args) {

        Instructor ins1 = new Instructor("Scott","Cromling","Cherry",214);
        Instructor ins2 = new Instructor();
        Textbook tb1 = new Textbook("I hate java","this shit sucks",5);
        Textbook tb2 = new Textbook("i just want","to graduate",11);
        System.out.println(tb1);
        System.out.println(tb2);
        System.out.println(ins1);
        System.out.println(ins2);
    }
}
