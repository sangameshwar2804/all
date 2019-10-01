package Com.wbl.main;

public class Homepage1 {

	public String signup() {
		System.out.println("Homepage-Click  signup");
		return "registration-sucess";
	}

	public String login() {
		System.out.println("Homepage-Click Login");
		return "Login Sucess";
	}

	public String doSearch() {
		System.out.println("Homepage-Click  search");
		return "Enter valu in SearchBox";
	}

	public String laptopPage() {
		System.out.println("chose the laptop from this page");
		return "add-to-cart";
	}
}
