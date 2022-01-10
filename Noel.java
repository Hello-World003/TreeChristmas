public class Noel {
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<=15;i++)
        {
            for(int j=0;j<=9;j++)
            {
                if((i==1 && j==4) ||(i==2 && j>2 && j<6)|| (i==4 &&j>1 && j<7) || (i==7 && j>0 && j<8) || (i+j==8 && j>0 && j<6 && i>1 && j<8) || (j-i==0 && j>2 && j<8 && i>1 && i<8) || (i+j==11 && j>=0 && j<5 && i>6 && i<12) || (i-j==3 && i>6 && i<12 && j>3 && j<=8) || (i==11 && j<=8 && j>=0))
                {
                    System.out.print("*"+" ");
                }
               else if((j>2 && j<6) && i>=12)
               {
                System.out.print("*"+" ");
               }
                else if(i==0 && j==4)
            {
                System.out.print("★"+" ");
            }
                else{
                System.out.print(" "+" ");
            }

                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
        System.out.println();
        String s="☃ Merry Christmas ☃";
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i));
            Thread.sleep(300);
        }
        System.out.println("\nChúc mọi người có một giáng sinh vui vẻ (>‿♥)");
    }
}
