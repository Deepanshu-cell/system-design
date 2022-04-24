public class Main{
    
    public static class complexNumber{
        int real;
        int imaginary;
        
        // 'this' points to current object , which calls the function and 'this' passes as a default args
        void add(complexNumber c){
            this.real = this.real + c.real;
            this.imaginary = this.imaginary + c.imaginary;
        }
        
        void multiply(complexNumber c){
            int real = (this.real*c.real) - (this.imaginary*c.imaginary);
            int imaginary = (this.real*c.imaginary) + (this.imaginary*c.real);
            this.real = real;
            this.imaginary = imaginary;
        }
        
        void print(){
            System.out.println(this.real+" + i"+this.imaginary);
        }
    }
    
    public static void main(String[] args){
        // creating new object
        complexNumber c = new complexNumber();
        c.real = 3;
        c.imaginary = 4;
        // c.print(); //print
        
        // add
        complexNumber c1 = new complexNumber();
        c1.real = 5;
        c1.imaginary = 6;

        c.multiply(c1);
        c.print();
    }
    
}