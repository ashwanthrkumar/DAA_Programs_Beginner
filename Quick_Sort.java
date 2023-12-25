import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Quick_Sort {
static final int MAX=200000;
static int[] a=new int[MAX];
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("Enter MAX Array sie");
int n=input.nextInt();
Random random=new Random();
System.out.println("Enter the array elements");
for(int i=0;i<n;i++)
//a[i]=input.nextInt();
a[i]=random.nextInt(100000);
a=Arrays.copyOf(a,n);
input.close();
Arrays.sort(a);
System.out.println("INput Array");
for(int i=0;i<n;i++)
System.out.println(a[i]+" ");
long startTime=System.nanoTime();
QuickSortAlgorithm(0,n-1);
long stopTime=System.nanoTime();
long elapsedTime=stopTime-startTime;
System.out.println("\nSorted Array");
for(int i=0;i<n;i++)
System.out.println(a[i]+" ");
System.out.println();
System.out.println("The complexity in ms for n= "+n+" is "+(double)elapsedTime/1000000);
}
public static void QuickSortAlgorithm(int p,int r)
{
int i,j,temp,pivot;
if(p<r)
{
i=p;
j=r+1;
pivot=a[p];
while(true)
{
i++;
while(a[i]<pivot&&i<r)
i++;
j--;
while(a[j]>pivot)
j--;
if(i<j) {
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
else
break;
}
a[p]=a[j];
a[j]=pivot;
QuickSortAlgorithm(p,j
-1);
QuickSortAlgorithm(j+1,r);
}
}
}