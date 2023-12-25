import java.util.Scanner;
import java.util.Random;
public class Merge_Sort {
static final int MAX = 200000;
static int[] a = new int[MAX];
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.println("Enter MAX array size");
int n = input.nextInt();
Random random = new Random();
System.out.println("Enter the array elements");
for(int i = 0;i<n;i++)
{
//a[i]=input.nextInt();
a[i]=random.nextInt(100000);
System.out.println(a[i]+" ");
}
long startTime = System.nanoTime();
MergeSortAlgorithm(0,n-1);
long stopTime = System.nanoTime();
long elapsedTime=stopTime-startTime;
System.out.println("Sorted Array(Merge Sort): ");
for(int i =0;i<n;i++)
{
System.out.println(a[i]+ " ");
}
System.out.println("Time Complexity (ms) for n= "+n+" is: "+(double)elapsedTime/1000000);
input.close();
}
public static void MergeSortAlgorithm(int low,int high)
{
int mid;
if(low<high)
{
mid=(low+high)/2;
MergeSortAlgorithm(low,mid);
MergeSortAlgorithm(mid+1,high);
Merge(low,mid,high);
}
}
public static void Merge(int low,int mid,int high)
{
int[] b=new int[MAX];
int i,h,j,k;
h=i=low;
j=mid+1;
while((h<=mid)&&(j<=high))
if(a[h]<a[j])
b[i++]=a[h++];
else
b[i++]=a[j++];
if(h>mid)
for(k=j;k<=high;k++)
b[i++]=a[k];
else
for(k=h;k<=mid;k++)
b[i++]=a[k];
for(k=low;k<=high;k++)
a[k]=b[k];
}
}