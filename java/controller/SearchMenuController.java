package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 参考
 * https://www.tsuzukanai.com/spring-boot-parameter/
 * https://zenn.dev/peishim/articles/5b3f4f83dc5122
 */

@Controller
@RequestMapping("/request")
public class SearchMenuController {
	
	// アクセスする際に使用するURLを設定
	@PostMapping("/menu_search")
	public String menu_search(Model model)
	{
		model.addAttribute("date", "2024/08/25");
		model.addAttribute("total", "500");
		return "exec/menu_result";
	}
}
