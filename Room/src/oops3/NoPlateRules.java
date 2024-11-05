package oops3;
public interface NoPlateRules {
	public String displayFontStyle(String a);
	public int displayFontSize(int a);
	public String displayNoPlateColor(String a);
	public String displayStateCode(String a);
	//public String usage(String a);
	}
abstract class CentralGovernment implements NoPlateRules {
	public String displayFontStyle(String a) {
		return a;
	}
	public int displayFontSize(int a) {
		return a;
	}
}
class Tamilnadu extends CentralGovernment {
	public String displayNoPlateColor(String a) {
		return a;
	}
	public String usage(String a) {
		if(a.equals("private")) {
			return "black with white";
		}
		if(a.equals("public")) {
			return "black with yellow";
		}
		if(a.equals("electric")) {
			return "green with white";
		}
		else {
		return "invalid";
		}
	}
	public String displayStateCode(String a) {
		return a;
	}
}
