import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MartinHongLab11 {

	public static void main(String[] args) {

		Character[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
				'j', 'k' };

		// create our linked list and initialize it with charArray
		List<Character> list1 = new LinkedList<Character>(
				Arrays.asList(charArray));

		// print original list
		System.out.println("Original Character List");
		for (Character character : list1) {
			System.out.print(character + " ");
		}

		System.out.println();

		List<Character> list2 = new LinkedList<Character>(list1);
		Collections.reverse(list2);

		// print reversed list
		System.out.println("Reversed Character List");
		for (Character character : list2) {
			System.out.print(character + " ");
		}

	}
}
