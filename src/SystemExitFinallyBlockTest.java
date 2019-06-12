
public class SystemExitFinallyBlockTest {
	

	public static void main(String[] args) {
		try {
			int a = 10 / 0;
			System.out.println(a);
		} catch (Exception e)

		{
			e.printStackTrace();
		//	System.exit(0);

		} finally {

			System.out.println("chakde");
		}
	}

}
