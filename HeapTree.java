
public class HeapTree
{


	// Index of the left child
	public int LeftChild(int i)
	{
		int left = 2*i +1;
		return left;
	}

	// Index of the right child
	public int RightChild(int i)
	{
		int right = 2*i +2;
		return right;
	}

	// Index of the parent
	public int Parent(int i)
	{
		int parent = (i-1)/2;
		return parent;
	}

	// Maxheapify: Put the largest prioritized int to the parent
	public void MaxHeapify(Patient[] array, int n, int i){ 		//n is the size, i is a node
		int largest = i;										// Largest Index at node i
		int l = LeftChild(i);									// l is iNDEX OF the left child
		int r = RightChild(i);									// r is Index of the right child

		if(l < n && array[l].getNum() > array[i].getNum())		// Find the largest node in 3 nodes
			largest = l;

		if( r < n && array[r].getNum() > array[largest].getNum())
			largest = r;
		if(i != largest)										// Swap and do maxheapify is largest is a child
		{
			swap(array, i, largest);
			MaxHeapify(array, n, largest);
		}
	}

	// Swap 2 nodes
		public void swap(Patient[] array, int a, int b)
		{
			Patient temp = array[a];
			array[a] = array[b];
			array[b] = temp;
		}

	// Build the max heap structure
	public void BuildMaxHeap(Patient[] array)
	{
		int n = array.length;
		for(int in = n/2 - 1; in >= 0; in--)				// Do maxheapify at the last parent node
			MaxHeapify(array, n, in);
	}

	// The actual sorting
	public void HeapSort(Patient[] array)
	{
		BuildMaxHeap(array);								// Build the max heap properties
		for( int i = array.length -1; i >= 0; i--)			// Bring the root to the last position
		{
			swap(array, i, 0);
			MaxHeapify(array, i, 0);						// Maintain the max heap properties
		}
	}

	public Patient extractMax(Patient[] array)	// when the list is still not sorted
	{
		Patient data = array[0];
		array[0] = array[array.length-1];
		array[array.length-1] = null;
		MaxHeapify(array, array.length-1, 0);
		return data;
	}

	/*public Patient extractMaxAfterSort(Patient[] array) 	// When the list is already sorted
	{
		int n = array.length;
		Patient data = array[n-1];
		array[n-1] = null;
		return data;
	}

		public Patient HeapMaximum(Patient[] array)				// When the list is sorted
		{
			return array[array.length-1];
	}

	/*public void maxHeapInsertAfterSort(Patient[] array, Patient i)	// When the list is already sorted
	{
			int n = array.length;
			if(array[n-1] != null)
				System.oue.println("The room is full, cannot add any more.");
			else
			{
				array[n-1] = i;
				HeapSort(array);
			}
	}*/

	// Return the node that has the maximum value in the heap
	public Patient HeapMaximum(Patient[] array)
	{
		return array[0];
	}

	public void maxHeapInsert(Patient[] array, Patient i)
	{
			int n = array.length;
			if(array[n-1] != null)
				System.out.println("The room is full, cannot add any more.");
			else
			{
				array[n-1] = i;
				heapIncreaseKey(array, i);
			}
	}

	public void heapIncreaseKey(Patient[] array, Patient i)
	{
		int n = array.length;
		int index = n-1;
		while(index > 1 && array[Parent(n-1)].getNum() < i.getNum())
		{
			swap(array, n-1, Parent(n-1));
			index = Parent(n-1);
		}
	}
}