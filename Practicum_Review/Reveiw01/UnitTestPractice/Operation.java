package Practicum_Review.Reveiw01.UnitTestPractice;

public class Operation {
    public static double performOperation(char sign, int n1, int n2){
        // perform the appropriate operation
        if (sign == '+'){
            return n1 + n2;
        } else if (sign == '-'){
            return n1-n2;
        } else if (sign == '*' || sign == 'x'){
            return n1*n2;
        } else if (sign == '/'){
            return n1/n2;
        }

        // otherwise return nothing
        return 0;
    }
}
