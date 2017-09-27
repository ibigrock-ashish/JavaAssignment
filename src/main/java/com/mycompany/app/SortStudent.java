package assignment;
import java.util.Comparator;

public class SortStudent implements Comparator<Student> {

//	public int compare(Pokemon a, Pokemon b) {
//		
//		Integer i1= (a.getPower());
//        Integer i2= (b.getPower());
//        System.out.println(i1+"    "+i2);
//       
//        int sComp =i1.compareTo(i2);
//System.out.println("========================   "+sComp);
//        if (sComp != 0) {
//           return i2-i1;
//        } else {
//        	String x1 = (a.getName());
//            String x2 = (b.getName());
//           return x1.compareTo(x2);
//        }
//       
//		}
//	public int comp() {
//		return 1;
//	}
	@Override
	public int compare(Student a, Student b) {
		Integer i1= (a.getAge());
        Integer i2= (b.getAge());
        System.out.println(i1+"    "+i2);
        
        String x1 = (a.getName());
        String x2 = (b.getName());
        int nc=x1.compareTo(x2);
       
        int sComp =i1.compareTo(i2);
System.out.println("========================   "+sComp);
        if (sComp != 0) {
           return i2-i1;
        }
        if(nc !=0)
        {
        	return nc;
        }
        else {
        	Integer id1= (a.getId());
            Integer id2= (b.getId());
        	
           return id1.compareTo(id2);
        }
		
	}

}

