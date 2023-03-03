import java.util.Scanner.*;
class addmat
{
public static void main(String args[])
{
int i,j,sum=0;
int x[][]={{1,2},{3,4}};
int y[][]={{5,6},{7,8}};
int z[][]={{0,0},{0,0}};
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
z[i][j]=x[i][j]+y[i][j];
}
}
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.print(z[i][j]+"   ");
}
System.out.println("");
}
}
}

