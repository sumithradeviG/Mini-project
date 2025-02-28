package Calculator;

import java.util.*;

public class Calculation {
    public static boolean isOperator(char operator){
        switch (operator) {
            case '+': return true;
            case '-': return true;
            case '*': return true;
            case '/': return true;
            case '^': return true;
            case '(': return true;
            case ')': return true;
            default : return false;
        }
    }

    public static int getPrecedance(char operator)
    {
        switch (operator) {
            case '(': case ')': return 4;
            case '^':  return 3;
            case '*': case '/': return 2;
            case '+': case '-': return 1;
            default:  return -1;
        }   
    }

    public static boolean checkPrecedance(char preOperator, char currOperator){
        if(preOperator == '('){
            return true;
        }
        int prevOpPreced = getPrecedance(preOperator);
        int currOpPreced = getPrecedance(currOperator);
        return currOpPreced > prevOpPreced ? true : false;
    } 
    public static void main(String[] args) {
        String expression = "a+b*c-d/e^f";
        String postFixExp = "";
        Stack<Character> st = new Stack<>();

        for(int i=0; i<expression.length(); i++){
            String temp = "";
            if(expression.charAt(i) >= 0 && expression.charAt(i) <=9){
                temp += expression.charAt(i);
            }
            else if(isOperator(expression.charAt(i))){
                if(st.empty()  || st.peek() == '(' || expression.charAt(i) == '(' ){
                    st.push(expression.charAt(i));
                }
                else if(expression.charAt(i) == ')'){
                    while (st.peek() != '(' && !(st.empty())) {
                        postFixExp += st.pop();
                    }
                    st.pop();
                }
                else{
                    char preOperator = st.peek();
                    while (!checkPrecedance(preOperator, expression.charAt(i)) && !(st.empty())) 
                    {
                        postFixExp += st.pop();
                        preOperator = st.peek();
                    }
                    st.push(expression.charAt(i));
                }
            }
        }


    }
}
