public class Fibonacci {

    public int Fibonacci(int index){

        if (index == 0 || index == 1){
        return index;
        } else {
            return Fibonacci(index - 1 ) + Fibonacci(index - 2);
        }


    }
}


///Fibonacci
//Write a function that computes a member of the fibonacci sequence by a given index
//Create tests for multiple test cases
//{F_{n}=F_{n-1}+F_{n-2},}