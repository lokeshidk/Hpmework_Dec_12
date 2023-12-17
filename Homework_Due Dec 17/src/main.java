import model.Students;
public class main {
    public static void main(String[] args) {
        int Lokesh_marks[]={99,99,99,99,99,99};
        Students Lokesh = new Students("Lokesh Shrestha",17,Lokesh_marks,12);
        Lokesh.Result();
        System.out.println("\n\n\n\n\n\n");
        int Stup_marks[]={45,45,45,45,45,45};
        Students Stup = new Students("Stup Bhattarai",14,Stup_marks,12);
        Stup.Result();
        System.out.println("\n\n\n\n\n\n");
        int Shreejal_marks[]={4,4,4,44,4,4};
        Students Shreejal = new Students("Shreejal Khanal",15,Shreejal_marks,12);
        Shreejal.Result();
        System.out.println("\n\n\n\n\n\n");
    }
}
