
    
    public class complexNumbers{
        int real;
        int imaginary;
        static int count;
//        static functions and variables are those which are common to all the class like count here because it is not specific to an object
        public complexNumbers() {
        	count++;
        }
        
        public int getCount() {
        	return count;
        }
        
        
        // 'this' points to current object , which calls the function and 'this' passes as a default args
        void add(complexNumbers c){
            this.real = this.real + c.real;
            this.imaginary = this.imaginary + c.imaginary;
        }
        
        void multiply(complexNumbers c){
            int real = (this.real*c.real) - (this.imaginary*c.imaginary);
            int imaginary = (this.real*c.imaginary) + (this.imaginary*c.real);
            this.real = real;
            this.imaginary = imaginary;
        }
        
        void print(){
            System.out.println(this.real+" + i"+this.imaginary);
        }
    
    
    public static void main(String[] args){
        // creating new object
    	complexNumbers c = new complexNumbers();
        c.real = 3;
        c.imaginary = 4;
        // c.print(); //print
        
        // add
        complexNumbers c1 = new complexNumbers();
        c1.real = 5;
        c1.imaginary = 6;

        c.multiply(c1);
        c.print();
        
        
        System.out.println(c.getCount());
    }
    
    }
    
