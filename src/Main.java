import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        boolean doneInput = false;

        String ID = "";
        String firstName = "";
        String lastName = "";
        String title = "";
        String rec = "";
        int yearOfBirth = 0;

        ArrayList <String> people = new ArrayList<>();
        Scanner in = new Scanner(System.in);


        //create a loop to input the person data
        do
        {
            ID = SafeInput.getNonZeroLenString(in, "Enter ID [000000]");
            firstName = SafeInput.getNonZeroLenString(in, "Enter first name");
            lastName = SafeInput.getNonZeroLenString(in, "Enter last name");
            title = SafeInput.getNonZeroLenString(in, "Enter title");
            yearOfBirth = SafeInput.getRangedInt(in, "Enter year of birth", 1000, 9999);

            rec = ID + ", " + firstName + ", " + lastName + ", " + title + ", " + yearOfBirth;

            System.out.println(rec);

            people.add(rec);

            doneInput = SafeInput.getYNConfirm(in, "Are you done");
        }while (!doneInput);
    }
}