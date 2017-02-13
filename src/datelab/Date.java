package datelab;



/**
 *
 * @author tuf67096
 */
public class Date {
    int year;
    int day;
    int month;

public Date(int a, int b, int c){
    this.year = a;
    this.month = b;
    this.day = c;
}

public int daysTo(Date d){
    int numDays = 0;
    //day a 
    int x = d.year* 365;
    int y = d.month*30;
    int z = d.day;
   
    int q = this.year *365;
    int w = this.month * 30;
    int e = this.day;
    
    int aDay = x+ y + z;
    int dDay = q+w+e;
    
    numDays = aDay - dDay;
return numDays;    
}

}