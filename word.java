import java.util.*;
class main
 {
    public static void main(String args[])
	{
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = obj.nextLine();
        String[] words = str.split(" ");
        String s_Word = words[0];
        String l_Word = words[0];
        for (int i = 0; i < words.length; i++)
		{
            if (words[i].length() < s_Word.length())
			{
                s_Word = words[i];
            }
            if (words[i].length() > l_Word.length())
			{
                l_Word = words[i];
            }
        }
        System.out.println("Smallest word: " + s_Word);
        System.out.println("Largest word: " + l_Word);
    }
}