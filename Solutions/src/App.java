import java.util.LinkedList;

class Solution {
	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		// String firstName = scan.next();
		// String lastName = scan.next();
		// int id = scan.nextInt();
		// int numScores = scan.nextInt();
		// int[] testScores = new int[numScores];
		// for(int i = 0; i < numScores; i++){
		// 	testScores[i] = scan.nextInt();
		// }
		// scan.close();
		
		// Student s = new Student(firstName, lastName, id, testScores);
		// s.printPerson();
		// System.out.println("Grade: " + s.calculate() );

		// Leaning LinkedList

		LinkedList<String> list = new LinkedList<>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		list.add("Fifth");
		list.add("Sixth");
		list.add("Seventh");

		System.out.println("LinkedList: " + list);
		System.out.println("First element: " + list.get(0));	
		System.out.println("Last element: " + list.get(list.size() - 1));

		System.out.println("Removing first element: " + list.removeFirst());
		System.out.println("Removing last element: " + list.removeLast());
		System.out.println("LinkedList after removals: " + list);

		list.clear();

		System.out.println("LinkedList after clearing: " + list);

		list.add("New First");
		System.out.println("LinkedList after adding new element: " + list);
	}
}