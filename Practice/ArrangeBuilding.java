/**
 * ArrangeBuilding
 */
import java.util.*;
public class ArrangeBuilding {
public static void main(String [] args)
{
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
long ans =  countBuildingArragement(n);
System.out.println(ans);
}
public static long countBuildingArragement(int n)
{
    int nosAt1  =1;//no. of spaces
    int nobAt1 =1; //no.of building
    for(int i =2;i<=n;i++)
    {
        int nos = nosAt1+nobAt1;
        int nob = nosAt1;
        nosAt1 =nos;
        nobAt1 =nob;
    }
    long ans = nosAt1+nobAt1;
    return (long)(ans*ans);
} 
}