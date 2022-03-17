public class Replace {
    public static void main(String[] args) {
        String seat = "____UUUUUUUUUUUUUUUUUUUUUUUU00070008000900100011RRRRRRRRRRRRRRRR____////";
        String replace = "";
        for(int a = 0; a<seat.length();a=a+4)
        {
            if(seat.substring(a, a+4).equals("0008"))
            {
                seat = seat.substring(0,a)+"UUUU"+seat.substring(a+4) ;
            }
        }
        System.out.println(seat);

    }
    
}
