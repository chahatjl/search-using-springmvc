package springsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/home")
	public String hom()
	{
		System.out.println("going to home");
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView view(@RequestParam("querybox") String query)
	{
		String url="https://www.google.com/search?q="+query;
		
		RedirectView rv=new RedirectView();
		rv.setUrl(url);
		return rv;
	}

}
