public class Main
{
  
  //expr  ->  expr  [arithmetic_op] expr
private static int arithmetic_op(){
      
		  int a=5,b=7,c=11,d=-13,e=-2;

      int expr1= a*b;
      int expr2= b/c;
      int expr3= c + d;
      int expr4= d + e;
		   return expr1;
		}

//expr  ->  expr[ unary_op] expr
private static int unary_op(){
int a=5,b=7,c=11,d=-13,e=-2;
      int expr1= -d;
      int expr2= +b;
 return expr1;

}

//expr  ->  expr  [logic_op] expr

public boolean logic_op(){

int a=5,b=7,c=11,d=-13,e=-2;
if (b > a || c < d) 
     return true;
   else
   return false;
 
}

//expr  ->  expr [Bitwise_op] expr
private static int bitwise_op(){
int a=5,b=7,c=11,d=-13,e=-2;
     //XOR ,  ~| 
      int expr1= d ^ e;
     //AND , &  
      int expr2= c & e;
 return expr2;

}

//expr  ->   expr [relational_op] expr
private static String relational_op(){
  int a=5,b=7,c=11,d=-13,e=-2;

  if(a>b)
  return "a is greater than b";
  if(a<b)
  return "a is less than b";
  if(b>=c)
  return "b is greater than or equal c";
  if(b<=e)
  return "b is less than or equal e";
 

  return "No Condition fulfilled";
}
//expr  ->  expr [assign] expr
private static int assign(){
int a=5,b=7,c=11,d=-13,e=-2;
a=e;
c/=d;
return c;

}
//expr  ->  expr [mod] expr
private static int mod(){
int a=5,b=7,c=11,d=-13,e=-2;
int expr1= d%b;
return expr1;
}

//var  ->   var [postfix_op]
private static int postfix_op(){
int a=5,b=7,c=11,d=-13,e=-2;
b++;
d--;
return b;
}

// var  -->  [prefix_op] var
private static int prefix_op(){
int a=5,b=7,c=11,d=-13,e=-2;

--e;
++c;
return e;
}

//NOT_op -> “!”
private static String NOT_op(){
int a=5,b=7,c=11,d=-13,e=-2;

if (a!=b)
return "not equal";

 return "No Condition fulfilled";
}
	public static void main(String[] args) {
   System.out.println("<Arithmetic_op>"+arithmetic_op());
   System.out.println("<Unary_op>"+unary_op());
   Main m =new Main();
   System.out.println("<Logoic_op>"+m.logic_op());

  System.out.println("<Bitwise_op>"+bitwise_op());
  System.out.println("<Relational_op>"+relational_op());
   System.out.println("<Assign_op>"+assign());
   System.out.println("<MOD_op>"+mod());
	System.out.println(postfix_op()+"<Post_op>");	 
  System.out.println("<Pre_op>"+prefix_op());
  //Main l =new Main();
  System.out.println("<NOT_op>"+NOT_op());
	}
}
