import java.util.Arrays;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class String2 {
    public static void main(String[] args) {
        System.out.println(45);
        /*this will print 45 bcs println calls "value of" and the "value of" will call"to String" hence 
         * this will convert into String
         */
        System.out.println(new int[]{1,2,3,4,5});
        /*
        * bcs again println->value of->toString --this toString will check if the object contains null or not
         * if it doesnot contains null then -
         * this will return an address which consisting of some character+@+hashcode
         * bcs it calls the dafault toString method 
         * how do java know which type of conversion for object
         * so basically above is an array so we call the Arrays.toString method which shows the array
         * 2nd if the obejct contains null then it will simply shows null
         */
        System.out.println(Arrays.toString(new int[]{2,3,4,5,6,7,8,9}));
        String s=null;
        System.out.println(s);
    }
    
}
