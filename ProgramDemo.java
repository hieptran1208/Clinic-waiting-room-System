//Hiep Tran		0846195
// CS 146 Programming assignment 1
// Written in Java code

import java.util.Random;

public class ProgramDemo
{
	public static void main(String[] args)
    {
		Random rand = new Random();

		// 20 initial patients
		Patient p1 = new Patient("Joshua", rand.nextInt(100)+1);
		Patient p2 = new Patient("Lok", rand.nextInt(100)+1);
		Patient p3 = new Patient("Carlo", rand.nextInt(100)+1);
		Patient p4 = new Patient("Bryan", rand.nextInt(100)+1);
		Patient p5 = new Patient("Ivan", rand.nextInt(100)+1);
		Patient p6 = new Patient("David", rand.nextInt(100)+1);
		Patient p7 = new Patient("Aaron", rand.nextInt(100)+1);
		Patient p8 = new Patient("Jenny", rand.nextInt(100)+1);
		Patient p9 = new Patient("Phuc", rand.nextInt(100)+1);
		Patient p10 = new Patient("Thong", rand.nextInt(100)+1);
		Patient p11 = new Patient("Tien", rand.nextInt(100)+1);
		Patient p12 = new Patient("Kevin", rand.nextInt(100)+1);
		Patient p13 = new Patient("Patrick", rand.nextInt(100)+1);
		Patient p14 = new Patient("Nicolas", rand.nextInt(100)+1);
		Patient p15 = new Patient("Theron", rand.nextInt(100)+1);
		Patient p16 = new Patient("Dung", rand.nextInt(100)+1);
		Patient p17 = new Patient("My", rand.nextInt(100)+1);
		Patient p18 = new Patient("Sang", rand.nextInt(100)+1);
		Patient p19 = new Patient("James", rand.nextInt(100)+1);
		Patient p20 = new Patient("Monty", rand.nextInt(100)+1);





        Patient[] heap = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20};
        // PRINT THE LIST BEFORE SORTING
	System.out.print("The list of patient before sorting: \n");
        for(int i = 0; i < heap.length; i++)
        System.out.println(heap[i].getName() + "     " + heap[i].getNum());
        System.out.println();


        HeapTree h = new HeapTree();
        h.BuildMaxHeap(heap);


		// Using Build_Max_Heap function
		System.out.print("After we build the max heap tree, the list goes on as below: \n");
	for(int i = 0; i < heap.length; i++)
        System.out.println(heap[i].getName() + "     " + heap[i].getNum());
        System.out.println();


      	System.out.print("The first patient needs to see the doctor is: ");
        System.out.println(h.extractMax(heap).getName());

		// REMOVE THE 1ST PATIENT
		System.out.println("\nThe list after the first prioritized patient is gone: ");
        for(int i = 0; i <= heap.length -2; i++)
        System.out.println(heap[i].getName() + "     " + heap[i].getNum());


		//Insert an item
		Patient p21 = new Patient("Kyle", rand.nextInt(100)+1);

	       System.out.println();
		System.out.println(p21.getName() + " just enters the room with condition of " + p21.getNum());

        h.maxHeapInsert(heap, p21);
        System.out.println("\nThe list after " + p21.getName() + " comes into the room: ");
		        for(int i = 0; i <= heap.length -1; i++)
		        System.out.println(heap[i].getName() + "     " + heap[i].getNum());


        System.out.println();
		System.out.print("The next person will see the doctor is: ");
		System.out.println(h.HeapMaximum(heap).getName());

		h.HeapSort(heap);

		 System.out.println();
	System.out.print("The list of patient after sorting: \n");
        for(int i = heap.length -1; i > 0; i--)
        System.out.println(heap[i].getName() + "     " + heap[i].getNum());
        System.out.println();



		// Not part of the program

        /*Patient p24 = new Patient("Jeffrey", rand.nextInt(100)+1);
        h.maxHeapInsert(heap, p5);
        System.out.print("Patient " + p5.getName() + " with priority " + p5.getNum());
		System.out.println(" just comes in.");

		System.out.println("\nThe list after another patient comes into the room: ");
        for(int i = heap.length -1; i >= 0; i--)
        System.out.println(heap[i].getName() + "     " + heap[i].getNum());


                System.out.println(h.HeapMaximum(heap).getName() + "\n");

               /*System.out.print("After build the max heap, the list goes on as below: \n");
			for(int i = 0; i < heap.length; i++)
		        System.out.println(heap[i].getName() + "     " + heap[i].getNum());
        System.out.println();

        h.HeapSort(heap);*/

    }
}
