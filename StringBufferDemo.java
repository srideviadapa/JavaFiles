class StringBufferDemo
{
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer("Hi,");
        sb.append("Hello!");
        sb.append("Good Morning"); //adds at end of string
        sb.append(" Welcome Sri Devi");
        System.out.println("Append "+sb);
        sb.insert(8,'@');          //adds at particular location
        System.out.println("Insert "+sb);
        sb.replace(9,14,"Bad");     //replaces the string
        System.out.println("Replace "+sb);
        sb.deleteCharAt(8);         //deletes char at particular position
        System.out.println("Delete Char At "+sb);
        sb.reverse();
        System.out.println("Reverse "+sb);
    }
}

