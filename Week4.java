
public class Week4{

    public static void main(String[] args) {
        // Declare the array named called ages
        int[] ages = new int[8]; // Specify the number of values in the array

        // Initialize the array with specific values
        ages[0] = 3; 
        ages[1] = 9;
        ages[2] = 23;
        ages[3] = 64;
        ages[4] = 2;
        ages[5] = 8;
        ages[6] = 28;
        ages[7] = 93;

        // Subtract the first element from the last element
        int result = ages[ages.length - 1] - ages[0];

        // Print the result
        System.out.println(result);

        int[] ages2 = new int[9]; // new declaration with size 9
        
        ages2[0] = 4; 
        ages2[1] = 7;
        ages2[2] = 25;
        ages2[3] = 56;
        ages2[4] = 1;
        ages2[5] = 45;
        ages2[6] = 33;
        ages2[7] = 65;
        ages2[8] = 50;
        
        int result2 = ages2[ages2.length - 1] - ages[0]; 
        // Same as the 1st Arary ages / Subtract
        // the first element from the last element
        
        System.out.println(result2); //Printing result for Ages2 
        
        int sum = 0;//   hold the sum for the ages int variable
        
        for (int age2 : ages) {
            sum += age2; // Using the sum variable
        }
        
        double average = (double) sum / ages2.length;
        // Using a double allows the Vaiable to be defined a 55.5 average age.  
        
        // Printing the average age
        System.out.println(average);
    
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
        
        // Variable to hold the total number of characters
        int charTotal = 0;
        
        //   Iterate the array names with the CharTotal
        // with each length of each name to the total
        
        for (String name : names) {
            charTotal += name.length(); 
        }

        // Using a double for average number of characters per name
        double Average = (double) charTotal / names.length;
        
        // Printing  the average number of characters per name
        System.out.println(Average);
        
        // Using Stringbulder and a Variable to hold the concatenated names
        StringBuilder conNames = new StringBuilder();
        
        // Requested  a loop Iterate through the array to concatenate the names
        for (int i = 0; i < names.length; i++) {
            conNames.append(names[i]); 
            if (i < names.length - 1) { 
                conNames.append(" "); 
            }
        }
        // Convert using StringBuilder
        String result3 = conNames.toString();
        
        // Printing conNames variable Result2
        System.out.println(result3);
        
        //Q3. Using (length - 1) is way to access the last ellement of an array
        
        //Q4. Using numbers[0] for int firstElement = numbers[0] as Java Starts courts
        // begining with Zero 
        
        
        // Iterate over the previously created names array
        int[] nameLengths = new int[names.length]; 
        
        // Q5 Loop to iterate names array and add the length of each name to nameLengths
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length(); 
            
            
        }
        
        // Variable to hold the sum of lengths
        int sumNames = 0;
        
        // Q6  This iterate a Loop nameLengths array OVER and total sum
        //  Add each length to variable sumNames
        for (int i = 0; i < nameLengths.length; i++) {
            sumNames += nameLengths[i]; 
            
        }
        
        System.out.println(sumNames);
        
        //Q7. Write a method that takes a String, word, and an int, n, as arguments and 
        //returns the word concatenated to itself 3  times.
        
        String word = "Hello";
        int n = 3;
        
       
        System.out.println(repeatWord(word, n));
        
       
        
        //Q8 Prints   firstName and lastName with a space
        
        
        String firstName = "John";
        String lastName = "Smith";
       
        System.out.println(fullName(firstName,lastName));
        
        
        //Q9 method that takes an array of int and returns true 
        // if the sum of all the ints in the array is greater than 100.
        
        int[] numbers1 = {20, 27, 10, 23};
        int[] numbers2 = {23, 27, 30, 50};
        
        System.out.println(greaterThan100(numbers1));
        System.out.println(greaterThan100(numbers2));
        
        // 10 Write a method that takes an array of double and 
        // returns the average of all the elements in the array.
        
        double[] num = {2.3, 2.9, 31.6, 24.2};
        System.out.println(calculateAverage(num));
        
        
        // Q11 Write a method that takes two arrays of double and returns true if
        // the average of the elements in the first array is 
        // greater than the average of the elements in the second array.
        
        double[] num1 = {25.5, 2.7, 31.8, 21.2};
        double[] num2 = {2.1, 1.9, 21.6, 44.7};
        
        
        // Q12 12. Write a method called willBuyDrink that takes a boolean isHotOutside,
        //and a double moneyInPocket, and returns true if it is hot outside and 
        //if moneyInPocket is greater than 10.50.


        
        double moneyInPocket = 10.50;
        
        System.out.println(willBuyDrink(true,moneyInPocket));  // Output: true
        System.out.println(willBuyDrink(false,moneyInPocket));  // Output: false
        
       
        
        //
        
    
        System.out.println("The fortune cookie says: " + printFortuneCookie());
         
        
        
  
} // END OF MAIN 
//Q13 My on Method to create
    public static String printFortuneCookie() {
        String[] FortuneCookie= {
                "You learn Java code.",
                "Leaning Coding is in the write dirrection.",
                "Greeting Profeesor Falken!.",
                "Whould you like to play a game of Chess.",
                "Believe you can, and you're halfway there."
            };

        int randomIndex = (int) (Math.random() * FortuneCookie.length);
        return FortuneCookie[randomIndex];

        
    }
   // Question 12 extra method
   public static boolean willBuyDrink(boolean HotOutside, double moneyInPocket) {
        return moneyInPocket > 10.50 && HotOutside; // Return true if conditions are met   
        
        
    }
    // Questions 7 extra method
    
     public static String repeatWord(String word, int n) {
        StringBuilder result3 = new StringBuilder();
    
        // Loop to append "Hello" n times
        for (int i = 0; i < n; i++) {
            result3.append(word);
        }

        return result3.toString();
    }
    
    // Questions 8 Extra method 
    
     public static String fullName(String firstName, String lastName){

            return firstName + " " + lastName;}
    
    // Question 9 Extra Method
    
    public static boolean greaterThan100 (int[] numbers){
        int sum2 = 0;
        
        for (int num : numbers) {
            sum2 += num;
        }
            
        return sum2 > 100;
    }
    //Question 10 Extra method
    
    public static double calculateAverage(double[] nums) {
        double sum = 0.0; // Initialize sum to 0

        // Calculate the sum of the array elements
        for (double num : nums) {
            sum += num; // Add each num to sum
        }
        
    
        return sum / nums.length;  // Divided sum by the number of elements
                                       
        
    
    }
  // Question 11 Extra Method 
  
  public static  boolean calculateAverage2(double[]nums1,double[]nums2) {

    
        return calculateAverage(nums1)>calculateAverage(nums2);
    }
    
}