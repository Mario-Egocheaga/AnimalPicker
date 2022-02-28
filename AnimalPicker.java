import java.util.Scanner;

public class AnimalPicker
{
    public static void main(String[] args)
    {
        System.out.println("Would You Like To See A Dog or Cat?");
        Scanner anim = new Scanner(System.in);
        String animal = anim.next().toLowerCase();

        if(animal.equals("dog"))
        {
            System.out.println("DOG ASCII ART HERE");
        }
        else if (animal.equals("cat"))
        {
            System.out.println("CAT ASCII ART HERE");
        }


    }

}