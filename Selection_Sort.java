import java.util.Scanner;
import java.util.Random;
public class Selection_Sort{
static final int MAX=200000;
static int[] a=new int[MAX];
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("Enter MAX Array size");
int n=input.nextInt();
Random random=new Random();
System.out.println("Enter the array elements");
for(int i=0;i<n;i++)
// a[i]=input.nextInt();
a[i]=random.nextInt(100000);
System.out.println("Input Array");
for(int i=0;i<n;i++)
System.out.println(a[i]+" ");
long startTime=System.nanoTime();
SelectionSortAlgorithm(0,n);
long stopTime=System.nanoTime();
long elapsedTime=stopTime-startTime;
System.out.println("\nSorted Array");
for(int i=0;i<n;i++)
System.out.println(a[i]+" ");
System.out.println();
System.out.println("The complexity in ms for n= "+n+" is "+(double)elapsedTime/1000000);
input.close();
}
public static void SelectionSortAlgorithm(int low,int high)
{
int temp;
for(int i=low;i<=high-2;i++)
{
for(int j=i+1;j<=high-1;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
}
}