import java.util.List;


public class SeatingChart
{

	private Student[][] seats;
	

	public SeatingChart(List<Student> studentList, int rows, int cols)
	{ 
	  int index = 0;
	  seats = new Student[rows][cols];
	  for(int r = 0; r<cols; r++){
	    for(int c = 0; c<rows; c++){
	      if(index<studentList.size()){
	        //printSeatingChart();
	        seats[c][r] = studentList.get(index);
	        index++;
	      }
	    }
	  }
	}
	
	
	public int removeAbsentStudents(int allowedAbsences)
	{ 
		int removed = 0;
		for(int r = 0; r<seats.length; r++){
	    for(int c = 0; c<seats[r].length; c++){
	      if(seats[r][c]!=null && seats[r][c].getAbsenceCount()>allowedAbsences){
	        seats[r][c] = null;
	        removed++;
	      }
	    }
	  }
	  return removed;
	}

	
	public void printSeatingChart()
	{
		for(int r=0; r < seats.length; r++)
		{
			for(int c=0; c < seats[r].length; c++)
			{
				if( seats[r][c] != null )
					System.out.print( seats[r][c].getName() + seats[r][c].getAbsenceCount() + "\t\t");
				else
					System.out.print( "null" + "\t\t");
			}
			System.out.println();
		}
	}
	
	public String getSeatInfo(int r,int c)
	{
		if( seats[r][c] != null )
			return seats[r][c].getName() + seats[r][c].getAbsenceCount();
		else
			return null;
	}
}
