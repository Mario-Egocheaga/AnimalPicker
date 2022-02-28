import java.util.Scanner;

public class AnimalPicker
{
    public static void main(String[] args)
    {
        System.out.println("Would You Like To See A Dog or Cat, or a Fish?");
        Scanner anim = new Scanner(System.in);
        String animal = anim.next().toLowerCase();

        if(animal.equals("dog"))
        {
            System.out.println("  __      _\no\'\')}____//\n `_/      )\n (_(_/-(_/");
        }
        else if (animal.equals("cat"))
        {
            System.out.println(" |\\__/,|   (`\\\n |_ _  |.--.) )\n ( T   )     /\n(((^_(((/(((_/");
        }
        else if(animal.equals("fish"))
        {
            System.out.println("|\\   \\\\\\\\__     o\n| \\_/    o \\    o \n> _   (( <_  oo  \n| / \\__+___/      \n|/     |/");
        }
        else
        {
            System.out.println("Error: Invalid Option. Please Enter A Valid Option.");
            main(null);
        }


    }

}