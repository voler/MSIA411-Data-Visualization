import java.io.*;
import java.util.Arrays;

public class US_AID_TRANS {

  	public static void main(String[] args) {
			String fileName= "C:/Users/voler_000/Dropbox/Northwestern/Study Quarter 3/MSIA411 Data Visualization/Visualization FInal Project/data/SASrawdata/FULL.csv";
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
				int numrow = 22;
				String[][] indicator = new String[52][24];
label1:
				while(line != null)
				{
					for (int i=0;i<numrow;i++)
						{
							line = inputreader.readLine();
							if (line == null)
								{
								break label1;
								}
							//System.out.print(line+"\n");
							String[] data = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)",-1);
							System.out.print(data.length+"\n");
							String selecteddataline = Arrays.toString(data);
							System.out.print(selecteddataline+"\n");
								for (int j=2;j < data.length;j++)
								{
									System.out.print(data.length);
									indicator[j-2][0]= data[0];
									indicator[j-2][1]= String.valueOf(1960+j-2);
									indicator[j-2][i+2]= data[j];																		
								}
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
