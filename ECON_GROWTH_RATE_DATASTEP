import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class ECON_GROWTH {

  public static void main(String[] args) {
		String fileName= "C:/Users/voler_000/Dropbox/Northwestern/Study Quarter 3/MSIA411 Data Visualization/Visualization FInal Project/data/CSV rawdata/Economy Growth Rate 1960-2011.csv";
		String fileout = "Output.csv";
		
		try{
			BufferedWriter outputwirter = new  BufferedWriter(new FileWriter(fileout));
			String line = new String();
			//define the input reader
			BufferedReader inputreader = new BufferedReader(new FileReader(fileName));
			//header
			line = inputreader.readLine();
			System.out.print(line+"\n");
			//18 rows as a matrix
			int numrow = 1;
			String[][] indicator = new String[52][4];
			while((line = inputreader.readLine()) != null)
			{
				for (int i=0;i<numrow;i++)
					{
//						System.out.print(line+"\n");
						String[] data = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)",-1);
						System.out.print(data.length+"\n");
						String selecteddataline = Arrays.toString(data);
						System.out.print(selecteddataline+"\n");
							for (int j=2;j < data.length;j++)
							{
								System.out.print(data.length);
								indicator[j-2][0]= data[0];
								indicator[j-2][1]= data[1];
								indicator[j-2][2]= String.valueOf(1960+j-2);
								indicator[j-2][i+3]= data[j];																		
							}
							//line = inputreader.readLine();
							//if (line == null)
							//{
								//break;
							//}
					}
				for (int k =0;k<52;k++)
					{
						String selecteddataline = Arrays.toString(indicator[k]);
						selecteddataline=selecteddataline.replaceAll("\\[","").replaceAll("\\]","");
						outputwirter.write(selecteddataline);
						outputwirter.newLine();
					}
			}
					
			inputreader.close();
			outputwirter.close();
			
		}
		catch(IOException ex)
			{System.out.println("Could not writing to file '" + fileout + "'");}
	}
}
