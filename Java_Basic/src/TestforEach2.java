import java.util.Arrays;
import java.util.List;

public class TestforEach2 {

	public static void main(String[] args) {
		

	   Arrays.stream(DenominationsEnum.values()).forEach((e) -> { System.out.println(e.getSelectedCurrency()); });
	  System.out.println( Singleton.INSTANCE1);
	  System.out.println( Singleton.INSTANCE1);
	  System.out.println( Singleton.INSTANCE1);
}
}