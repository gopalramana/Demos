
public class SpringSpilt {

	public static void main(String[] args) {

		String lsterrorcode=new String();
        lsterrorcode=lsterrorcode.concat("22");
		lsterrorcode=lsterrorcode.concat("~");
		 lsterrorcode=lsterrorcode.concat("23");
			lsterrorcode=lsterrorcode.concat("~");
			 lsterrorcode=lsterrorcode.concat("24");
				lsterrorcode=lsterrorcode.concat("~");

        String[] spilt=lsterrorcode.split("~");
        for (int i = 0; i < spilt.length; i++) {
			System.out.println("nn"+spilt[i]);
		}
        
        
		
	}

}
