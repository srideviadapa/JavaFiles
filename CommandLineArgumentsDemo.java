import java.io.*;
class CommandLineArgumentsDemo
{
	public static void main(String args[]) throws IOException
	{
		File f1=new File("Command Line Arguments Demo.txt");
		if(!f1.exists())
		{
			System.out.println(f1.createNewFile());
		}
		BufferedWriter bw=new BufferedWriter(new FileWriter("Command Line Arguments Demo.txt"));
		bw.write("First Number "+Integer.parseInt(args[0]));
		bw.write("Second Number "+Integer.parseInt(args[1]));
		bw.write("Addition of both the numbers = "+(Integer.parseInt(args[0])+Integer.parseInt(args[1])));
		System.out.println("Addition of both the numbers = "+(Integer.parseInt(args[0])+Integer.parseInt(args[1])));
		bw.close();
		
	}
}