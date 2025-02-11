// Efficiency: When you use the + operator for strings, 
// Java creates a new String object each time because strings 
// are immutable. This can be inefficient if you do a lot of concatenation.
// StringBuilder, on the other hand, allows you to modify the contents 
// without creating new objects, making it more efficient for repeated concatenation.

// Insert: You can insert a string at a specific index using sb.insert(index, "text");.
// Delete: You can remove a part of the string using sb.delete(startIndex, endIndex);.
// Reverse: You can reverse the entire string using sb.reverse();.

public class stringBuilder {
    public static void main(String[] args) {

        // create a StringBuider instance
        StringBuilder sb = new StringBuilder();

        // Append some words to the StringBuilder
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        sb.append("!");

        // Convert the StringBuilder to string 
        String result = sb.toString();

        // Print the resulting string
        System.out.println(result);
    }
}
 