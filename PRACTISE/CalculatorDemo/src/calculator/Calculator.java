package calculator;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Calculator {

	
	public static void main(String[] args) throws IOException {
		
		System.out.print("Enter Expression : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String expression = br.readLine().replaceAll("\\s","");	
        try{
        	System.out.println("Result: "+evaluate(expression));
        }catch(Exception e) {e.printStackTrace();}
	}
	
public static String evaluate(String expression){
		
		char[] tokens = expression.toCharArray();
		Stack<Double> values = new Stack<>();
		Stack<Character> operators = new Stack<>();
		
		for(int i=0; i<tokens.length; i++) {
			 
			  if((tokens[i]>='0' && tokens[i]<='9') || tokens[i]=='.'){
				  
				  StringBuffer buf = new StringBuffer();
				  
				  while((tokens[i]>='0' && tokens[i]<='9') || tokens[i]=='.'){
					  
					  buf.append(tokens[i]);
					  i++;
					  if(i==tokens.length) break;
				  }
				  values.push(Double.parseDouble(buf.toString()));
				  i--;
				  
			  
			  }
			  else if(isOperator(tokens[i])){
				  
				  try{
				  while(!operators.empty() && 
						  checkPrecedence(operators.peek(),tokens[i]))
					  values.push(doCalculation(values.pop(),
							  values.pop(),operators.pop()));				  		  
				  		
				  }catch(Exception e) {return "Error";}		
				  
				  operators.push(tokens[i]);
			  }
			  
		}//end of for loop
		
          try{
		  while(!operators.empty())
			  values.push(doCalculation(values.pop(),
					                    values.pop(), 
					                    operators.pop()));
		  
          }catch(Exception e){ return "Error";}
		
         String res = values.pop().toString();
         String[] b = res.split("\\.");
         if(b[1].equalsIgnoreCase("0"))
        	 return b[0];
         
		return res;
	}
	
	
	public static double doCalculation(double b, double a, char operator){
		
		switch(operator){
		
		case '+':
            return a + b;
        case '-':
            return a - b;
        case '*':
            return a * b;
        case '/':
            if (b == 0)
                throw new
                UnsupportedOperationException("Cannot divide by zero");
            return a / b;		
		}
		
		return 0;
	}
	
	public static boolean checkPrecedence(char stackChar,char inputchar){
		
		if(precedence(stackChar) >= precedence(inputchar))
			return true;
		
		return false;
	}

	public static boolean isOperator(char c){
		
		if (c == '+' || c == '-' ||  c == '*' || c == '/')
			return true;
		
		return false;
	}
	
	public static int precedence(char c){
		
		if(c == '*' || c == '/') return 2;
		if(c == '+' || c == '-') return 1;
		
		return 0;
	}
	
}
