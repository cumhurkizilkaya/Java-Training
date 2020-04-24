public class Q46 {

public Q46 youngestChild;
public static void main(String... args) {
	Q46 elena = new Q46();
	Q46 diana = new Q46();
	elena.youngestChild = diana;
	diana = null;
	Q46 zoe = new Q46();
	elena.youngestChild = zoe;
	zoe = null;
}

}
