public class Report5{
    public static void main(String[] args){
        String str = "百二十三";
        try{
            int value = Integer.parseInt(str);
            System.out.println(value);
        }catch(NullPointerException e){
            System.out.println("NullPointerExceptionが発生");
            System.out.println(e.getMessage());

        }

           
        
    }

}
    
