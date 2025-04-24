package scope.classes;

import java.util.*;


public class Difference {
  	private int[] elements;
	private int maximumDifference;

	public Difference(int[] elements) {
		this.elements = elements;
	}

    public Difference(int maximumDifference) {
        this.maximumDifference = maximumDifference;
    }

	public void computeDifference(){
		// Sort the array
		Arrays.sort(elements);
		// The maximum difference is the difference between the last and first elements
		maximumDifference = elements[elements.length - 1] - elements[0];
		// Alternatively, you could use a loop to find the max and min, but sorting is more efficient in this case
		// int max = Integer.MIN_VALUE;
		// int min = Integer.MAX_VALUE;
		// for (int i : elements) {
		//     if (i > max) {
		//         max = i;
		//     }
		//     if (i < min) {
		//         min = i;
		//     }
		// }
		// maximumDifference = max - min;

		        // // Inicializa o máximo e mínimo com o primeiro elemento do array
				// int max = elements[0];
				// int min = elements[0];
		
				// // Percorre o array para encontrar o máximo e o mínimo
				// for (int i = 1; i < elements.length; i++) {
				// 	if (elements[i] > max) {
				// 		max = elements[i]; // Atualiza o máximo
				// 	}
				// 	if (elements[i] < min) {
				// 		min = elements[i]; // Atualiza o mínimo
				// 	}
				// }
		
				// // Calcula a diferença máxima
				// maximumDifference = max - min;
  	
	}

    public int getMaximumDifference() {
        return maximumDifference;
    }

    public void setMaximumDifference(int maximumDifference) {
        this.maximumDifference = maximumDifference;
    }

    public int[] getElements() {
        return elements;
    }

    public void setElements(int[] elements) {
        this.elements = elements;
    }
    
}