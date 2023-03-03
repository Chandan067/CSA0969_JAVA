class armstrong {
public static void main(String[] args) {
int num = 152, orgnum, r, result = 0;
orgnum = num;
while (orgnum != 0)
{
r = orgnum % 10;
result += Math.pow(r, 3);
orgnum /= 10;
}
if(result == num)
System.out.println(num + " is an armstrong number.");
else
System.out.println(num + " is not an armstrong number.");
}
}