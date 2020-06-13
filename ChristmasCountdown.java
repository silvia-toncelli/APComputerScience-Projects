import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
class Main {
  public static void main(String[] args) {
    System.out.print(getChristmasCountdown());
  }
    
  public static int getChristmasCountdown(){
    SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
    Calendar cal = Calendar.getInstance();
    int d= cal.get(Calendar.DATE);
    int m= cal.get(Calendar.MONTH)+1;
    int y= cal.get(Calendar.YEAR);
    String ms=Integer.toString(m);
    String ds=Integer.toString(d);
    if (m<10)
    {
      ms="0"+Integer.toString(m);
      //System.out.println(ms);
    }
    if(d<10) {
      ds="0"+Integer.toString(d);
      //System.out.println(ds);
    }

    String dateBeforeString =ds+" "+ms+" "+y;
    String dateAfterString = "25 12 2019";
    float daysBetween=0;
    try{
     Date dateBefore = myFormat.parse(dateBeforeString);
     Date dateAfter = myFormat.parse(dateAfterString);
     long difference = dateAfter.getTime() - dateBefore.getTime();
     daysBetween = (difference / (1000*60*60*24));
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    return (int) daysBetween;
    }
    
}